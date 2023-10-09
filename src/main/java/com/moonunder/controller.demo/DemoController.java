package com.moonunder.controller.demo;

import com.moonunder.common.core.dto.ResponseDTO;
import com.moonunder.common.core.page.PageDTO;
import com.moonunder.common.core.query.PageQuery;
import com.moonunder.domain.demo.DemoApplicationService;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.query.DemoQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon
 */
@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {
  private final DemoApplicationService demoApplicationService;

  @PostMapping("/list")
  public ResponseDTO<PageDTO<DemoDTO>> getDemoList(@RequestBody PageQuery<DemoQuery> demoPageQuery) {
    PageDTO<DemoDTO> demoList = demoApplicationService.getDemoList(demoPageQuery);
    return ResponseDTO.ok(demoList);
  }

  @GetMapping("/info/{demoId}")
  public ResponseDTO<DemoDTO> getDemoInfo(@PathVariable("demoId") Long demoId) throws Exception {
    DemoDTO demoDTO = demoApplicationService.getDemoInfoById(demoId);
    return ResponseDTO.ok(demoDTO);
  }

  @PutMapping("/add")
  public ResponseDTO<DemoDTO> addNewDemo(@RequestBody DemoDTO demoDTO) throws Exception {
    DemoDTO demoDtoRes = demoApplicationService.saveOrUpdateDemo(demoDTO);
    return ResponseDTO.ok(demoDtoRes);
  }

  @PutMapping("/update")
  public ResponseDTO<DemoDTO> updateDemo(@RequestBody DemoDTO demoDTO) throws Exception {
    DemoDTO demoDtoRes = demoApplicationService.saveOrUpdateDemo(demoDTO);
    return ResponseDTO.ok(demoDtoRes);
  }

  @DeleteMapping("/delete/{demoId}")
  public ResponseDTO<Boolean> deleteDemo(@PathVariable("demoId") Long demoId) throws Exception {
    demoApplicationService.deleteDemo(demoId);
    return ResponseDTO.ok(true);
  }
}
