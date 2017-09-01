package com.example.siremil.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText quizOneValue;
    EditText quizTwoValue;
    EditText seatworksValue;
    EditText labExercisesValue;
    EditText majorExamValue;
    Button btnCompute;
    double rawAverage;
    String finalGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizOneValue      = (EditText) findViewById(R.id.quizOneValue);
        quizTwoValue      = (EditText) findViewById(R.id.quizTwoValue);
        seatworksValue    = (EditText) findViewById(R.id.seatworksValue);
        labExercisesValue = (EditText) findViewById(R.id.labExercisesValue);
        majorExamValue    = (EditText) findViewById(R.id.majorExamValue);
        btnCompute        =  (Button)  findViewById(R.id.btnCompute);

    }

    public void callSecondActivity(View view) {

        double quiz1 = Double.parseDouble(quizOneValue .getText().toString()) * 0.1;
        double quiz2 = Double.parseDouble(quizTwoValue.getText().toString()) * 0.1;
        double seatworks = Double.parseDouble(seatworksValue.getText().toString()) * 0.1;
        double labExercises = Double.parseDouble(labExercisesValue.getText().toString()) * 0.4;
        double majorExams = Double.parseDouble(majorExamValue.getText().toString()) * 0.3;

        rawAverage = quiz1 + quiz2 + seatworks + labExercises + majorExams;

        if (rawAverage  < 60) {
            finalGrade = "Failed";
        } else if (rawAverage >= 60 && rawAverage  <= 65) {
            finalGrade = "3.0";
        } else if (rawAverage >= 70 && rawAverage  < 75) {
            finalGrade = "2.75";
        } else if (rawAverage >= 75 && rawAverage  < 80) {
            finalGrade = "2.5";
        } else if (rawAverage >= 80 && rawAverage  < 85) {
            finalGrade = "2.25";
        } else if (rawAverage >= 85 && rawAverage  < 90) {
            finalGrade = "2.0";
        } else if (rawAverage >= 90 && rawAverage  < 92) {
            finalGrade = "1.75";
        } else if (rawAverage >= 92 && rawAverage  < 94) {
            finalGrade = "1.5";
        } else if (rawAverage >= 94 && rawAverage  < 100) {
            finalGrade = "1.25";
        } else if (rawAverage == 100) {
            finalGrade = "1.0";
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ra", rawAverage);
        intent.putExtra("fg", finalGrade);
        startActivity(intent);

    }
}
