package com.moonunder.domain.demo.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonunder.common.core.page.AbstractPageQuery;
import com.moonunder.domain.demo.db.DemoEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author simon
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DemoQuery extends AbstractPageQuery<DemoEntity> {

//  private String demoName;

  @Override
  public QueryWrapper<DemoEntity> addQueryCondition() {
    QueryWrapper<DemoEntity> queryWrapper = new QueryWrapper<>();

    return  queryWrapper;
  }
}
