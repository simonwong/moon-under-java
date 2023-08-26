package com.moonunder.domain.demo.db;

import com.moonunder.domain.demo.dto.DemoDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author simon
 */
@Mapper
public interface DemoMapStruct {
  DemoMapStruct INSTANCE = Mappers.getMapper(DemoMapStruct.class);

  DemoDTO demoConvert(DemoEntity demoEntity);

  List<DemoDTO> demoListConvert(List<DemoEntity> demoEntityList);
}
