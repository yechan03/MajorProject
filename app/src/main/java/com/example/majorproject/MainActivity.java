package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView IG;
    RadioGroup radioGroup;
    RadioButton red,green,blue;
    Switch mSwitch;
    SeekBar seekBar;
    int redcolor =0,greencolor=0,bluecolor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.Radio);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);
        IG=findViewById(R.id.IG);
        mSwitch = findViewById(R.id.Switch);
        seekBar = findViewById(R.id.seekbar);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                IG.setColorFilter(Color.argb(i,redcolor,greencolor,bluecolor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (red.isChecked() == true) {
                    if (mSwitch.isChecked() == true) {
                        redcolor=255;
                        greencolor =0;
                        bluecolor =0;
                    }
                }
                if (green.isChecked() == true) {
                    if (mSwitch.isChecked() == true) {
                        greencolor=255;
                        bluecolor =0;
                        redcolor=0;
                    }
                }
                if (blue.isChecked() == true) {
                    if (mSwitch.isChecked() == true) {
                        bluecolor=255;
                        redcolor=0;
                        greencolor =0;
                    }
                }
                if (mSwitch.isChecked()==false){
                    IG.clearColorFilter();
                }
            }
        });



    }
}
