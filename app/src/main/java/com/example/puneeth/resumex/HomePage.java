package com.example.puneeth.resumex;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    private ImageView profilePhoto;
    private TextView profileName;
    private LinearLayout academics;
    private LinearLayout portfolio;
    private LinearLayout accomplishments;

    private ImageView academicsIcon;
    private ImageView portfolioIcon;
    private ImageView accomplishmentsIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
        profileName = (TextView) findViewById(R.id.profile_text);
        academics = (LinearLayout) findViewById(R.id.academics);
        portfolio = (LinearLayout) findViewById(R.id.portfolio);
        accomplishments = (LinearLayout) findViewById(R.id.accomplishments);

        academicsIcon = (ImageView) findViewById(R.id.academics_icon);
        portfolioIcon = (ImageView) findViewById(R.id.portfolio_icon);
        accomplishmentsIcon = (ImageView) findViewById(R.id.accomplishments_icon);

        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedAcademics = new Intent(HomePage.this, academicsPage.class);
                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View, String>(profilePhoto, "profile_photo");
                pairs[1] = new Pair<View, String>(profileName, "profile_text");
                pairs[2] = new Pair<View, String>(academicsIcon, "academics_icon");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomePage.this, pairs);

                startActivity(sharedAcademics, options.toBundle());
            }
        });

        accomplishments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedAccomplishments = new Intent(HomePage.this, accomplishmentsPage.class);
                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View, String>(profilePhoto, "profile_photo");
                pairs[1] = new Pair<View, String>(profileName, "profile_text");
                pairs[2] = new Pair<View, String>(accomplishmentsIcon, "accomplishments_icon");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomePage.this, pairs);

                startActivity(sharedAccomplishments, options.toBundle());
            }
        });


        portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedPortfolio = new Intent(HomePage.this, portfolioPage.class);
                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View, String>(profilePhoto, "profile_photo");
                pairs[1] = new Pair<View, String>(profileName, "profile_text");
                pairs[2] = new Pair<View, String>(portfolioIcon, "portfolio_icon");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomePage.this, pairs);

                startActivity(sharedPortfolio, options.toBundle());
            }
        });
    }
}
