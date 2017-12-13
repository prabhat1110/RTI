package com.healthedge.rti.audit.service;

import com.healthedge.rti.audit.entity.CustomerInfoEntity;
import com.healthedge.rti.audit.entity.InboundSyncEntity;
import com.healthedge.rti.audit.entity.RequestTypeEntity;
import com.healthedge.rti.audit.entity.SourceEntity;
import com.healthedge.rti.audit.repo.CustomerInfoRepository;
import com.healthedge.rti.audit.repo.InboundSyncRepository;
import com.healthedge.rti.audit.repo.RequestTypeRepository;
import com.healthedge.rti.audit.repo.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TestRepo {

    @Autowired
    private CustomerInfoRepository customerInfo;

    @Autowired
    private SourceRepository sourceRepo;

    @Autowired
    private RequestTypeRepository requestTypeRepository;

    @Autowired
    private InboundSyncRepository inboundSyncRepository;

    public void saveInboundSync(){
        InboundSyncEntity inb = new InboundSyncEntity();
        inb.setCreated_by("RTI");
        inb.setCreated_date(new Date());
        CustomerInfoEntity cusInfo = customerInfo.findOne(1);
        inb.setCustomerInfoInbound(cusInfo);
        inb.setReq_by_id("pnigam");
        inb.setReq_id("12345");
        inb.setReq_payload("{'name':'prabhat'}");
        RequestTypeEntity requestType = requestTypeRepository.findOne(1);
        inb.setRequestType(requestType);
        SourceEntity source = sourceRepo.findOne(1);
        inb.setSource(source);

        inboundSyncRepository.save(inb);

    }

}
