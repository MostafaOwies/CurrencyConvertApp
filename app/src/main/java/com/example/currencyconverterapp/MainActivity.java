package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText input= findViewById(R.id.input);
        TextView output = findViewById(R.id.output);
        String usd = input.getText().toString();

        double usddouble = Double.parseDouble(usd);
        double egpdouble = usddouble*15.66;

        String egp = String.valueOf(egpdouble);
        Log.i("test","test");
        Log.i("test","test");

        Toast.makeText(this, egp + " EGP £", Toast.LENGTH_SHORT).show();

        output.setText(egp + " EGP £");





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}