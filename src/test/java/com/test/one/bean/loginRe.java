package com.test.one.bean;

public class loginRe {


//    {"access_token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMTU4NTU1NTAwMDMiLCJ1c2VySUQiOiJwOEFPciIsImlhdCI6MTU2NDczOTQ0OCwiZXhwIjoxNTY" +
//            "3MzMxNDQ4fQ.xG-UwmiKBzgNpugCcHmAaV7cJUNbQvacU5xiOc2wUVQ","token_type":"bearer","expires_in":2592000}

    private static loginRe loginRe;


    static  String access_token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiMTU4NTU1NTAwM" +
            "DMiLCJ1c2VySUQiOiJwOEFPciIsImlhdCI6MTU2NDczOTQ0OCwiZXhwIjoxNTY3MzMxNDQ4fQ.xG-UwmiKBzgNpugCcHmAaV7cJUNbQvacU5xiOc2wUVQ";
    static String token_type = null;
    static int expires_in=0;

    public  static String getAccess_token() {
        return access_token;
    }

    public static void setAccess_token(String access_token) {
        com.test.one.bean.loginRe.access_token = access_token;
    }

    public static String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        com.test.one.bean.loginRe.token_type = token_type;
    }

    public static int getExpires_in() {
        return expires_in;
    }

    public static void setExpires_in(int expires_in) {
        com.test.one.bean.loginRe.expires_in = expires_in;
    }
}
