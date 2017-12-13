package com.healthedge.rti.portal.member.enrollment.model;

import com.healthedge.connector.schema.basetypes.CodeEntryInputType;
import com.healthedge.connector.schema.basetypes.IdentifierType;
import com.healthedge.connector.schema.subscriptionsparse.SubscriptionType;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class SubscriptionTypeRequest implements Serializable {

    private final static long serialVersionUID = 1L;

    protected Long id;
   // protected String payeeHccId;
//    protected String hccIdentifier;
    protected DateTime receiptDate;
    protected DateTime originalEffectiveDate;
    protected Boolean applicationSignature;
    protected String memberGroup;
    protected DateTime applicationDate;
   // protected XMLGregorianCalendar lastPremiumPaidDate;
   // protected XMLGregorianCalendar lastPremiumPaymentDate;
   // protected SubscriptionType.PaymentHold paymentHold;
    protected SubscriptionType.AccountMatchData accountMatchData;
    protected IdentifierType accountReference;
    protected CodeEntryInputType vipReasonCode;
    protected CodeEntryInputType informationSourceCode;
    protected SubscriptionType.ApplicationInfo applicationInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(DateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public DateTime getOriginalEffectiveDate() {
        return originalEffectiveDate;
    }

    public void setOriginalEffectiveDate(DateTime originalEffectiveDate) {
        this.originalEffectiveDate = originalEffectiveDate;
    }

    public Boolean getApplicationSignature() {
        return applicationSignature;
    }

    public void setApplicationSignature(Boolean applicationSignature) {
        this.applicationSignature = applicationSignature;
    }

    public String getMemberGroup() {
        return memberGroup;
    }

    public void setMemberGroup(String memberGroup) {
        this.memberGroup = memberGroup;
    }

    public DateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(DateTime applicationDate) {
        this.applicationDate = applicationDate;
    }

    public SubscriptionType.AccountMatchData getAccountMatchData() {
        return accountMatchData;
    }

    public void setAccountMatchData(SubscriptionType.AccountMatchData accountMatchData) {
        this.accountMatchData = accountMatchData;
    }

    public IdentifierType getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(IdentifierType accountReference) {
        this.accountReference = accountReference;
    }

    public CodeEntryInputType getVipReasonCode() {
        return vipReasonCode;
    }

    public void setVipReasonCode(CodeEntryInputType vipReasonCode) {
        this.vipReasonCode = vipReasonCode;
    }

    public CodeEntryInputType getInformationSourceCode() {
        return informationSourceCode;
    }

    public void setInformationSourceCode(CodeEntryInputType informationSourceCode) {
        this.informationSourceCode = informationSourceCode;
    }

    public SubscriptionType.ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    public void setApplicationInfo(SubscriptionType.ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }
}
