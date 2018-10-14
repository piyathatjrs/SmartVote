package com.example.piyathatcharoensak.smartvote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button sub = findViewById(R.id.sub);
        final EditText E = findViewById(R.id.Etex);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dia = new AlertDialog.Builder(page2.this);
                String str = "";
                str = E.getText().toString();
                if(str.length()==0){
                    Toast t = Toast.makeText(page2.this , "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก" ,Toast.LENGTH_LONG);
                    t.show();

                }
            if(str.length()>=1){
                if (str.equals("1111111111111") || str.equals("2222222222222")){
                    dia.setTitle("ผลการตรวจสอบสิทธิการเลือกตั้ง");
                    dia.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                }else {
                    dia.setTitle("ผลการตรวจสอบสิทธิการเลือกตั้ง");
                    dia.setMessage("คุณไม่สิทธิเลือกตั้ง");
                }

                dia.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dia.show();
            }

            }
        });
    }
}
