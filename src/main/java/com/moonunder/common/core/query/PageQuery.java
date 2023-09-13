package com.moonunder.common.core.query;

import lombok.Data;

/**
 * @author simon
 */
@Data
public class PageQuery<T> {
  T condition;
  int pageSize;
  int pageNum;
}
