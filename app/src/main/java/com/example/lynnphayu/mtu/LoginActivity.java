package com.example.lynnphayu.mtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends AppCompatActivity {


        @BindView(R.id.login) Button login_button;
//        @BindView(R.id.toolbar) Toolbar toolbar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);
                ButterKnife.bind(this);

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
        }

        @OnClick(R.id.login)
        public void login(){
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
        }


}

