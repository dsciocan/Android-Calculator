package com.northcoders.calculatorapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Button add;
    EditText num1;
    EditText num2;
    TextView result;
    String TAG = "button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("test", "onCreate: ");

        add = findViewById(R.id.button);
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView6);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "the button has been clicked");
                Log.i("num1_value", num1.getText().toString());
                Log.i("num2_value", num2.getText().toString());

                addNumbers();
            }
        });


    }

    public void addNumbers() {
        int intResult = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        result.setText(String.valueOf(intResult));
    }
}