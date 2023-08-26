package com.moonunder.domain.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moonunder.common.core.page.PageDTO;
import com.moonunder.domain.demo.db.DemoEntity;
import com.moonunder.domain.demo.db.DemoMapStruct;
import com.moonunder.domain.demo.db.DemoService;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.query.DemoQuery;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author simon
 */
@Service
@RequiredArgsConstructor
public class DemoApplicationService {
  private final DemoService demoService;

  public PageDTO<DemoDTO> getDemoList(DemoQuery demoQuery) {
    Page<DemoEntity> page = demoService.page(demoQuery.toPage(), demoQuery.tQueryWrapper());
    List<DemoDTO> records = DemoMapStruct.INSTANCE.demoListConvert(page.getRecords());
    return new PageDTO<>(records, page.getTotal());
  }
}
