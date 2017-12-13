package com.healthedge.rti.audit.repo;

import com.healthedge.rti.audit.entity.InboundSyncEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InboundSyncRepository extends JpaRepository<InboundSyncEntity, Integer> {

}
