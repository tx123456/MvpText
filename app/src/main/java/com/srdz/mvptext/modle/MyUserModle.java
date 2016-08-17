package com.srdz.mvptext.modle;

import android.util.SparseArray;

import com.srdz.mvptext.javabaen.UserBaen;

/**
 * Created by SRDZ on 2016/8/17.
 */
public class MyUserModle implements UserModle {
    private String mNumber;
    private String mPassword;
    private int mid;
    private SparseArray<UserBaen> userArray = new SparseArray<UserBaen>();
    @Override
    public void setID(int id) {
        mid = id;
    }

    @Override
    public void setNumber(String number) {
        mNumber = number;
    }

    @Override
    public void setPassword(String password) {
        mPassword = password;
        UserBaen userBaen = new UserBaen(mNumber,mPassword);
        userArray.append(mid,userBaen);

    }

    @Override
    public UserBaen load(int id) {
        mid = id;
        UserBaen userBaen = userArray.get(mid,new UserBaen("not found","not found"));
        return userBaen;
    }
}
