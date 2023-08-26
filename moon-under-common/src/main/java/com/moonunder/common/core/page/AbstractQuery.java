package com.moonunder.common.core.page;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.Data;

/**
 * @author simon
 */
@Data
public abstract class AbstractQuery<T> {

  public QueryWrapper<T> tQueryWrapper() {
    QueryWrapper<T> queryWrapper = addQueryCondition();

    return queryWrapper;
  }

  public abstract QueryWrapper<T> addQueryCondition();
}
