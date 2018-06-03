package com.example.user.as;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton rw,w,s;
    Button b,c;
    int x,y;
    RadioGroup rg;
    LinearLayout LL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rw=(RadioButton) findViewById(R.id.radioButton4);
        w=(RadioButton) findViewById(R.id.radioButton5);
        s=(RadioButton) findViewById(R.id.radioButton6);
        b=(Button) findViewById(R.id.button);
        c=(Button) findViewById(R.id.button2);
        LL=(LinearLayout) findViewById(R.id.sht);
        rg = (RadioGroup) findViewById(R.id.rg);
    }
    public void shaked(View view){
        if(rw.isChecked()) LL.setBackgroundColor(Color.RED);
        if(w.isChecked()) LL.setBackgroundColor(Color.BLUE);
        if(s.isChecked()) LL.setBackgroundColor(Color.GREEN);
    }
    public void sd(View view){
        LL.setBackgroundColor(Color.WHITE);
        rg.clearCheck();
    }
}
