package com.srdz.mvptext.modle;

import com.srdz.mvptext.javabaen.UserBaen;

/**
 * Created by SRDZ on 2016/8/17.
 */
public interface UserModle {
    void setID(int id);
    void setNumber(String number);
    void setPassword(String password);
    UserBaen load(int id);
}
