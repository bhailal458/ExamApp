package com.example.sparken02.examapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private static int i = 0;
    private static final String FORMAT = "%02d:%02d";
    private ArrayList<Question> questionArrayList = new ArrayList<Question>();
    private Button btnnext, btnpre;
    TextView txtQuestionNo, txtQuestion, txtans1, txtans2, txtans3, txtans4;
    TextView txttimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnext = (Button) findViewById(R.id.btnNext);
        btnpre = (Button) findViewById(R.id.btnPre);
        txtQuestionNo = (TextView) findViewById(R.id.txtQuestionLeft);
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        txtans1 = (TextView) findViewById(R.id.txtans1);
        txtans2 = (TextView) findViewById(R.id.txtans2);
        txtans3 = (TextView) findViewById(R.id.txtans3);
        txtans4 = (TextView) findViewById(R.id.txtans4);
        txttimer = (TextView) findViewById(R.id.txtTimer);

        addData();

        new CountDownTimer(900000, 1000) {

            public void onTick(long millisUntilFinished) {
                txttimer.setText("Time: " + String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                txttimer.setText("done!");
            }
        }.start();

        txtQuestionNo.setText("Qno." + questionArrayList.get(i).getQuestionNo() + "/10");
        txtQuestion.setText(questionArrayList.get(i).getQuestion());
        txtans1.setText(questionArrayList.get(i).getAns1());
        txtans2.setText(questionArrayList.get(i).getAns2());
        txtans3.setText(questionArrayList.get(i).getAns3());
        txtans4.setText(questionArrayList.get(i).getAns4());
//        i++;

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (i < 10) {

                    txtQuestionNo.setText("Qno." + questionArrayList.get(i).getQuestionNo() + "/10");
                    txtQuestion.setText(questionArrayList.get(i).getQuestion());
                    txtans1.setText(questionArrayList.get(i).getAns1());
                    txtans2.setText(questionArrayList.get(i).getAns2());
                    txtans3.setText(questionArrayList.get(i).getAns3());
                    txtans4.setText(questionArrayList.get(i).getAns4());

                    break;
                }
                i++;
            }


        });

        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while(i>0){
                    txtQuestionNo.setText("Qno." + questionArrayList.get(i).getQuestionNo() + "/10");
                    txtQuestion.setText(questionArrayList.get(i).getQuestion());
                    txtans1.setText(questionArrayList.get(i).getAns1());
                    txtans2.setText(questionArrayList.get(i).getAns2());
                    txtans3.setText(questionArrayList.get(i).getAns3());
                    txtans4.setText(questionArrayList.get(i).getAns4());

                    break;
                }
                i--;
            }
        });
    }

    private void addData() {
        questionArrayList.add(new Question("1", "Which of the following would compile without error?", "int a = Math.abs(-5);", "int b = Math.abs(5.0);", "int c = Math.abs(5.5F);", "int d = Math.abs(5L);"));
        questionArrayList.add(new Question("2", "Which one of these lists contains only Java programming language keywords?", "class, if, void, long, Int, continue", "goto, instanceof, native, finally, default, throws", "\ttry, virtual, throw, final, volatile, transient", "strictfp, constant, super, implements, do"));
        questionArrayList.add(new Question("3", "Which will legally declare, construct, and initialize an array?", "int [] myList = {\"1\", \"2\", \"3\"};", "int [] myList = (5, 8, 2);", "int myList [] [] = {4,9,7,0};", "int myList [] = {4, 3, 7};"));
        questionArrayList.add(new Question("4", "Which is a reserved word in the Java programming language?", "method", "native", "subclasses", "array"));
        questionArrayList.add(new Question("5", "Which is a valid keyword in java?", "interface", "string", "Float", "unsigned"));
        questionArrayList.add(new Question("6", "Which one of the following will declare an array and initialize it with five numbers?", "Array a = new Array(5);", "int [] a = {23,22,21,20,19};", "int a [] = new int[5];", "int [5] array;"));
        questionArrayList.add(new Question("7", "Which is the valid declarations within an interface definition?", "public double methoda();", "public final double methoda();", "static void methoda(double d1);", "protected void methoda(double d1);"));
        questionArrayList.add(new Question("8", "Which one is a valid declaration of a boolean?", "boolean b1 = 0;", "boolean b2 = 'false';", "boolean b3 = false;", "boolean b4 = Boolean.false();"));
        questionArrayList.add(new Question("9", "Which is a valid declarations of a String?", "String s1 = null;", "String s2 = 'null';", "String s3 = (String) 'abc';", "String s4 = (String) '\\ufeed';"));
        questionArrayList.add(new Question("10", "What is the numerical range of a char?", "-128 to 127", "-(215) to (215) - 1", "0 to 32767", "0 to 65535"));

    }
}

