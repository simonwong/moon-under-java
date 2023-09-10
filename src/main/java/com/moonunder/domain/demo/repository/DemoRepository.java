package com.moonunder.domain.demo.repository;

import com.moonunder.domain.demo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author simon
 */
public interface DemoRepository extends JpaRepository<DemoEntity, Long>, JpaSpecificationExecutor<DemoEntity> {

}
