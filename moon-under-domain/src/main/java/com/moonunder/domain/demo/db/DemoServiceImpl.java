package com.moonunder.domain.demo.db;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author simon
 */
@Service
@RequiredArgsConstructor
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements DemoService {
  private final DemoMapper demoMapper;
}
