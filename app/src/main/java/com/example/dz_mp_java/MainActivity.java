package com.example.dz_mp_java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        Button btnProgrammatic = findViewById(R.id.btn_programmatic);
        btnProgrammatic.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("fullName", "Белицкий Николай Константинович");
            intent.putExtra("group", "ИКБО-67-23");
            intent.putExtra("age", 19);
            intent.putExtra("grade", 5);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() вызван"); // Активность становится видимой пользователю
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() вызван"); // Активность получает фокус и становится активной
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() вызван"); // Активность теряет фокус, но еще видима (например, открыли другую активность)
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() вызван"); // Активность больше не видима пользователю
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() вызван"); // Активность возвращается из состояния остановки
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() вызван"); // Активность уничтожается
    }
}