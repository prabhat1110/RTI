package com.healthedge.rti.audit.repo;

import com.healthedge.rti.audit.entity.RequestTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestTypeRepository extends JpaRepository<RequestTypeEntity, Integer> {

}