package com.example.hunngryappjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starterCard = findViewById(R.id.card_view_starters);
        mainCard = findViewById(R.id.card_view_mains);
        CardView desertCard = findViewById(R.id.card_view_deserts);

        starterCard.setOnClickListener(view -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
            startActivity(startersActivityIntent);
        });

        mainCard.setOnClickListener(view -> {
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);
        });

        desertCard.setOnClickListener(view -> {
            Intent desertActivityIntent = new Intent(MainActivity.this, DesertsActivity.class);
            startActivity(desertActivityIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(view -> {
            Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
            launchEmailAppIntent.setData(Uri.parse("mailto:bhatnagar.saumya2000@gmail.com"));
            startActivity(launchEmailAppIntent);
        });


    }
}