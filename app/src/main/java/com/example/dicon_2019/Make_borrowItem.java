package com.example.dicon_2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Make_borrowItem extends AppCompatActivity {
    EditText headline,body;
    String headlineStr,bodyStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_borrow_item);

        Button button;
        button=findViewById(R.id.MakeBorrowItem_submit);
        headline=findViewById(R.id.MakeBorrowItem_headline);
        body=findViewById(R.id.MakeBorrowItem_body);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Make_borrowItem.this,Make_fragActivity.class);
                headlineStr=headline.getText().toString();
                bodyStr=body.getText().toString();

                startActivity(intent);

                //서버와의 통신 // 자기 프로필하고, 제목, 내용
            }
        });
    }
}
