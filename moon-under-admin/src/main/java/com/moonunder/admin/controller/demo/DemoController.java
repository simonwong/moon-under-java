package com.moonunder.admin.controller.demo;

import com.moonunder.common.core.dto.ResponseDTO;
import com.moonunder.common.core.page.PageDTO;
import com.moonunder.domain.demo.DemoApplicationService;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.query.DemoQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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

  @GetMapping("/list")
  public ResponseDTO<PageDTO<DemoDTO>> getDemoList() {
    PageDTO<DemoDTO> demoList = demoApplicationService.getDemoList(new DemoQuery());
    return ResponseDTO.ok(demoList);
  }
}
