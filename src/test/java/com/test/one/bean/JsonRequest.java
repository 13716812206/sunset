package com.test.one.bean;

import com.test.one.utils.Phone;

public class JsonRequest {

//    captcha=888888&channel=unknown&device=1c26ac0a4cad6e03&equipment_identifying=1c26ac0a4cad6e03&
//    login_terminal=1&mac_info=94%3A65%3A2D%3AA2%3ADB%3AF5&password=12345678&phone=13711113333&registration_id=1104a89792e8d9d7b69

    String captcha="888888";
    String channel="unknown";
    String device="1c26ac0a4cad6e03";
    String equipment_identifying="1c26ac0a4cad6e03";
    String login_terminal="1";
    String macinfo="94%3A65%3A2D%3AA2%3ADB%3AF5";
    String password="12345678";
    String phone=new Phone().getPhone();
    String registration_id="1104a89792e8d9d7b69";

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getEquipment_identifying() {
        return equipment_identifying;
    }

    public void setEquipment_identifying(String equipment_identifying) {
        this.equipment_identifying = equipment_identifying;
    }

    public String getLogin_terminal() {
        return login_terminal;
    }

    public void setLogin_terminal(String login_terminal) {
        this.login_terminal = login_terminal;
    }

    public String getMacinfo() {
        return macinfo;
    }

    public void setMacinfo(String macinfo) {
        this.macinfo = macinfo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }

    @Override
    public String toString() {
        return "JsonRequest{" +
                "captcha='" + captcha + '\'' +
                ", channel='" + channel + '\'' +
                ", device='" + device + '\'' +
                ", equipment_identifying='" + equipment_identifying + '\'' +
                ", login_terminal='" + login_terminal + '\'' +
                ", macinfo='" + macinfo + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", registration_id='" + registration_id + '\'' +
                '}';
    }
}
