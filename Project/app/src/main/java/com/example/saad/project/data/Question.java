package com.example.saad.project.data;

/**
 * Created by saad on 4/26/17.
 */

public class Question {
    private String question;
    private String question_id;
    private String option1;
    private String option1_id;
    private String option2;
    private String option2_id;
    private String selectedOption;


    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public String getOption2_id() {
        return option2_id;
    }

    public void setOption2_id(String option2_id) {
        this.option2_id = option2_id;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption1_id() {
        return option1_id;
    }

    public void setOption1_id(String option1_id) {
        this.option1_id = option1_id;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
