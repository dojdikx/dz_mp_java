package com.example.dz_mp_java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() вызван");

        // Переход на вторую активность программно
        Button btnProgrammatic = findViewById(R.id.button);
        btnProgrammatic.setOnClickListener(v -> openSecondActivity(v));
    }

    public void openSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("fullName", "Белицкий Николай Константинович");
        intent.putExtra("group", "ИКБО-67-23");
        intent.putExtra("age", 19);
        intent.putExtra("grade", 99);
        startActivity(intent);
    }
}