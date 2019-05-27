package com.example.android.samd_project_islamiccalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NamazResultActivity extends AppCompatActivity {

    TextView fajartxt;
    TextView dhuhurtxt;
    TextView asartxt;
    TextView maghribtxt;
    TextView ishaatxt;
    String fajar1;
    String dhuhur1;
    String asar1;
    String maghrib1;
    String ishaa1;
    Button fajaradd;
    Button fajarsub;
    Button dhuhuradd;
    Button dhuhursub;
    Button asaradd;
    Button asarsub;
    Button maghribadd;
    Button maghribsub;
    Button ishaaadd;
    Button ishaasub;
    Button save;
    Button load;
    public static final String SHARED_PREFERENCES = "sharedPrefs";
    public static final String TEXT1 = "text1";
    public static final String TEXT2 = "text2";
    public static final String TEXT3 = "text3";
    public static final String TEXT4 = "text4";
    public static final String TEXT5 = "text5";
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_result);
        fajartxt=(TextView)findViewById(R.id.fajartxt);
        dhuhurtxt=(TextView)findViewById(R.id.dhuhurtxt);
        asartxt=(TextView)findViewById(R.id.asartxt);
        maghribtxt=(TextView)findViewById(R.id.maghribtxt);
        ishaatxt=(TextView)findViewById(R.id.ishaatxt);
        fajaradd=(Button)findViewById(R.id.fajaradd);
        fajarsub=(Button)findViewById(R.id.fajarsub);
        dhuhuradd=(Button)findViewById(R.id.dhuhuradd);
        dhuhursub=(Button)findViewById(R.id.dhuhursub);
        asaradd=(Button)findViewById(R.id.asaradd);
        asarsub=(Button)findViewById(R.id.asarsub);
        maghribadd=(Button)findViewById(R.id.maghribadd);
        maghribsub=(Button)findViewById(R.id.maghribsub);
        ishaaadd=(Button)findViewById(R.id.ishaaadd);
        ishaasub=(Button)findViewById(R.id.ishaasub);
        save=(Button)findViewById(R.id.saveBtn);
        load=(Button)findViewById(R.id.loadBtn);

        intent();

        fajaradd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(fajartxt.getText().toString());
                A=A+1;
                fajartxt.setText(Integer.toString(A));
            }
        });
        fajarsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(fajartxt.getText().toString());
                A=A-1;
                fajartxt.setText(Integer.toString(A));
            }
        });
        dhuhuradd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(dhuhurtxt.getText().toString());
                A=A+1;
                dhuhurtxt.setText(Integer.toString(A));
            }
        });
        dhuhursub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(dhuhurtxt.getText().toString());
                A=A-1;
                dhuhurtxt.setText(Integer.toString(A));
            }
        });
        asaradd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(asartxt.getText().toString());
                A=A+1;
                asartxt.setText(Integer.toString(A));
            }
        });
        asarsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(asartxt.getText().toString());
                A=A-1;
                asartxt.setText(Integer.toString(A));
            }
        });
        maghribadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(maghribtxt.getText().toString());
                A=A+1;
                maghribtxt.setText(Integer.toString(A));
            }
        });
        maghribsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(maghribtxt.getText().toString());
                A=A-1;
                maghribtxt.setText(Integer.toString(A));
            }
        });
        ishaaadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(ishaatxt.getText().toString());
                A=A+1;
                ishaatxt.setText(Integer.toString(A));
            }
        });
        ishaasub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A=Integer.parseInt(ishaatxt.getText().toString());
                A=A-1;
                ishaatxt.setText(Integer.toString(A));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedata();
            }
        });
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loaddata();
                updatedata();
            }
        });
    }
    public void savedata(){
        SharedPreferences sp=getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString(TEXT1,fajartxt.getText().toString());
        ed.putString(TEXT2,dhuhurtxt.getText().toString());
        ed.putString(TEXT3,asartxt.getText().toString());
        ed.putString(TEXT4,maghribtxt.getText().toString());
        ed.putString(TEXT5,ishaatxt.getText().toString());
        ed.apply();
        Toast.makeText(getApplicationContext(),"Data Saved",Toast.LENGTH_LONG).show();
    }
    public void intent(){
        Intent i=getIntent();
        fajar1=i.getStringExtra("fajar");
        dhuhur1=i.getStringExtra("dhuhur");
        asar1=i.getStringExtra("asar");
        maghrib1=i.getStringExtra("maghrib");
        ishaa1=i.getStringExtra("ishaa");

        fajartxt.setText(fajar1);
        dhuhurtxt.setText(dhuhur1);
        asartxt.setText(asar1);
        maghribtxt.setText(maghrib1);
        ishaatxt.setText(ishaa1);
    }
    public void loaddata(){
        SharedPreferences  sp=getSharedPreferences(SHARED_PREFERENCES,MODE_PRIVATE);
         text1=sp.getString(TEXT1,"");
         text2=sp.getString(TEXT2,"");
         text3=sp.getString(TEXT3,"");
         text4=sp.getString(TEXT4,"");
         text5=sp.getString(TEXT5,"");
    }
    public void updatedata(){
        fajartxt.setText(text1);
        dhuhurtxt.setText(text2);
        asartxt.setText(text3);
        maghribtxt.setText(text4);
        ishaatxt.setText(text5);
    }
}
