package com.example.android.samd_project_islamiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button proceedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceedButton =(Button) findViewById(R.id.proceedBtn);
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHomeActivity();
            }
        });
    }
    public void startHomeActivity(){
        Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }
}
