package com.moonunder.common.core.query;

import java.util.Optional;
import lombok.Data;

/**
 * @author simon
 */
@Data
public class PageQuery<T> {
  Optional<T> condition;
  int pageSize;
  int pageNum;
}
