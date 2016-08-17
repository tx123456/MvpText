package com.srdz.mvptext.javabaen;

/**
 * Created by SRDZ on 2016/8/17.
 */
public class UserBaen {
    private String number;
    private String password;

    public UserBaen( String number,String password) {
        this.number = number;
        this.password = password;
    }
    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

}
