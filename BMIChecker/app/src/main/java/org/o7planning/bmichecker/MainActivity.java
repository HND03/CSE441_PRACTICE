package org.o7planning.bmichecker;

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
    EditText edtName, edtHeight, edtWeight, edtBMI, edtDia;
    Button btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        edtBMI = findViewById(R.id.edtBMI);
        edtDia = findViewById(R.id.edtDia);
        btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double H = Double.parseDouble(edtHeight.getText().toString());
                double W = Double.parseDouble(edtWeight.getText().toString());
                double BMI = W / (H * H);
                String Dia = "";
                if (BMI < 18.5) {
                    Dia = "Underweight";
                }
                if (BMI >= 18.5 && BMI < 25) {
                    Dia = "Normal";
                }
                if (BMI >= 25 && BMI < 30) {
                    Dia = "Overweight";
                    }
                if (BMI >= 30) {
                    Dia = "Obese";
                }
                DecimalFormat df = new DecimalFormat("#.##");
                edtBMI.setText(df.format(BMI));
                edtDia.setText(Dia);
            }
        });

    }
}