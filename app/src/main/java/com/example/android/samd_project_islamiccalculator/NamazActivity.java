package com.example.android.samd_project_islamiccalculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NamazActivity extends AppCompatActivity {

    public EditText AgeText;
    public TextView calculatedTxt;
    public Button CalculateBtn,FinailizeBtn;
    public CheckBox fajar1, fajar2, fajar3, fajar4, fajar5, fajar6, fajar7;
    public CheckBox dhuhur1, dhuhur2, dhuhur3, dhuhur4, dhuhur5, dhuhur6, dhuhur7;
    public CheckBox asar1, asar2, asar3, asar4, asar5, asar6, asar7;
    public CheckBox maghrib1, maghrib2, maghrib3, maghrib4, maghrib5, maghrib6, maghrib7;
    public CheckBox ishaa1, ishaa2, ishaa3, ishaa4, ishaa5, ishaa6, ishaa7;
    int age, totalPrayers, newage;
    int day = 1;
    int month = 31;
    int year = 365;
    int Fajar, Dhuhur, Asar, Maghrib, Ishaa;
    boolean checked;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);
        AgeText = (EditText) findViewById(R.id.ageEdtTxt);
        calculatedTxt=(TextView) findViewById(R.id.calculatedTxt);
        CalculateBtn = (Button) findViewById(R.id.CalulateBtn);
        FinailizeBtn=(Button)findViewById(R.id.FinailizeBtn);
        fajar1 = (CheckBox) findViewById(R.id.fajar1);
        fajar2 = (CheckBox) findViewById(R.id.fajar2);
        fajar3 = (CheckBox) findViewById(R.id.fajar3);
        fajar4 = (CheckBox) findViewById(R.id.fajar4);
        fajar5 = (CheckBox) findViewById(R.id.fajar5);
        fajar6 = (CheckBox) findViewById(R.id.fajar6);
        fajar7 = (CheckBox) findViewById(R.id.fajar7);
        dhuhur1 = (CheckBox) findViewById(R.id.dhuhur1);
        dhuhur2 = (CheckBox) findViewById(R.id.dhuhur2);
        dhuhur3 = (CheckBox) findViewById(R.id.dhuhur3);
        dhuhur4 = (CheckBox) findViewById(R.id.dhuhur4);
        dhuhur5 = (CheckBox) findViewById(R.id.dhuhur5);
        dhuhur6 = (CheckBox) findViewById(R.id.dhuhur6);
        dhuhur7 = (CheckBox) findViewById(R.id.dhuhur7);
        asar1 = (CheckBox) findViewById(R.id.asar1);
        asar2 = (CheckBox) findViewById(R.id.asar2);
        asar3 = (CheckBox) findViewById(R.id.asar3);
        asar4 = (CheckBox) findViewById(R.id.asar4);
        asar5 = (CheckBox) findViewById(R.id.asar5);
        asar6 = (CheckBox) findViewById(R.id.asar6);
        asar7 = (CheckBox) findViewById(R.id.asar7);
        maghrib1 = (CheckBox) findViewById(R.id.maghrib1);
        maghrib2 = (CheckBox) findViewById(R.id.maghrib2);
        maghrib3 = (CheckBox) findViewById(R.id.maghrib3);
        maghrib4 = (CheckBox) findViewById(R.id.maghrib4);
        maghrib5 = (CheckBox) findViewById(R.id.maghrib5);
        maghrib6 = (CheckBox) findViewById(R.id.maghrib6);
        maghrib7 = (CheckBox) findViewById(R.id.maghrib7);
        ishaa1 = (CheckBox) findViewById(R.id.ishaa1);
        ishaa2 = (CheckBox) findViewById(R.id.ishaa2);
        ishaa3 = (CheckBox) findViewById(R.id.ishaa3);
        ishaa4 = (CheckBox) findViewById(R.id.ishaa4);
        ishaa5 = (CheckBox) findViewById(R.id.ishaa5);
        ishaa6 = (CheckBox) findViewById(R.id.ishaa6);
        ishaa7 = (CheckBox) findViewById(R.id.ishaa7);
        intent=new Intent(getApplicationContext(),NamazResultActivity.class);

        FinailizeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),Integer.toString(Fajar),Toast.LENGTH_LONG).show();
                String fajarstr1=Integer.toString(Fajar);
                intent.putExtra("fajar", fajarstr1);
                String dhuhurstr1=Integer.toString(Dhuhur);
                intent.putExtra("dhuhur", dhuhurstr1);
                String asarstr1=Integer.toString(Asar);
                intent.putExtra("asar", asarstr1);
                String maghribstr1=Integer.toString(Maghrib);
                intent.putExtra("maghrib", maghribstr1);
                String ishaastr1=Integer.toString(Ishaa);
                intent.putExtra("ishaa", ishaastr1);
                startActivity(intent);
            }
        });

        CalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                age = Integer.parseInt(AgeText.getText().toString());
                if(age<14){
                    Toast.makeText(getApplicationContext(),"Namaz bacame obligatory for you after the age of 14 yrs",Toast.LENGTH_LONG).show();
                }
                else {
                    newage = age - 13;

                    totalPrayers = newage * year;
                    Fajar = Dhuhur = Asar = Maghrib = Ishaa = totalPrayers;

                    calculatedTxt.setText("Total Prayers calculated...Pls proceed!");
                    //checboxCalculation(view);
                    Toast.makeText(getApplicationContext(), Integer.toString(Fajar), Toast.LENGTH_SHORT).show();
                }
            }


        });
    }


        public void cbClick (View view){
            switch(view.getId()){
                case R.id.fajar1:
                        if (fajar1.isChecked()){
                            Fajar=Fajar-3650;
                        }
                        break;
                case R.id.fajar2:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.fajar3:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.fajar4:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.fajar5:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.fajar6:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.fajar7:
                    if (checked){
                        Fajar=Fajar-3650;
                    }
                    break;
                case R.id.dhuhur1:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur2:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur3:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur4:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur5:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur6:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.dhuhur7:
                    if (checked){
                        Dhuhur=Dhuhur-3650;
                    }
                    break;
                case R.id.asar1:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar2:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar3:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar4:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar5:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar6:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;
                case R.id.asar7:
                    if (checked){
                        Asar=Asar-3650;
                    }
                    break;

                case R.id.maghrib1:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib2:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib3:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib4:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib5:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib6:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.maghrib7:
                    if (checked){
                        Maghrib=Maghrib-3650;
                    }
                    break;
                case R.id.ishaa1:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa2:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa3:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa4:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa5:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa6:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;
                case R.id.ishaa7:
                    if (checked){
                        Ishaa=Ishaa-3650;
                    }
                    break;

            }

        }


}