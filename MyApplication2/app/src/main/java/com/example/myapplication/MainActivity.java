package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button1;
    private EditText editText,editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custonDialog();
    }

    private void custonDialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);
        final AlertDialog dialog=builder.create();
        View dialogView=View.inflate(MainActivity.this,R.layout.layout,null);
        dialog.setView(dialogView);
        dialog.show();
        button=dialog.findViewById(R.id.btn1);
        button1=dialog.findViewById(R.id.btn2);
        editText=dialog.findViewById(R.id.editTxT1);
        editText1=dialog.findViewById(R.id.editTxT2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("123456")&&editText1.getText().toString().equals("123456")){
                    dialog.dismiss();
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                }else {
                    editText.setText("");
                    editText1.setText("");
                    Toast.makeText(MainActivity.this,"登陆失败,请重新输入",Toast.LENGTH_SHORT).show();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

}