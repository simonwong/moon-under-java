package com.moonunder.common.core.page;


import java.util.List;
import lombok.Data;

/**
 * @author simon
 */
@Data
public class PageDTO<T> {
  private Long total;

  private List<T> records;

  public PageDTO(List<T> list) {
    this.records = list;
    this.total = (long) list.size();
  }

  public PageDTO(List<T> list, Long count) {
    this.records = list;
    this.total = count;
  }
}
