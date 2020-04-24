package com.test.one.bean;

public class Relation {
    String contacts="[{\"linkType\":\"1\",\"menName\":\"一\",\"menPhone\":\"13312346776\",\"relationship\":\"配偶\"},{\"linkType\":\"1\",\"menName\":\"二\",\"menPhone\":\"13579974769\",\"relationship\":\"父母\"},{\"linkType\":\"3\",\"menName\":\"三\",\"menPhone\":\"13746616494\",\"relationship\":\"同事\"},{\"linkType\":\"3\",\"menName\":\"四\",\"menPhone\":\"13764644444\",\"relationship\":\"朋友\"},{\"linkType\":\"3\",\"menName\":\"五\",\"menPhone\":\"13796464469\",\"relationship\":\"同事\"},{\"linkType\":\"3\",\"menName\":\"六\",\"menPhone\":\"13876464644\",\"relationship\":\"朋友\"}]";
    int familyKnow=1;
    int emergencyContactKnow=1;

    public String getContacts() {

        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public int getFamilyKnow() {
        return familyKnow;
    }

    public void setFamilyKnow(int familyKnow) {
        this.familyKnow = familyKnow;
    }

    public int getEmergencyContactKnow() {
        return emergencyContactKnow;
    }

    public void setEmergencyContactKnow(int emergencyContactKnow) {
        this.emergencyContactKnow = emergencyContactKnow;
    }
}
