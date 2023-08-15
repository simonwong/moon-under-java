package com.moonunder.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon
 */
@RestController()
@RequestMapping("/demo")
public class DemoController {
  @GetMapping
  public String getDemo() {
    return "Hello Demo";
  }
}
