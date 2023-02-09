package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckBoxesActivity extends AppCompatActivity {
    Button verifyCheckBtn;
    CheckBox MercuryCb;
    CheckBox sunCb;
    CheckBox MoonCb;
    CheckBox JipiterCb;
    CheckBox SaturnCb;
    CheckBox PlutoCb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);
        handleInitViews();
    }

    private void handleInitViews() {


    }
}