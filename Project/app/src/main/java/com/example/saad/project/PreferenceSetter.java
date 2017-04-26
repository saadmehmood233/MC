package com.example.saad.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.saad.project.data.Question;

import java.util.ArrayList;
import java.util.List;

public class PreferenceSetter extends AppCompatActivity {

    public ArrayList<Question> questions = new ArrayList<Question>();
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference_setter);


        Question q1 = new Question();
        q1.setQuestion("Which will you chose between BSCS and BSIT?");
        q1.setQuestion_id("csvit");
        q1.setOption1("Computer Science");
        q1.setOption1_id("cs");
        q1.setOption2("Information Technology");
        q1.setOption2_id("it");


        Question q2 = new Question();
        q2.setQuestion("BSSE vs BSCS. Who you are with?");
        q2.setQuestion_id("sevcs");
        q2.setOption1("Software Engineering");
        q2.setOption1_id("se");
        q2.setOption2("Computer Science");
        q2.setOption2_id("cs");

        Question q3 = new Question();
        q3.setQuestion("In Your opinion which will be best for you. BSSE or BSIT?");
        q3.setQuestion_id("sevit");
        q3.setOption1("Software Engineering");
        q3.setOption1_id("se");
        q3.setOption2("Information Technology");
        q3.setOption2_id("it");

        Question q4 = new Question();
        q4.setQuestion("Old or New. Which campus will suit you?");
        q4.setQuestion_id("newvold");
        q4.setOption1("New Campus");
        q4.setOption1_id("new");
        q4.setOption2("Old Campus");
        q4.setOption2_id("old");

        Question q5 = new Question();
        q5.setQuestion("Morning or Afternoon. When would you like to study?");
        q5.setQuestion_id("morvaft");
        q5.setOption1("Morning");
        q5.setOption1_id("mor");
        q5.setOption2("Afternoon");
        q5.setOption2_id("aft");

        Question q6 = new Question();
        q6.setQuestion("Better Degree or Better Campus. Who will you go with?");
        q6.setQuestion_id("degvcamp");
        q6.setOption1("Degree");
        q6.setOption1_id("deg");
        q6.setOption2("Campus");
        q6.setOption2_id("camp");

        Question q7 = new Question();
        q7.setQuestion("Which is prefered to you. Campus or Timing?");
        q7.setQuestion_id("campvtime");
        q7.setOption1("Campus");
        q7.setOption1_id("camp");
        q7.setOption2("Time");
        q7.setOption2_id("time");

        Question q8 = new Question();
        q8.setQuestion("Which will you choose? Better Degree or Better Timings.");
        q8.setQuestion_id("degvcamp");
        q8.setOption1("Degree");
        q8.setOption1_id("deg");
        q8.setOption2("Campus");
        q8.setOption2_id("camp");
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);


        TextView tv = (TextView) findViewById(R.id.question);
        tv.setText(questions.get(index).getQuestion());
        RadioButton opt1= (RadioButton) findViewById(R.id.option1);
        RadioButton opt2= (RadioButton) findViewById(R.id.option2);
        opt1.setText(questions.get(index).getOption1());
        opt2.setText(questions.get(index).getOption2());
    }
    public void nextQuestion(View v){
        if (index<questions.size()) {
            RadioButton opt1= (RadioButton) findViewById(R.id.option1);
            RadioButton opt2= (RadioButton) findViewById(R.id.option2);
            if (opt1.isChecked())
                questions.get(index).setSelectedOption(questions.get(index).getOption1_id());
            else if (opt2.isChecked())
                questions.get(index).setSelectedOption(questions.get(index).getOption2_id());
            index = (index == 7) ? index : index + 1;
            if(index==7){
                Button submit= (Button) findViewById(R.id.submit);
                submit.setVisibility(View.VISIBLE);
            }

            TextView tv = (TextView) findViewById(R.id.question);
            tv.setText(questions.get(index).getQuestion());
            opt1.setText(questions.get(index).getOption1());
            opt2.setText(questions.get(index).getOption2());
        }
    }
    public void prevQuestion(View v){
        if (index!=0) {
            Button submit= (Button) findViewById(R.id.submit);
            submit.setVisibility(View.INVISIBLE);
            RadioButton opt1= (RadioButton) findViewById(R.id.option1);
            RadioButton opt2= (RadioButton) findViewById(R.id.option2);
            if (opt1.isChecked())
                questions.get(index).setSelectedOption(questions.get(index).getOption1_id());
            else if (opt2.isChecked())
                questions.get(index).setSelectedOption(questions.get(index).getOption2_id());
            index--;
            TextView tv = (TextView) findViewById(R.id.question);
            tv.setText(questions.get(index).getQuestion());
            opt1.setText(questions.get(index).getOption1());
            opt2.setText(questions.get(index).getOption2());

        }
    }
    public void submitForm(View v){
        RadioButton opt1= (RadioButton) findViewById(R.id.option1);
        RadioButton opt2= (RadioButton) findViewById(R.id.option2);
        if (opt1.isChecked())
            questions.get(index).setSelectedOption(questions.get(index).getOption1_id());
        else if (opt2.isChecked())
            questions.get(index).setSelectedOption(questions.get(index).getOption2_id());



    }

}
