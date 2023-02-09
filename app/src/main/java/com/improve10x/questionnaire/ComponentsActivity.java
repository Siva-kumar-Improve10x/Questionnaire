package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {
    Button radioBtn;
    Button checksBoxesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        handleInitViews();
        handleRadioBtn();
        handleCheckBoxBtn();
    }

    private void handleCheckBoxBtn() {
        checksBoxesBtn.setOnClickListener(v -> {
            navigateToCheckBoxesActivity();
        } );
    }

    private void handleRadioBtn() {
        radioBtn.setOnClickListener(v -> {
            navigateToRadioButtonsActivity();
        });
    }

    private void handleInitViews() {
        radioBtn = findViewById(R.id.radio_btn);
        checksBoxesBtn = findViewById(R.id.checksboxes_btn);

    }
    public  void navigateToRadioButtonsActivity(){
        Intent intent = new Intent(this,RadioButtonActivity.class);
        startActivity(intent);

    }
    public void navigateToCheckBoxesActivity(){
        Intent intentCheckBoxes = new Intent(this,CheckBoxesActivity.class);
        startActivity(intentCheckBoxes);
    }
}