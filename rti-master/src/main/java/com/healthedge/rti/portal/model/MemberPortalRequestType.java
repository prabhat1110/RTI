package com.healthedge.rti.portal.model;

public enum MemberPortalRequestType {

    NEW_ENROLLMENT("New Enrollment"),
    RE_ENROLLMENT("Re Enrollment"),
    ADD_MEMBER("Add Member"),
    UPDATE_MEMBER("Update Member"),
    ADD_DEPENDENT("Add Dependent"),
    TERMINATE_MEMBER_COVERAGE("Terminate Member Coverage"),
    UPDATE_MEMBER_PCP("Update Member PCP");

    private final String value;

    private MemberPortalRequestType(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static MemberPortalRequestType fromValue(String v) {
        MemberPortalRequestType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            MemberPortalRequestType c = var1[var3];
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }

}
