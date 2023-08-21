package com.moonunder.admin.controller.demo;

import com.moonunder.admin.service.demo.DemoService;
import com.moonunder.common.core.dto.ResponseDTO;
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
  private final DemoService demoService;

  @GetMapping
  public ResponseDTO<String> getDemo() {
    String txt = demoService.getDemo();
    return ResponseDTO.ok(txt);
  }
}
