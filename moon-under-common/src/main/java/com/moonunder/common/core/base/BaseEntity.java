package com.moonunder.common.core.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Entity 基类
 * @author simon
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T extends Model<?>> extends Model<T> {
  // 创建者ID
  @TableField(value = "creator_id", fill = FieldFill.INSERT)
  private Long creatorId;

  // 创建时间
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  private Date createTime;

  // 更新者ID
  @TableField(value = "updater_id", fill = FieldFill.UPDATE)
  private Long updaterId;

  // 更新时间
  @TableField(value = "update_time", fill = FieldFill.UPDATE)
  private Date updateTime;
}
