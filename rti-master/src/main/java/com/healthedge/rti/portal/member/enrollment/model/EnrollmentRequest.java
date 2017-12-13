package com.healthedge.rti.portal.member.enrollment.model;

import com.healthedge.rti.portal.model.MemberPortalRequest;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class EnrollmentRequest extends MemberPortalRequest implements Serializable {

    private final static long serialVersionUID = 1L;

    protected SubscriptionTypeRequest subscription;
    protected List<MembershipTypeRequest> member;

    public SubscriptionTypeRequest getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionTypeRequest subscription) {
        this.subscription = subscription;
    }

    public List<MembershipTypeRequest> getMember() {
        return member;
    }

    public void setMember(List<MembershipTypeRequest> member) {
        this.member = member;
    }
}
