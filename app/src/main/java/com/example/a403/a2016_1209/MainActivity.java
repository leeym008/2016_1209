package com.example.a403.a2016_1209;

import android.media.Image;
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
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button BTN1, BTN2;
    TextView TV1, TV2, TV3;
    EditText ET1, ET2, ET3;
    ImageView IV1;
    Chronometer CM;
    LinearLayout Layout1, Layout2, Layout3, Layout4, Layout5, Layout6;
    Switch Switch1;

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

        CM.stop();
        Layout2.setVisibility(View.INVISIBLE);
        Layout3.setVisibility(View.INVISIBLE);
        Layout4.setVisibility(View.INVISIBLE);
        Layout5.setVisibility(View.INVISIBLE);
        Layout6.setVisibility(View.INVISIBLE);

        Switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    Layout2.setVisibility(View.VISIBLE);
                    Layout3.setVisibility(View.VISIBLE);
                    Layout4.setVisibility(View.VISIBLE);
                    Layout5.setVisibility(View.VISIBLE);
                    Layout6.setVisibility(View.VISIBLE);
                }

                else {
                    Layout2.setVisibility(View.INVISIBLE);
                    Layout3.setVisibility(View.INVISIBLE);
                    Layout4.setVisibility(View.INVISIBLE);
                    Layout5.setVisibility(View.INVISIBLE);
                    Layout6.setVisibility(View.INVISIBLE);
                }

            }





        });








    }
}
