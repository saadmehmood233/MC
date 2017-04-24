package com.example.saad.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aggregate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggregate);
    }

    public void ChangeToBSCalculator(View v) {
        Intent intent = new Intent(this, BSAggregate.class);
        startActivity(intent);
    }

    public void ChangeToMSCCalculator(View v) {
        Intent intent = new Intent(this, MSCAggregate.class);
        startActivity(intent);
    }

}
