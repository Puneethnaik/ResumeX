package com.example.puneeth.resumex;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomePage extends AppCompatActivity {
    private ImageView profilePhoto;
    private ImageView profileName;
    private LinearLayout academics;
    private LinearLayout portfolio;
    private LinearLayout accomplishments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
        profileName = (ImageView) findViewById(R.id.profile_text);
        academics = (LinearLayout) findViewById(R.id.academics);
        portfolio = (LinearLayout) findViewById(R.id.portfolio);
        accomplishments = (LinearLayout) findViewById(R.id.accomplishments);

        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedAcademics = new Intent(HomePage.this, academicsPage.class);
                startActivity(sharedAcademics);
            }
        });

        accomplishments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedAccomplishments = new Intent(HomePage.this, accomplishmentsPage.class);
                startActivity(sharedAccomplishments);
            }
        });


        portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedPortfolio = new Intent(HomePage.this, portfolioPage.class);
                startActivity(sharedPortfolio);
            }
        });
    }
}
