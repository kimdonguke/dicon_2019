package com.example.dicon_2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity {
    public void setEt_id(EditText et_id) {
        this.login = et_id;
    }
    Button btn_login,btn_makeaccount;
    EditText login,password;
    String log,pas;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.logindId_txt);
        password=findViewById(R.id.loginPass_txt);
        btn_login=findViewById(R.id.LogIn_btn);
        btn_makeaccount=findViewById(R.id.MakeAccount_btn);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log=login.getText().toString();
                pas=password.getText().toString();
                if(log != null || password != null){
                    setEt_id(login);
                    login();
                }else{
                    Toast.makeText(MainActivity.this, "값이 비어 있습니다.", Toast.LENGTH_SHORT).show();
                }
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
    void login(){
        NetRetrofit.getInstance().login(login.getText().toString(),password.getText().toString())
                .enqueue(new Callback<ResponseBody>() {

                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        Log.e("response",response.toString()+"");
                        //Toast.makeText(getApplicationContext(),"로그인이 완료되었습니다.", response.body(),Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(),"로그인이 실패되었습니다.", response.body(),Toast.LENGTH_SHORT).show();
                        if(response.isSuccessful()){
                            if(response.code() == 200){
                                Intent intent = new Intent(MainActivity.this,Make_fragActivity.class);
                                intent.putExtra("name",login.getText().toString());
                                startActivity(intent);
                            }else{
                                Toast.makeText(MainActivity.this, ""+response.message(), Toast.LENGTH_SHORT).show();
                            }

                        }else{
                            Toast.makeText(MainActivity.this, ""+response.message(), Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e("error",t.toString());
                    }
                });
    }

}
