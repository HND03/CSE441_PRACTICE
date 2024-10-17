package com.example.calendarconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSC;
    Button btnConvert;
    TextView txtLC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSC = findViewById(R.id.edtSC);
        btnConvert = findViewById(R.id.btnConvert);
        txtLC = findViewById(R.id.txtLC);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String can="",chi="";
                int solar=Integer.parseInt(edtSC.getText().toString());
                switch (solar%10){
                    case 0: can = "Canh";break;
                    case 1: can = "Tân";break;
                    case 2: can = "Nhậm";break;
                    case 3: can = "Quý";break;
                    case 4: can = "Giáp";break;
                    case 5: can = "Ất";break;
                    case 6: can = "Bính";break;
                    case 7: can = "Đinh";break;
                    case 8: can = "Mậu";break;
                    case 9: can = "Kỷ";break;
                }
                switch (solar%12){
                    case 0: chi = "Thân";break;
                    case 1: chi = "Dậu";break;
                    case 2: chi = "Tuất";break;
                    case 3: chi = "Hợi";break;
                    case 4: chi = "Tý";break;
                    case 5: chi = "Sửu";break;
                    case 6: chi = "Dần";break;
                    case 7: chi = "Mão";break;
                    case 8: chi = "Thìn";break;
                    case 9: chi = "Tỵ";break;
                    case 10: chi = "Ngọ";break;
                    case 11: chi = "Mùi";break;
                }
                txtLC.setText(can+" "+chi);
            }
        });
    }
}