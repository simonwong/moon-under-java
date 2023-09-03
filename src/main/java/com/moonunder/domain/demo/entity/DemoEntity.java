package com.moonunder.domain.demo.entity;

import com.moonunder.common.core.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author simon
 */
@Getter
@Setter
@Entity
@Table(name = "demo")
public class DemoEntity extends BaseEntity {
//  @Serial
//  private static final long serialVersionUID = 1L;

  // demo 名称
  @Column(nullable = false, unique = true, length = 64)
  private String demoName;

  // demo id
  @Id
  @GeneratedValue
  private Long demoId;

  // demo 分类
  @Column(nullable = false, length = 64)
  private String demoType;

  // 是否可用
  @Column(nullable = false)
  private Integer active;

  // 备注
  @Column
  private String remark;
}
