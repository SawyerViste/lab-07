package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY = "CITY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_city);
        Button backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra(EXTRA_CITY);
        cityText.setText(cityName);

        backButton.setOnClickListener(v -> finish());
    }
}