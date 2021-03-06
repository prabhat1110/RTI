package com.healthedge.rti.audit.repo;

import com.healthedge.rti.audit.entity.SourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends JpaRepository<SourceEntity, Integer> {
}
