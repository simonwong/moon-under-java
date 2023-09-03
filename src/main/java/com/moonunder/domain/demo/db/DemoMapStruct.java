package com.moonunder.domain.demo.db;

import com.moonunder.common.enums.common.YesOrNoEnum;
import com.moonunder.domain.demo.dto.DemoDTO;
import com.moonunder.domain.demo.entity.DemoEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author simon
 */
@Mapper(componentModel = "spring")
public interface DemoMapStruct {
  DemoMapStruct INSTANCE = Mappers.getMapper(DemoMapStruct.class);

  DemoDTO demoConvert(DemoEntity demoEntity);

  List<DemoDTO> demoListConvert(List<DemoEntity> demoEntityList);

  default YesOrNoEnum map(int value) {
    if (value == 1) {
      return YesOrNoEnum.YES;
    }
    return YesOrNoEnum.NO;
  }
}
