package com.example.menghitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText)findViewById(R.id.txtPanjang);
        edtLebar = (EditText)findViewById(R.id.txtLebar);
        btnHitung = (Button)findViewById(R.id.btnHitung);
        txtLuas = (TextView)findViewById(R.id.txtLuas);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();
                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p * l;
                txtLuas.setText("Luas : "+luas);
            }
        });
    }
}
