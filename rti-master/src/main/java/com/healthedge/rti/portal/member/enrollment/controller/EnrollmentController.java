package com.healthedge.rti.portal.member.enrollment.controller;


import com.healthedge.connector.schema.basetypes.*;
import com.healthedge.connector.schema.membershipsparse.MembershipType;
import com.healthedge.connector.schema.subscriptionsparse.SubscriptionType;
import com.healthedge.rti.portal.member.enrollment.model.EnrollmentRequest;
import com.healthedge.rti.portal.member.enrollment.model.MembershipTypeRequest;
import com.healthedge.rti.portal.member.enrollment.model.SubscriptionTypeRequest;
import com.healthedge.rti.portal.model.MemberPortalRequestType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/member")
@Api(value="memberServices", description="Member Portal Integration.")
public class EnrollmentController {


    @ApiOperation(value = "See enrollment object", response = EnrollmentRequest.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(path = "/enrollment", method = RequestMethod.GET)
    public static EnrollmentRequest getEnrollment() {

        List<MembershipTypeRequest> members = new ArrayList<>();
        members.add(createMembershipType());

        EnrollmentRequest enrollment = new EnrollmentRequest();
        enrollment.setMember(members);
        enrollment.setSubscription(createSubscriptionType());
        enrollment.setRequestId("b1b5e7ad-eefd-40dd-9072-6f587432cb73");
        enrollment.setRequestById("3b07d892-f8e7-4ae9-a05d-9e05996f681e");
        enrollment.setRequestType(MemberPortalRequestType.NEW_ENROLLMENT);

        return enrollment;
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public static String jwtTest(){
        return "Success";
    }

    private static MembershipTypeRequest createMembershipType(){

        MembershipTypeRequest membershipType = new MembershipTypeRequest();
        membershipType.setPhysicalAddress(createPhysicalAdd());
      //  membershipType.setAlternatePaymentContact(new MembershipType.AlternatePaymentContact());
        // membershipType.setAttachmentSetReference(new ReferenceType());
        //membershipType.setCommunicationPreferences(new IndividualCommunicationPreferencesType());
        membershipType.setCorrespondenceAddress(createCorrespondenseAddress());
        //membershipType.setDentalInfo(new MemberDentalInfoType());
     //   membershipType.setDependentVerification(new MembershipType.DependentVerification());
        membershipType.setInformationSourceCode(new CodeEntryInputType());
        //membershipType.setCcDirectiveList(new MembershipType.CcDirectiveList());
        membershipType.setDisabilityInfoForEligibility(new MembershipType.DisabilityInfoForEligibility());
        membershipType.setEmploymentInfo(createEmploymentInfo());
//        membershipType.setEnrollmentMemberFactors(new MemberFactorsCoreType());
//        membershipType.setHeadOfHousehold(new MembershipType.HeadOfHousehold());
//        membershipType.setHealthStatusReasonCode(new CodeEntryInputType());
//        membershipType.setIndividual(new MembershipType.Individual());
//        membershipType.setIndividualReference(new ReferenceType());
//        membershipType.setInformationAccessPermissionList(new MembershipType.InformationAccessPermissionList());
//        membershipType.setInformationAccessRestrictionList(new MembershipType.InformationAccessRestrictionList());
//        membershipType.setIsHandicapped(false);
//        membershipType.setMemberComplianceProgram(new MemberComplianceProgType());
        membershipType.setMemberIsSubscriber(true);
//        membershipType.setMemberMatchData(new MemberMatchInputType());
//        membershipType.setMemberRepresentative(new MembershipType.MemberRepresentative());
//        membershipType.setMembershipUDTList(new MembershipType.MembershipUDTList());
//        membershipType.setOldMemberData(new MembershipType.OldMemberData());
//        membershipType.setOtherIdNumberList(new MembershipType.OtherIdNumberList());
//        membershipType.setOtherResponsiblePersonInfo(new MembershipType.OtherResponsiblePersonInfo());
        membershipType.setOutOfServiceArea(false);
//        membershipType.setPhiAuthorizationList(new MembershipType.PhiAuthorizationList());
        membershipType.setPhysicalCharacteristics(new MembershipType.PhysicalCharacteristics());
//        membershipType.setPreExistingConditionInfo(new MembershipType.PreExistingConditionInfo());
//        membershipType.setPreExReduction(new MembershipType.PreExReduction());
//        membershipType.setPriorCoverageInfo(new MembershipType.PriorCoverageInfo());
//        membershipType.setProviderSelections(new MembershipType.ProviderSelections());
//        membershipType.setRaceOrEthnicity(new RaceOrEthnicityListRawType());
        membershipType.setSmokingStatus(SmokingStatusType.NON_SMOKER);
//        membershipType.setSubscriptionReference(new ReferenceType());
        membershipType.setVipReasonCode(new CodeEntryInputType());
        membershipType.setPlanSelection(Arrays.asList(new MembershipType.PlanSelection()));
        membershipType.setIndividual(createEnrollmentInfo());

        return membershipType;

    }

    private static MembershipType.EmploymentInfo createEmploymentInfo(){
        MembershipType.EmploymentInfo info = new MembershipType.EmploymentInfo();
        info.setEmployeeTypeDomainCode(new CodeEntryInputType());
        info.setEmploymentStatusCodeCode(new CodeEntryInputType());
        info.setSalaryGradeCodeCode(new CodeEntryInputType());
        info.setSalaryInterval(SalaryIntervalDomainType.MONTHLY);
        info.setUnionStatus(false);
        info.setUnitsDomainCode(new CodeEntryInputType());
        return info;
    }

    private static MembershipType.Individual createEnrollmentInfo(){
        MembershipType.Individual enrollInfo = new MembershipType.Individual();
        enrollInfo.setBirthPlaceCountryCode(new CountryCodeDomainType());
        enrollInfo.setGenderCode(GenderCodeType.MALE);
        enrollInfo.setImmigrationStatusCode(new CodeEntryInputType());
        enrollInfo.setLanguages(new LanguagesType());
        enrollInfo.setMaritalStatusCode(MaritalStatusCodeType.MARRIED);
        enrollInfo.setOtherNames(new OtherNamesType());
        enrollInfo.setPrimaryName(new PersonNameType());
        return enrollInfo;
    }

    private static MembershipType.PhysicalAddress createPhysicalAdd(){
        MembershipType.PhysicalAddress pa = new MembershipType.PhysicalAddress();
        pa.setListMode(ListActionType.DEFAULT);
        MemberPhysicalAddressType add = new MemberPhysicalAddressType();
        MemberPhysicalAddressType.AddressInfo addInfo = new MemberPhysicalAddressType.AddressInfo();
        addInfo.setPostalAddress(new PostalAddressType());
        TelephoneNumberListType tel = new TelephoneNumberListType();
        tel.setTelephoneNumber(Arrays.asList(new TelephoneNumberType()));
        tel.setListMode(ListActionType.DEFAULT);
        addInfo.setAddressPhoneList(tel);
        add.setAddressInfo(addInfo);
        add.setAddressTypeCode(new CodeEntryInputType());
        pa.setMemberPhysicalAddress(Arrays.asList(add));
        return pa;
    }

    private static MembershipType.CorrespondenceAddress createCorrespondenseAddress(){
        MembershipType.CorrespondenceAddress ca = new MembershipType.CorrespondenceAddress();
        ca.setEmailAddress("abc@xyz.com");
        PostalAddressType pat = new PostalAddressType();
        pat.setIgnoreAddressCheck(false);
        pat.setUndeliverableAddress(false);
        pat.setAddress("address line 1");
        pat.setAddress2("address line 2");
        pat.setAddress3("address line 3");
        pat.setCityName("Boston");
        pat.setCountyCode("US");
        pat.setCountryCode(new CountryCodeDomainType());
        pat.setStateCode("ABC");
        pat.setZipCode("964783");
        pat.setZipExtensionCode("Bo");
        ca.setPostalAddress(new PostalAddressType());
        return ca;

    }


    private static SubscriptionTypeRequest createSubscriptionType(){
        SubscriptionTypeRequest subscriptionType = new SubscriptionTypeRequest();
        subscriptionType.setAccountMatchData(new SubscriptionType.AccountMatchData());
        subscriptionType.setAccountReference(new IdentifierType());
        subscriptionType.setApplicationInfo(new SubscriptionType.ApplicationInfo());
        subscriptionType.setApplicationSignature(true);
//        subscriptionType.setBrokerSelections(new SubscriptionType.BrokerSelections());
//        subscriptionType.setClaimReviewList(new SubscriptionType.ClaimReviewList());
//        subscriptionType.setCobraSelection(new SubscriptionType.CobraSelection());
        subscriptionType.setInformationSourceCode(new CodeEntryInputType());
//        subscriptionType.setPaymentHold(new SubscriptionType.PaymentHold());
//        subscriptionType.setSubscriptionUDTList(new SubscriptionType.SubscriptionUDTList());
        subscriptionType.setVipReasonCode(new CodeEntryInputType());
        return subscriptionType;
    }
}
