package com.moonunder.domain.demo.db;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.moonunder.common.core.base.BaseEntity;
import java.io.Serial;
import lombok.Getter;
import lombok.Setter;

/**
 * @author simon
 */
@Getter
@Setter
@TableName("demo")
public class DemoEntity extends BaseEntity<DemoEntity> {
  @Serial
  private static final long serialVersionUID = 1L;

  // demo 名称
  @TableField("demo_name")
  private String demoName;

  // demo id
  @TableId(value = "demo_id", type = IdType.AUTO)
  private Long demoId;

  // demo 分类
  @TableField("demo_type")
  private String demoType;

  // 是否可用
  @TableField("active")
  private Integer active;
}
