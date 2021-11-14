package com.example.convertert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText _editFer,_editCel;
  Button _ButtonConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _editCel =(EditText)findViewById(R.id.editCel);
        _editFer=(EditText) findViewById(R.id.editFer);
        _ButtonConvert=(Button)findViewById(R.id.ButtonConvert);

        _ButtonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double celsius = 0, fahrenheit = 0;
                if (_editCel.getText() == null || "".equals(_editCel.getText().toString())) {
                    Toast.makeText(MainActivity.this,"remplir les champs",Toast.LENGTH_LONG).show();
                    // convert from fahrenheit to celsius
                    fahrenheit = Double.parseDouble(_editFer.getText().toString());
                    celsius = (fahrenheit - 32) * 5 / 9;
                    _editCel.setText(String.valueOf(celsius+" "+"°C"));
                } else if (_editFer.getText() == null || "".equals(_editFer.getText().toString())) {
                    // convert from celsius to fahrenheit
                    celsius = Double.parseDouble(_editCel.getText().toString());
                    fahrenheit =(celsius * 9/5) + 32 ;
                    _editFer.setText(String.valueOf(fahrenheit+" "+"°F"));
            }
        }


        });
  }}