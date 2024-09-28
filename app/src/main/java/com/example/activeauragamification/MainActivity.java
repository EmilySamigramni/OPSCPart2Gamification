package com.example.activeauragamification;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoToAchievements = findViewById(R.id.btnGoToAchievements);
        btnGoToAchievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AchievementActivity.class);
                startActivity(intent);
            }
        });

        List<String> earnedBadges = Arrays.asList(
                "badgeOne", "badgeTwo", "badgeThree", "badgeFour",
                "badgeFive", "badgeSix", "badgeSeven", "badgeEight",
                "badgeNine", "badgeTen", "badgeEleven", "badgeTwelve",
                "badgeThirteen", "badgeFourteen", "badgeFifteen", "badgeSixteen"
        );

        displayBadges(earnedBadges);
    }

    private void displayBadges(List<String> earnedBadges) {
        for (String badge : earnedBadges) {
            int badgeId = getResources().getIdentifier(badge, "id", getPackageName());
            ImageView badgeImage = findViewById(badgeId);
            if (badgeImage != null) {
                badgeImage.setVisibility(View.VISIBLE);
            }
        }
    }
}
