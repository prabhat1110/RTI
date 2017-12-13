package com.healthedge.rti.audit.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name= "inbound_sync")
public class InboundSyncEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INBOUND_SYNC_ID")
    @NotNull
    private int id;

  /*  @Column(name = "CUSTOMER_INFO_ID")
    @NotNull
    private int customer_info_id;*/

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_INFO_ID",referencedColumnName = "CUSTOMER_INFO_ID")
    private CustomerInfoEntity customerInfoInbound;


    @Column(name = "REQ_ID")
    private String req_id;

   /* @Column(name = "REQ_TYPE_ID")
    @NotNull
    private int req_type_id;*/

    @ManyToOne
    @JoinColumn(name = "REQ_TYPE_ID",referencedColumnName = "REQ_TYPE_ID")
    private RequestTypeEntity requestType;

  /*  @Column(name = "SOURCE_SYS_ID")
    @NotNull
    private int source_sys_id;*/

    @ManyToOne
    @JoinColumn(name = "SOURCE_SYS_ID",referencedColumnName = "SOURCE_ID")
    private SourceEntity source;

    @Column(name = "REQ_BY_ID")
    @NotNull
    private String req_by_id;

    @Column(name = "REQ_PAYLOAD")
    @NotNull
    @Lob
    private String req_payload;

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date created_date;

    @Column(name = "CREATED_BY")
    @NotNull
    private String created_by;

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_modified_date;

    @Column(name = "LAST_MODIFIED_BY")
    private String last_modified_by;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerInfoEntity getCustomerInfoInbound() {
        return customerInfoInbound;
    }

    public void setCustomerInfoInbound(CustomerInfoEntity customerInfoInbound) {
        this.customerInfoInbound = customerInfoInbound;
    }

    public String getReq_id() {
        return req_id;
    }

    public void setReq_id(String req_id) {
        this.req_id = req_id;
    }

    public RequestTypeEntity getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestTypeEntity requestType) {
        this.requestType = requestType;
    }

    public SourceEntity getSource() {
        return source;
    }

    public void setSource(SourceEntity source) {
        this.source = source;
    }

    public String getReq_by_id() {
        return req_by_id;
    }

    public void setReq_by_id(String req_by_id) {
        this.req_by_id = req_by_id;
    }

    public String getReq_payload() {
        return req_payload;
    }

    public void setReq_payload(String req_payload) {
        this.req_payload = req_payload;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getLast_modified_date() {
        return last_modified_date;
    }

    public void setLast_modified_date(Date last_modified_date) {
        this.last_modified_date = last_modified_date;
    }

    public String getLast_modified_by() {
        return last_modified_by;
    }

    public void setLast_modified_by(String last_modified_by) {
        this.last_modified_by = last_modified_by;
    }
}