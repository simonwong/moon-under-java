package com.moonunder.domain.demo;

import com.moonunder.common.core.page.PageDTO;
import com.moonunder.domain.demo.db.DemoMapStruct;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.entity.DemoEntity;
import com.moonunder.domain.demo.query.DemoQuery;
import com.moonunder.domain.demo.repository.DemoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author simon
 */
@Service
@RequiredArgsConstructor
public class DemoApplicationService {
  private final DemoRepository demoRepository;

  public PageDTO<DemoDTO> getDemoList(DemoQuery demoQuery) {
    List<DemoEntity> demoEntityList = demoRepository.findAll();
    return new PageDTO<>(DemoMapStruct.INSTANCE.demoListConvert(demoEntityList),
        (long) demoEntityList.size());
  }

  public DemoDTO getDemoInfoById(long demoId) throws Exception {
    Optional<DemoEntity> demoEntity = demoRepository.findById(demoId);

    return DemoMapStruct.INSTANCE.demoConvert(demoEntity.orElseThrow(() -> new Exception("demoId 不存在")));
  }
}
