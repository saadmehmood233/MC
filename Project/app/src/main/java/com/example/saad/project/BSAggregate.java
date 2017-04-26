package com.example.saad.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.round;

public class BSAggregate extends AppCompatActivity {

    EditText matric_marks;
    EditText total_matric_marks;
    EditText inter_marks;
    EditText total_inter_marks;
    Spinner year_of_passing;
    EditText entry_test_marks;
    CheckBox is_hafiz;

    TextView moring_aggregate;
    TextView afternoon_aggregate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsaggregate);


        matric_marks = (EditText) findViewById(R.id.et_matric_marks);
        total_matric_marks = (EditText) findViewById(R.id.et_total_matric_marks);
        inter_marks = (EditText) findViewById(R.id.et_fsc_marks);
        total_inter_marks = (EditText) findViewById(R.id.et_total_fsc_marks);
        year_of_passing = (Spinner) findViewById(R.id.sp_passing_year);
        entry_test_marks = (EditText) findViewById(R.id.et_entery_test_marks);
        is_hafiz = (CheckBox) findViewById(R.id.check_hafiz);

        moring_aggregate = (TextView) findViewById(R.id.tv_moring_aggregate_result);
        afternoon_aggregate = (TextView) findViewById(R.id.tv_afternoon_aggregate_result);

    }

    public void calculateBS(View v)
    {
        Date d = new Date();

        float metric = (matric_marks.getText().toString().equals("")) ? 0 : Float.parseFloat(matric_marks.getText().toString())/4;
        float inter = (inter_marks.getText().toString().equals("")) ? 0 : Float.parseFloat(inter_marks.getText().toString());
        float tmetric = (total_matric_marks.getText().toString().equals("")) ? 0 : Float.parseFloat(total_matric_marks.getText().toString())/4;
        float tinter = (total_inter_marks.getText().toString().equals("")) ? 0 : Float.parseFloat(total_inter_marks.getText().toString());
        float testm = (entry_test_marks.getText().toString().equals("")) ? 0 : Float.parseFloat(entry_test_marks.getText().toString());
        float ttestm = 40;
        int yof = (year_of_passing.getSelectedItem().toString().equals("")) ? 0 : Integer.parseInt(year_of_passing.getSelectedItem().toString());

        int nhQ = 0;
        if ( is_hafiz.isChecked() ) {nhQ = 20;}

        float A = (metric + inter + nhQ) / (tmetric + tinter) * 70;
        float B = (testm / ttestm) * 30;
        float result=A+B;
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int diff = year - yof;

        float dedc = diff * 2;
        float mResult = result - dedc;
        float aResult = result;

        moring_aggregate.setText(mResult+"%");
        afternoon_aggregate.setText(aResult+"%");

    }
}
