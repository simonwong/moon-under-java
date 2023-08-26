package com.moonunder.domain.demo.dto;

import com.moonunder.common.enums.common.YesOrNoEnum;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author simon
 */
@Data
@AllArgsConstructor
public class DemoDTO {
  private String demoName;

  private Long demoId;

  private String demoType;

  private YesOrNoEnum active;

  private Date createTime;
}
