package com.example.sparken02.examapp;

/**
 * Created by sparken02 on 14/6/17.
 */

public class Question {

    String question;
    String questionNo;
    String ans1;
    String ans2;
    String ans3;
    String ans4;

    public Question(String questionNo,String question, String ans1, String ans2, String ans3, String ans4) {

        this.questionNo = questionNo;
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
    }

    public Question() {

    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }
}
