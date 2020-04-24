package com.test.one.bean;

import com.test.one.utils.Phone;

public class login {
    String login_terminal = "1";
    String password = "12345678";
    String registration_id = "1104a89792e8d9d7b69";
    String phone = new Phone().getPhone();
    String mac_info = "undefined";
    String equipment_identifying = "undefined";

    public String getLogin_terminal() {
        return login_terminal;
    }

    public String getPassword() {
        return password;
    }

    public String getRegistration_id() {
        return registration_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getMac_info() {
        return mac_info;
    }

    public String getEquipment_identifying() {
        return equipment_identifying;
    }
}
