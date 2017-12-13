package com.healthedge.rti.portal.member.enrollment.model;

import com.healthedge.connector.schema.basetypes.*;
import com.healthedge.connector.schema.cobpolicy.COBPolicyType;
import com.healthedge.connector.schema.enrollmenttypes.RaceOrEthnicityListRawType;
import com.healthedge.connector.schema.matchinput.MemberMatchInputType;
import com.healthedge.connector.schema.medicarehicn.MedicareHICNInfoType;
import com.healthedge.connector.schema.membercomplianceprogram.MemberComplianceProgType;
import com.healthedge.connector.schema.memberfactors.MemberFactorsCoreType;
import com.healthedge.connector.schema.membershipsparse.*;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.List;

public class MembershipTypeRequest implements Serializable {

    private final static long serialVersionUID = 1L;

    // MIN
    protected Long id;
    protected Boolean memberIsSubscriber;
    @XmlElement(defaultValue = "false")
    protected DateTime receiptDate;
    @XmlElement(defaultValue = "false")
    protected Boolean outOfServiceArea;
    protected SmokingStatusType smokingStatus;
    protected Boolean isHandicapped;
    protected MembershipType.Individual individual;
    protected MembershipType.PhysicalAddress physicalAddress;
    protected MembershipType.CorrespondenceAddress correspondenceAddress;
    protected MembershipType.DisabilityInfoForEligibility disabilityInfoForEligibility;
    protected MembershipType.PhysicalCharacteristics physicalCharacteristics;
    protected MembershipType.EmploymentInfo employmentInfo;
    protected CodeEntryInputType vipReasonCode;
    protected CodeEntryInputType informationSourceCode;
    protected List<MembershipType.PlanSelection> planSelection;

    //REST

//    @XmlElement(defaultValue = "CREATE")
//    protected MaintenanceCodeType maintenanceTypeCode;
//    protected CodeEntryInputType maintenanceReasonCode;

    //protected String payeeHccId;

    public MembershipType.Individual getIndividual() {
        return individual;
    }

    public void setIndividual(MembershipType.Individual individual) {
        this.individual = individual;
    }

//    protected String maintenanceComment;
//    @XmlElement(defaultValue = "false")
//    protected Boolean maintenanceOverride;
//    protected OverrideResultType maintenanceOverrideResult;
//    protected String benefitStatusCode;
//    protected Boolean waivePHIClaimViewRestriction;
//    @XmlElement(defaultValue = "false")
//    protected Boolean isMemberInHospice;
//    protected MemberMatchInputType memberMatchData;
//    protected MembershipType.OldMemberData oldMemberData;
    // protected String hccIdentifier;
    //protected String memberInputID;
//    protected MembershipType.DependentVerification dependentVerification;
//    protected IndividualCommunicationPreferencesType communicationPreferences;
//    protected List<IndividualSpecificCommunicationPreferencesType> specificCommunicationPreferences;
//    protected MembershipType.OtherIdNumberList otherIdNumberList;
//    protected MemberDentalInfoType dentalInfo;
//    protected MembershipType.PriorCoverageInfo priorCoverageInfo;
//    protected MembershipType.PreExistingConditionInfo preExistingConditionInfo;
//    protected MembershipType.PreExReduction preExReduction;
//    protected MembershipType.OtherResponsiblePersonInfo otherResponsiblePersonInfo;
//    protected MembershipType.MemberRepresentative memberRepresentative;
//    protected MembershipType.MembershipUDTList membershipUDTList;
//    protected MembershipType.InformationAccessPermissionList informationAccessPermissionList;
//    protected MembershipType.InformationAccessRestrictionList informationAccessRestrictionList;
//    protected MembershipType.PhiAuthorizationList phiAuthorizationList;
//    protected MembershipType.CcDirectiveList ccDirectiveList;
//    protected ReferenceType subscriptionReference;
//    protected ReferenceType individualReference;
//    protected RelationshipToSubscriberDefinitionReferenceType relationshipToSubscriberDefinitionReference;
//    protected RaceOrEthnicityListRawType raceOrEthnicity;
//    protected ReferenceType attachmentSetReference;
//    protected MembershipType.ProviderSelections providerSelections;
//    protected List<ReportingCategoryType> reportingCategory;
//    protected List<MedicareHICNInfoType> medicareHICN;
//    protected List<COBPolicyType> cobPolicy;
//    protected MembershipType.HeadOfHousehold headOfHousehold;
//    protected MemberComplianceProgType memberComplianceProgram;
//    protected MemberFactorsCoreType enrollmentMemberFactors;
//    protected MembershipType.AlternatePaymentContact alternatePaymentContact;
    // protected CodeEntryInputType healthStatusReasonCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMemberIsSubscriber() {
        return memberIsSubscriber;
    }

    public void setMemberIsSubscriber(Boolean memberIsSubscriber) {
        this.memberIsSubscriber = memberIsSubscriber;
    }

    public DateTime getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(DateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Boolean getOutOfServiceArea() {
        return outOfServiceArea;
    }

    public void setOutOfServiceArea(Boolean outOfServiceArea) {
        this.outOfServiceArea = outOfServiceArea;
    }

    public SmokingStatusType getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(SmokingStatusType smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public Boolean getHandicapped() {
        return isHandicapped;
    }

    public void setHandicapped(Boolean handicapped) {
        isHandicapped = handicapped;
    }

    public MembershipType.PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(MembershipType.PhysicalAddress physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public MembershipType.CorrespondenceAddress getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(MembershipType.CorrespondenceAddress correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    public MembershipType.DisabilityInfoForEligibility getDisabilityInfoForEligibility() {
        return disabilityInfoForEligibility;
    }

    public void setDisabilityInfoForEligibility(MembershipType.DisabilityInfoForEligibility disabilityInfoForEligibility) {
        this.disabilityInfoForEligibility = disabilityInfoForEligibility;
    }

    public MembershipType.PhysicalCharacteristics getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    public void setPhysicalCharacteristics(MembershipType.PhysicalCharacteristics physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    public MembershipType.EmploymentInfo getEmploymentInfo() {
        return employmentInfo;
    }

    public void setEmploymentInfo(MembershipType.EmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
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

    public List<MembershipType.PlanSelection> getPlanSelection() {
        return planSelection;
    }

    public void setPlanSelection(List<MembershipType.PlanSelection> planSelection) {
        this.planSelection = planSelection;
    }
}
