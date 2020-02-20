package com.example.activtyifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText txtValor;


    /*Desde donde
     * MainActivity.this
     * getApplicationContext()
     * this
     * Al lugar de destino
     * SecondActivity.class*/
    public void goToSecondActivity(View view) {
        String valor = txtValor.getText().toString();
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("VALOR",valor);
        startActivity(intent);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValor = findViewById(R.id.txtValor);
        Toast.makeText(this, "onCreate ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onResume()");
    }

    @Override
    public void onPause() {

        super.onPause();
        Toast.makeText(this, "onPause ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onStop()");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onRestart()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onDestroy()");
    }
}
