package com.example.dicon_2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_login,btn_makeaccount;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login=findViewById(R.id.LogIn_btn);
        btn_makeaccount=findViewById(R.id.MakeAccount_btn);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,Make_fragActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                //서버하고 통신
            }
        });
        btn_makeaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,MakeAccount.class);

                startActivity(intent);
            }
        });
    }
}
