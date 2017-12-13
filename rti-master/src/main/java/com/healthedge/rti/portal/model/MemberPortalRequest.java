package com.healthedge.rti.portal.model;

import java.io.Serializable;

public class MemberPortalRequest implements Serializable{

    private final static long serialVersionUID = 1L;

    private String requestId;
    private MemberPortalRequestType requestType;
    private String requestById;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public MemberPortalRequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(MemberPortalRequestType requestType) {
        this.requestType = requestType;
    }

    public String getRequestById() {
        return requestById;
    }

    public void setRequestById(String requestById) {
        this.requestById = requestById;
    }
}
