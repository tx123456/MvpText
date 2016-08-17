package com.srdz.mvptext.view;

/**
 * Created by SRDZ on 2016/8/17.
 */
public interface UserView {
    int getID();
    String getNumber();
    String getPassword();
    void setNumber(String number);
    void setPassword(String password);

}
