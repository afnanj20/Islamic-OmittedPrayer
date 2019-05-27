package com.example.android.samd_project_islamiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView namazImg;
    private ImageView zakatImg;
    private ImageView duaImg;
    private ImageView reloadImg;
    Intent intent1;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        namazImg=(ImageView)findViewById(R.id.HomeNamazImg);
        zakatImg=(ImageView)findViewById(R.id.HomeZakatImg);
        duaImg=(ImageView)findViewById(R.id.HomeDuaImg);
        reloadImg=(ImageView)findViewById(R.id.HomeReloadImg);

        namazImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNamazActivity();
            }
        });
        zakatImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startZakatActivity();
            }
        });
        duaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDuaActivity();
            }
        });
        reloadImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNamazResultActivity();
            }
        });
    }
    public void startNamazActivity(){
        intent1=new Intent(getApplicationContext(),NamazActivity.class);
        startActivity(intent1);
    }
    public void startZakatActivity(){
        intent2=new Intent(getApplicationContext(),ZakatActivity.class);
        startActivity(intent2);
    }
    public void startDuaActivity(){
        intent3=new Intent(getApplicationContext(),DailyDuaActivity.class);
        startActivity(intent3);
    }
    public void startNamazResultActivity(){
        intent4=new Intent(getApplicationContext(),NamazResultActivity.class);
        startActivity(intent4);
    }
}
