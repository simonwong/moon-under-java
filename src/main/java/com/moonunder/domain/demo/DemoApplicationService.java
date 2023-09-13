package com.moonunder.domain.demo;

import com.moonunder.common.core.page.PageDTO;
import com.moonunder.common.core.query.PageQuery;
import com.moonunder.domain.demo.db.DemoMapStruct;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.entity.DemoEntity;
import com.moonunder.domain.demo.query.DemoQuery;
import com.moonunder.domain.demo.repository.DemoRepository;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * @author simon
 */
@Service
@RequiredArgsConstructor
public class DemoApplicationService {
  private final DemoRepository demoRepository;

  public PageDTO<DemoDTO> getDemoList(PageQuery<DemoQuery> demoPageQuery) {
    Pageable pageable = PageRequest.of(demoPageQuery.getPageNum() - 1, demoPageQuery.getPageSize());

    Specification<DemoEntity> spec = (root, query, cb) -> {
      DemoQuery demoQuery = demoPageQuery.getCondition();
      List<Predicate> predicates = new ArrayList<>();
      if (demoQuery != null) {
        if (demoQuery.getDemoName() != null) {
          predicates.add(cb.like(root.get("demoName"), "%" + demoQuery.getDemoName() + "%"));
        }
        if (demoQuery.getDemoId() != null) {
          predicates.add(cb.equal(root.get("demoId"), demoQuery.getDemoId()));
        }
      }
      return cb.and(predicates.toArray(new Predicate[0]));
    };
    Page<DemoEntity> demoEntityPage = demoRepository.findAll(spec, pageable);
    return new PageDTO<>(
        DemoMapStruct.INSTANCE.demoListConvert(demoEntityPage.toList()),
        demoEntityPage.getTotalElements()
    );
  }

  public DemoDTO getDemoInfoById(long demoId) throws Exception {
    Optional<DemoEntity> demoEntity = demoRepository.findById(demoId);

    return DemoMapStruct.INSTANCE.demoConvert(demoEntity.orElseThrow(() -> new Exception("demoId 不存在")));
  }
}
