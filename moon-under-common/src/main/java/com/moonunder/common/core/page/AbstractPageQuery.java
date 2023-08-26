package com.moonunder.common.core.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author simon
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AbstractPageQuery<T> extends AbstractQuery<T> {
//  public static final int MAX_PAGE_COUNT = 200;
//  public static final int MAX_SIZE_COUNT = 500;

  protected Integer pageNum = 1;

  protected Integer pageSize = 10;

  public Page<T> toPage() {
    return new Page<>(pageNum, pageSize);
  }
}
