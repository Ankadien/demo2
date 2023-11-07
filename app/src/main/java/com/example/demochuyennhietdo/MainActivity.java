package com.example.demochuyennhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    // Khai bao cac bien giao dien
    EditText editF, editC;
    Button btnFC, btnCF, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Anh xa Id
        editC = findViewById(R.id.editC);
        editF = findViewById(R.id.editF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnClear = findViewById(R.id.btnClear);

        // Xu ly cac nut Click
        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int c = Integer.parseInt(editC.getText().toString());
                double f = c*1.8 +32.0;
                editF.setText(dcf.format(f) +"");
            }
        });

        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int f = Integer.parseInt(editF.getText().toString());
                double c = (f-32.0)/1.8;
                editC.setText(dcf.format(c) + "");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editC.setText("");
                editF.setText("");
            }
        });
    }
}