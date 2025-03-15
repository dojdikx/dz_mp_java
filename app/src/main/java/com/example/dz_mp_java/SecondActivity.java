package com.example.dz_mp_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение данных из интента
        String fullName = getIntent().getStringExtra("fullName");
        String group = getIntent().getStringExtra("group");
        int age = getIntent().getIntExtra("age", 0);
        int grade = getIntent().getIntExtra("grade", 0);

        // Проверка, чтобы избежать NullPointerException
        if (fullName == null) fullName = "Не указано";
        if (group == null) group = "Не указано";

        // Отображение данных
        TextView textView = findViewById(R.id.text_info);
        textView.setText("ФИО: " + fullName + "\nГруппа: " + group + "\nВозраст: " + age + "\nОценка: " + grade);
    }
}