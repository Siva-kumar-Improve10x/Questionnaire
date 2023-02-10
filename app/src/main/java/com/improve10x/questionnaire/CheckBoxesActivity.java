package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxesActivity extends AppCompatActivity {
    Button verifyCheckBtn;
    CheckBox mercuryCb;
    CheckBox sunCb;
    CheckBox moonCb;
    CheckBox jipiterCb;
    CheckBox saturnCb;
    CheckBox plutoCb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);
        handleInitViews();
        handleVerifyCheckBtn();
    }

    private void handleVerifyCheckBtn() {
        verifyCheckBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResult(result);
        });
    }

    public boolean isCorrect() {
        boolean selectedMercury = mercuryCb.isChecked();
        boolean selectedSun = sunCb.isChecked();
        boolean selectedMoon = moonCb.isChecked();
        boolean selectedJupiter = jipiterCb.isChecked();
        boolean selectedPluto = plutoCb.isChecked();
        boolean selectedSatun = saturnCb.isChecked();
        boolean result = false;
        if (selectedMercury == true && selectedJupiter == true && selectedSatun == true && selectedSun == false && selectedPluto == false && selectedMoon == false){
        result = true;
    }
           return result ;
}
    private void showResult(boolean result) {
        if (result) {
            Toast.makeText(this, "Pass lee", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fail   :( ", Toast.LENGTH_SHORT).show();
        }
    }

    public void handleInitViews() {
        mercuryCb = findViewById(R.id.Mercury_cb);
        sunCb = findViewById(R.id.sun_cb);
        moonCb = findViewById(R.id.Moon_cb);
        jipiterCb = findViewById(R.id.Jipiter_cb);
        saturnCb = findViewById(R.id.Saturn_cb);
        plutoCb = findViewById(R.id.Pluto_cb);
        verifyCheckBtn = findViewById(R.id.verifyCheck_btn);
    }
}