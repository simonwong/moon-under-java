package com.moonunder.infrastructure.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author simon
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableScheduling
@MapperScan(value = "com.moonunder.**.db", markerInterface = com.baomidou.mybatisplus.core.mapper.BaseMapper.class)
public class ApplicationConfig {

}
