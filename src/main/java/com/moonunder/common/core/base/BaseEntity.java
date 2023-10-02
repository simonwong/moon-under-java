package com.moonunder.common.core.base;

import jakarta.persistence.Column;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity 基类
 * @author simon
 */
@Getter
@Setter
public class BaseEntity {
  // 创建者ID
  @Column
  private Long creatorId;

  // 创建时间
  @Column
  private Date createTime;

  // 更新者ID
  @Column
  private Long updaterId;

  // 更新时间
  @Column
  private Date updateTime;
}
