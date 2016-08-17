package com.srdz.mvptext.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.srdz.mvptext.R;
import com.srdz.mvptext.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements UserView, View.OnClickListener {

    private Button btn_cun,btn_qu;
    private EditText ed_id,ed_number,ed_password;
    private UserPresenter userpresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        userpresenter = new UserPresenter(this);
    }

    private void initView() {
        btn_cun = (Button) findViewById(R.id.btn_cun);
        btn_qu = (Button) findViewById(R.id.btn_qu);
        btn_cun.setOnClickListener(this);
        btn_qu.setOnClickListener(this);
        ed_id = (EditText) findViewById(R.id.ed_id);
        ed_number = (EditText) findViewById(R.id.ed_number);
        ed_password = (EditText) findViewById(R.id.ed_password);
    }

    @Override
    public int getID() {
        return Integer.parseInt(ed_id.getText().toString());
    }

    @Override
    public String getNumber() {
        return ed_number.getText().toString();
    }

    @Override
    public String getPassword() {
        return ed_password.getText().toString();
    }

    @Override
    public void setNumber(String number) {
        ed_number.setText(number);
    }

    @Override
    public void setPassword(String password) {
        ed_password.setText(password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_cun:
            userpresenter.cunUser(getID(),getNumber(),getPassword());
            break;
            case R.id.btn_qu:
            userpresenter.quUser(getID());
                break;
        }
    }
}
