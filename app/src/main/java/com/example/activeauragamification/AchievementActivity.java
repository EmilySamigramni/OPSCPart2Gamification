package com.example.activeauragamification;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AchievementActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievementpage);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Achievements Screen");
    }
}
