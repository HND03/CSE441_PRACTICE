package com.example.changetemperature;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtnF, edtnC;
    Button btnFtoC, btnCtoF, btnC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnF = findViewById(R.id.edtnF);
        edtnC = findViewById(R.id.edtnC);
        btnFtoC = findViewById(R.id.btnFtoC);
        btnCtoF = findViewById(R.id.btnCtoF);
        btnC = findViewById(R.id.btnC);
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                int Fare = Integer.parseInt(edtnF.getText().toString());
                double Cel = (Fare - 32) * 5 / 9;
                edtnC.setText(df.format(Cel));
            }
        });
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("0.00");
                int Cel = Integer.parseInt(edtnC.getText().toString());
                double Fare = (Cel * 9 / 5) + 32;
                edtnF.setText(df.format(Fare));
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            edtnF.setText("");
            edtnC.setText("");
            }
        });
    }
}