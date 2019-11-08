package com.example.dicon_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MakeAccount extends AppCompatActivity {
    EditText email,password,repassword,grade,classes,number,name;
    String email2,password2,repassword2,grade2,classes2,number2,name2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_account);
        email=findViewById(R.id.MakeAccount_email_txt);
        password=findViewById(R.id.MakeAccount_password_txt);
        repassword=findViewById(R.id.MakeAccount_repassword_txt);
        grade=findViewById(R.id.MakeAccount_Grade_txt);
        classes=findViewById(R.id.MakeAccount_Class_txt);
        number=findViewById(R.id.MakeAccount_Number_txt);
        name=findViewById(R.id.MakeAccount_Name_txt);
        button=findViewById(R.id.MakeAccount_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email2=email.getText().toString();
                password2=password.getText().toString();
                repassword2=repassword.getText().toString();
                grade2=grade.getText().toString();
                classes2=classes.getText().toString();
                number2=number.getText().toString();
                name2=name.getText().toString();
                if(password2!=repassword2){
                    Toast.makeText(MakeAccount.this, "비밀번호를 다시 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    //서버에 전송 위에 값 전부
                }
            }
        });
    }
}
