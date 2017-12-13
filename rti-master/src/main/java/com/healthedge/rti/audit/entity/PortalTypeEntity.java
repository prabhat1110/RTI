package com.healthedge.rti.audit.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "portal_type")
public class PortalTypeEntity {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PORTAL_TYPE_ID")
    @NotNull
    private int id;

    @OneToMany(mappedBy = "portalType",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RequestTypeEntity> requestTypeList;

    @Column(name = "PORTAL_TYPE",unique=true)
    @NotNull
    private String portal_type;

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

    public List<RequestTypeEntity> getRequestTypeList() {
        return requestTypeList;
    }

    public void setRequestTypeList(List<RequestTypeEntity> requestTypeList) {
        this.requestTypeList = requestTypeList;
    }

    public String getPortal_type() {
        return portal_type;
    }

    public void setPortal_type(String portal_type) {
        this.portal_type = portal_type;
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
