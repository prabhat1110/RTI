package com.healthedge.rti.audit.repo;

import com.healthedge.rti.audit.entity.OutboundSyncEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutboundSyncRepository extends JpaRepository<OutboundSyncEntity,Integer> {


}

