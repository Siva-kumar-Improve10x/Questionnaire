package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity<retrun> extends AppCompatActivity {
    RadioGroup radioGroupRg;
    Button radioVerifyBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        handleInitViews();
        handleRadioVerifyBtn();

    }

    private void handleInitViews() {
        radioGroupRg = findViewById(R.id.radiogroup_rg);
        radioVerifyBtn = findViewById(R.id.radioVerify_btn);
    }

    public void handleRadioVerifyBtn() {
        radioVerifyBtn.setOnClickListener(v -> {
            boolean reslut = isCorrect();
            showResult(reslut);
        });
    }

    private boolean isCorrect() {
        int selectedRb = radioGroupRg.getCheckedRadioButtonId();
        boolean reslut = false;
        if (selectedRb == R.id.eigth_rb) {
            reslut = true;
        }
        return reslut;
    }

    public void showResult(boolean isCorrect) {
        if (isCorrect) {
            Toast.makeText(this, "Correct Answer :)", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Oops :(", Toast.LENGTH_SHORT).show();
        }
    }
}