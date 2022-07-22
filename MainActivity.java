package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button processor;
    EditText x1Coefficient, y1Coefficient, num1, x2Coefficient, y2Coefficient, num2;
    TextView answerBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        processor = findViewById(R.id.processor);

        x1Coefficient = findViewById(R.id.x1Coefficient);
        y1Coefficient = findViewById(R.id.y1Coefficient);
        num1 = findViewById(R.id.num1);

        x2Coefficient = findViewById(R.id.x2Coeffecient);
        y2Coefficient = findViewById(R.id.y2Coefficient);
        num2 = findViewById(R.id.num2);

        answerBox = findViewById(R.id.answerBox);

        processor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x1 = x1Coefficient.getText().toString();
                String y1 = y1Coefficient.getText().toString();
                String n1 = num1.getText().toString();

                String x2 = x2Coefficient.getText().toString();
                String y2 = y2Coefficient.getText().toString();
                String n2 = num2.getText().toString();

                float a1 = Float.parseFloat(x1);
                float b1 = Float.parseFloat(y1);
                float k1 = Float.parseFloat(n1);

                float a2 = Float.parseFloat(x2);
                float b2 = Float.parseFloat(y2);
                float k2 = Float.parseFloat(n2);

                float x, y, D, D1, D2;

                D = (a1 * b2) - (a2 * b1);
                D1 = (k1 * b2) - (k2 * b1);
                D2 = (a1 * k2) - (a2 * k1);

                x = D1 / D;
                y = D2 / D;

                answerBox.setText("Answer: x = " + x + " and y = " + y);
            }
        });
    }
}