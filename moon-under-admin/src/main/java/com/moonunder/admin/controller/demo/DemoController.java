package com.moonunder.admin.controller.demo;

import com.moonunder.common.core.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
  @GetMapping
  public ResponseDTO<String> getDemo() {
    return ResponseDTO.ok("Hello Demo");
  }
}
