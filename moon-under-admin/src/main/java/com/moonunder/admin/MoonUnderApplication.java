package com.moonunder.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author simon
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.moonunder.*")
public class MoonUnderApplication {

  public static void main(String[] args) {
      SpringApplication.run(MoonUnderApplication.class, args);
  }
}