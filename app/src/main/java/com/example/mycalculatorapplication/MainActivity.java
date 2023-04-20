package com.example.mycalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button addBtn, subBtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        result = findViewById(R.id.result);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1Value = Integer.parseInt(num1.getText().toString());
                int num2Value = Integer.parseInt(num2.getText().toString());
                int sum = num1Value + num2Value;
                result.setText(String.valueOf(sum));
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1Value = Integer.parseInt(num1.getText().toString());
                int num2Value = Integer.parseInt(num2.getText().toString());
                int diff = num1Value - num2Value;
                result.setText(String.valueOf(diff));
            }
        });
    }
}
