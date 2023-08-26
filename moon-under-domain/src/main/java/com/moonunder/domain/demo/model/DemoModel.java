package com.moonunder.domain.demo.model;

import com.moonunder.domain.demo.db.DemoEntity;
import com.moonunder.domain.demo.db.DemoService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author simon
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class DemoModel extends DemoEntity {
  private DemoService demoService;

  public DemoModel(DemoService demoService) {
    this.demoService = demoService;
  }
}
