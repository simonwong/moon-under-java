package com.moonunder.common.core.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

  public PageDTO(Page<T> page) {
    this.records = page.getRecords();
    this.total = page.getTotal();
  }

  public PageDTO(List<T> list, Long count) {
    this.records = list;
    this.total = count;
  }
}
