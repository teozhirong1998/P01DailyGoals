package com.example.a16022635.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;

    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    EditText etReflection;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
        rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

        btnOk = (Button) findViewById(R.id.button);
        etReflection = (EditText) findViewById(R.id.editText);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedBtnId1 = rg1.getCheckedRadioButtonId();
                rb1 = (RadioButton) findViewById(selectedBtnId1);

                int selectedBtnId2 = rg2.getCheckedRadioButtonId();
                rb2 = (RadioButton) findViewById(selectedBtnId2);

                int selectedBtnId3 = rg3.getCheckedRadioButtonId();
                rb3 = (RadioButton) findViewById(selectedBtnId3);

                Intent i = new Intent(getBaseContext(), Summary.class);
                String[] summary = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), etReflection.getText().toString()};

                i.putExtra("summary", summary);
                startActivity(i);
            }
        });
    }
}
