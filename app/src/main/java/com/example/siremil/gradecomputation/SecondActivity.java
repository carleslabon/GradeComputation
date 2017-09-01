package com.example.siremil.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView rawAverage_Text;
    TextView finalGrade_Text;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = (Button) findViewById(R.id.btnBack);
        rawAverage_Text = (TextView) findViewById(R.id.rawAverageText);
        finalGrade_Text = (TextView) findViewById(R.id.finalGradeText);

        double rawAverage = getIntent().getDoubleExtra("ra", 0.00);
        rawAverage_Text.setText("Raw Average: " + rawAverage);
        String finalGrade = getIntent().getStringExtra("fg");
        finalGrade_Text.setText("Final Grade: " + finalGrade);

    }

    public void toFirstActivity(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
