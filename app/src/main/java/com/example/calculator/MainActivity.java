package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAddFunction(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumber);
        double firstNum = Double.parseDouble(firstNumberField.getText().toString());
        double secondNum = Double.parseDouble(secondNumberField.getText().toString());
        String str = Double.toString(firstNum + secondNum);
        goToActivity2(str);
    }

    public void clickSubtractFunction(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumber);
        double firstNum = Double.parseDouble(firstNumberField.getText().toString());
        double secondNum = Double.parseDouble(secondNumberField.getText().toString());
        String str = Double.toString(firstNum - secondNum);
        goToActivity2(str);
    }

    public void clickDivideFunction(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumber);
        double firstNum = Double.parseDouble(firstNumberField.getText().toString());
        double secondNum = Double.parseDouble(secondNumberField.getText().toString());
        String str = Double.toString(firstNum / secondNum);
        goToActivity2(str);
    }

    public void clickMultipleFunction(View view){
        EditText firstNumberField = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberField = (EditText)findViewById(R.id.secondNumber);
        double firstNum = Double.parseDouble(firstNumberField.getText().toString());
        double secondNum = Double.parseDouble(secondNumberField.getText().toString());
        String str = Double.toString(firstNum * secondNum);
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}