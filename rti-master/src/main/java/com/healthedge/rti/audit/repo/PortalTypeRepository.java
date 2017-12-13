package com.healthedge.rti.audit.repo;


import com.healthedge.rti.audit.entity.PortalTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortalTypeRepository extends JpaRepository<PortalTypeEntity, Integer> {
}
