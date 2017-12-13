package com.healthedge.rti.audit.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name= "outbound_sync")
public class OutboundSyncEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OUTBOUND_SYNC_ID")
    @NotNull
    private int id;

   /* @Column(name = "CUSTOMER_INFO_ID",insertable=false, updatable= false)
    @NotNull
    private int customer_info_id;*/

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_INFO_ID",referencedColumnName = "CUSTOMER_INFO_ID")
    private CustomerInfoEntity customerInfoOutbound;


    @Column(name = "RES_STATUS")
    @NotNull
    private String res_status;


    @Column(name = "RES_MESSAGE")
    @NotNull
    @Lob
    private String res_message;

    @Column(name = "RES_PAYLOAD")
    @NotNull
    @Lob
    private String res_payload;

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

    public CustomerInfoEntity getCustomerInfoOutbound() {
        return customerInfoOutbound;
    }

    public void setCustomerInfoOutbound(CustomerInfoEntity customerInfoOutbound) {
        this.customerInfoOutbound = customerInfoOutbound;
    }

    public String getRes_status() {
        return res_status;
    }

    public void setRes_status(String res_status) {
        this.res_status = res_status;
    }

    public String getRes_message() {
        return res_message;
    }

    public void setRes_message(String res_message) {
        this.res_message = res_message;
    }

    public String getRes_payload() {
        return res_payload;
    }

    public void setRes_payload(String res_payload) {
        this.res_payload = res_payload;
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

