package com.example.dicon_2019;

public class loginData {
    private String id,password;
    public loginData(String id, String passwd, String email) {
        this.id = id;
        this.password = passwd;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPasswd() {
        return password;
    }

    public void setPasswd(String passwd) {
        this.password = passwd;
    }
}
