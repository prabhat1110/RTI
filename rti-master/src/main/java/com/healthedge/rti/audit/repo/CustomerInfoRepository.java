package com.healthedge.rti.audit.repo;

import com.healthedge.rti.audit.entity.CustomerInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInfoRepository  extends JpaRepository<CustomerInfoEntity, Integer> {
}
