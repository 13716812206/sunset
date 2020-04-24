package com.test.one.bean;

import com.test.one.utils.Phone;

public class OnlyPhone {
    String phone=new Phone().getPhone();

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "OnlyPhone{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
