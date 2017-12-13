package com.healthedge.rti.audit.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "customer_info")
public class CustomerInfoEntity {

    @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_INFO_ID", updatable=false,insertable = false)
    @NotNull
    private int id;

    @OneToMany(mappedBy = "customerInfoInbound",cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<InboundSyncEntity> inboundSyncList;

    @OneToMany(mappedBy = "customerInfoOutbound",cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<OutboundSyncEntity> outboundSyncList;

    @Column(name = "CUSTOMER_CODE")
    @NotNull
    private int customer_code;


    @Column(name = "NAME")
    private String name;

    @Column(name = "API_KEY")
    @NotNull
    private String api_key;

    @Column(name = "ENCRYPTION_KEY")
    @NotNull
    private String encryption_key;

    @Column(name = "SIGNATURE_KEY")
    @NotNull
    private String signature_key;

    @Column(name = "OUTBOUND_BASE_URL")
    @NotNull
    private String outbound_base_url;

    @Column(name = "OUTBOUND_KEY")
    @NotNull
    private String outbound_key;


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

    public List<InboundSyncEntity> getInboundSyncList() {
        return inboundSyncList;
    }

    public void setInboundSyncList(List<InboundSyncEntity> inboundSyncList) {
        this.inboundSyncList = inboundSyncList;
    }

    public List<OutboundSyncEntity> getOutboundSyncList() {
        return outboundSyncList;
    }

    public void setOutboundSyncList(List<OutboundSyncEntity> outboundSyncList) {
        this.outboundSyncList = outboundSyncList;
    }

    public int getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(int customer_code) {
        this.customer_code = customer_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getEncryption_key() {
        return encryption_key;
    }

    public void setEncryption_key(String encryption_key) {
        this.encryption_key = encryption_key;
    }

    public String getSignature_key() {
        return signature_key;
    }

    public void setSignature_key(String signature_key) {
        this.signature_key = signature_key;
    }

    public String getOutbound_base_url() {
        return outbound_base_url;
    }

    public void setOutbound_base_url(String outbound_base_url) {
        this.outbound_base_url = outbound_base_url;
    }

    public String getOutbound_key() {
        return outbound_key;
    }

    public void setOutbound_key(String outbound_key) {
        this.outbound_key = outbound_key;
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

