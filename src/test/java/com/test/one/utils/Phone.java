package com.test.one.utils;

public class Phone {
    String registerurl = "http://api-sandbox.hxgp.com/v1/authcode/register";
    String registerurl1 = "http://api-sandbox.hxgp.com/v1/register";
    String UserBaseurl = "http://api-sandbox.hxgp.com/v1/me/dealUserBase";
    String occipationurl = "http://api-sandbox.hxgp.com/v1/me/dealUserBaseForOccupation";
    String realtionurl = "http://api-sandbox.hxgp.com/v1/me/dealUserRelation";
    String loginurl = "http://api-sandbox.hxgp.com/v1/login";

    String staff = "http://api-sandbox.hxgp.com/v1/userinfo/staff";     //staffNo=057661
    String productDetail = "http://api-sandbox.hxgp.com/v1/productDetail";     //productId   170 U保贷
    String createAudit = "http://api-sandbox.hxgp.com/v1/audit/createAudit";
    String getpersonList = "http://api-sandbox.hxgp.com/v1/me/getPersonListStatus";

    String phone = "15855550008";
    String idcard = "513436198508027691";
    String name = "秦惠";

    public String getUserBaseurl() {
        return UserBaseurl;
    }

    public String getOccipationurl() {
        return occipationurl;
    }

    public String getRealtionurl() {
        return realtionurl;
    }

    public String getLoginurl() {
        return loginurl;
    }

    public String getRegisterurl() {
        return registerurl;
    }

    public String getRegisterurl1() {
        return registerurl1;
    }

    public String getStaff() {
        return staff;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public String getCreateAudit() {
        return createAudit;
    }

    public String getGetpersonList() {
        return getpersonList;
    }

    public String getPhone() {
        return phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "registerurl='" + registerurl + '\'' +
                ", registerurl1='" + registerurl1 + '\'' +
                ", phone='" + phone + '\'' +
                ", idcard='" + idcard + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
