package com.moonunder.domain.demo.dto;

import com.moonunder.common.core.dto.BaseDTO;
import com.moonunder.common.enums.common.YesOrNoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author simon
 */
@Data
@AllArgsConstructor
public class DemoDTO extends BaseDTO {
  private String demoName;

  private Long demoId;

  private String demoType;

  private YesOrNoEnum active;

  private String remark;
}
