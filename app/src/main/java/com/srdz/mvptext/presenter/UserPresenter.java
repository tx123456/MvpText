package com.srdz.mvptext.presenter;

import com.srdz.mvptext.javabaen.UserBaen;
import com.srdz.mvptext.modle.MyUserModle;
import com.srdz.mvptext.modle.UserModle;
import com.srdz.mvptext.view.UserView;

/**
 * Created by SRDZ on 2016/8/17.
 */
public class UserPresenter {
    private UserModle userModle;
    private UserView userView;

    public UserPresenter( UserView userView) {

        this.userView = userView;
        userModle = new MyUserModle();
    }

    public void cunUser(int id ,String number,String passrword){
        userModle.setID(id);
        userModle.setNumber(number);
        userModle.setPassword(passrword);
    }
    public void quUser(int id){
        UserBaen userBaen = userModle.load(id);
        userView.setNumber(userBaen.getNumber());
        userView.setPassword(userBaen.getPassword());
    }
}
