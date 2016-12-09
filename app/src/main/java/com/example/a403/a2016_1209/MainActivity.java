package com.example.a403.a2016_1209;

import android.graphics.Color;
import android.media.Image;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button BTN1, BTN2;
    TextView TV1, TV2, TV3;
    EditText ET1, ET2, ET3;
    ImageView IV1;
    Chronometer CM;
    LinearLayout Layout1, Layout2, Layout3, Layout4, Layout5, Layout6;
    Switch Switch1;
    RadioGroup RG;
    RadioButton R1, R2, R3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTN1 = (Button)findViewById(R.id.button1);
        BTN2 = (Button)findViewById(R.id.button2);
        TV1 = (TextView)findViewById(R.id.textView8);
        TV2 = (TextView)findViewById(R.id.textView9);
        TV3 = (TextView)findViewById(R.id.textView10);
        ET1 = (EditText)findViewById(R.id.editText1);
        ET2 = (EditText)findViewById(R.id.editText2);
        ET3 = (EditText)findViewById(R.id.editText3);
        CM = (Chronometer)findViewById(R.id.chronometer1);
        IV1 = (ImageView)findViewById(R.id.imageView);
        Layout2 = (LinearLayout)findViewById(R.id.Layout2);
        Layout3 = (LinearLayout)findViewById(R.id.Layout3);
        Layout4 = (LinearLayout)findViewById(R.id.Layout4);
        Layout5 = (LinearLayout)findViewById(R.id.Layout5);
        Layout6 = (LinearLayout)findViewById(R.id.Layout6);
        Switch1 = (Switch)findViewById(R.id.switch1);
        RG = (RadioGroup)findViewById(R.id.RD);
        R1 = (RadioButton)findViewById(R.id.radioButton1);
        R2 = (RadioButton)findViewById(R.id.radioButton2);
        R3 = (RadioButton)findViewById(R.id.radioButton3);

        CM.stop();
        Layout2.setVisibility(View.INVISIBLE);
        Layout3.setVisibility(View.INVISIBLE);
        Layout4.setVisibility(View.INVISIBLE);
        Layout5.setVisibility(View.INVISIBLE);
        Layout6.setVisibility(View.INVISIBLE);

        final double[] Num1 = new double[1];
        final double[] Num2 = new double[1];
        final double[] Num3 = new double[1];
        final double[] Sum1 = new double[1];
        final double[] Sum2 = new double[1];
        final double[] Sum3 = new double[1];

        Switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    Layout2.setVisibility(View.VISIBLE);
                    Layout3.setVisibility(View.VISIBLE);
                    Layout4.setVisibility(View.VISIBLE);
                    Layout5.setVisibility(View.VISIBLE);
                    Layout6.setVisibility(View.VISIBLE);
                    CM.start();
                    CM.setTextColor(Color.parseColor("#FF0000"));
                }

                else {
                    Layout2.setVisibility(View.INVISIBLE);
                    Layout3.setVisibility(View.INVISIBLE);
                    Layout4.setVisibility(View.INVISIBLE);
                    Layout5.setVisibility(View.INVISIBLE);
                    Layout6.setVisibility(View.INVISIBLE);
                    CM.setBase(SystemClock.elapsedRealtime());
                    ET1.setText(null);
                    ET2.setText(null);
                    ET3.setText(null);
                }

                BTN1.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(TV1==null || TV2==null || TV3==null){
                            Toast.makeText(getApplicationContext(), "인원수를 입력하세요",Toast.LENGTH_LONG).show();
                        }
                    else {
                            R1.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View v) {
                                    Num1[0] = Double.parseDouble(TV1.getText().toString());
                                    Num2[0] = Double.parseDouble(TV1.getText().toString());
                                    Num3[0] = Double.parseDouble(TV1.getText().toString());
                                    Sum1[0] = Num1[0] + Num2[0] + Num3[0];
                                    Sum3[0] = Num1[0]*15000 + Num2[0]*12000 + Num3[0]*8000;
                                    Sum2[0] = Sum3[0] *0.05;
                                    TV1.setText((int) Sum1[0]);
                                    TV2.setText((int) Sum2[0]);
                                    TV3.setText((int) Sum3[0]);
                                }
                            });
                            R2.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View v) {
                                    Num1[0] = Double.parseDouble(TV1.getText().toString());
                                    Num2[0] = Double.parseDouble(TV1.getText().toString());
                                    Num3[0] = Double.parseDouble(TV1.getText().toString());
                                    Sum1[0] = Num1[0] + Num2[0] + Num3[0];
                                    Sum3[0] = Num1[0]*15000 + Num2[0]*12000 + Num3[0]*8000;
                                    Sum2[0] = Sum3[0] *0.10;
                                    TV1.setText((int) Sum1[0]);
                                    TV2.setText((int) Sum2[0]);
                                    TV3.setText((int) Sum3[0]);
                                }
                            });
                            R3.setOnClickListener(new View.OnClickListener(){
                                @Override
                                public void onClick(View v) {
                                    Num1[0] = Double.parseDouble(TV1.getText().toString());
                                    Num2[0] = Double.parseDouble(TV1.getText().toString());
                                    Num3[0] = Double.parseDouble(TV1.getText().toString());
                                    Sum1[0] = Num1[0] + Num2[0] + Num3[0];
                                    Sum3[0] = Num1[0]*15000 + Num2[0]*12000 + Num3[0]*8000;
                                    Sum2[0] = Sum3[0] *0.20;
                                    TV1.setText((int) Sum1[0]);
                                    TV2.setText((int) Sum2[0]);
                                    TV3.setText((int) Sum3[0]);
                                }
                            });
                        }












                    }
                } );

            }
        });








    }
}
