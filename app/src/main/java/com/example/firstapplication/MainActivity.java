package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onBtnClick(View view) {
        TextView txtName = findViewById(R.id.txtMessageName);
        TextView txtSurname = findViewById(R.id.txtMessageSurname);
        TextView txtEmail = findViewById(R.id.txtMessageEmail);

        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtSurname = findViewById(R.id.edtTxtSurname);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtName.setText("First Name: " + edtTxtName.getText().toString());
        txtSurname.setText("Second Name: " + edtTxtSurname.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }
}