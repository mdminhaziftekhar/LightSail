package com.example.lightsail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SocialActivity extends AppCompatActivity {

    CardView fbCard, instaCard, redditCard, quoraCard, twitterCard, stackCard, linkedinCard, pinterestCard, youtubeCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        fbCard = findViewById(R.id.fbCard);
        instaCard = findViewById(R.id.instaCard);
        redditCard = findViewById(R.id.redditCard);
        quoraCard = findViewById(R.id.quoraCard);
        twitterCard = findViewById(R.id.twitterCard);
        stackCard = findViewById(R.id.stackCard);
        linkedinCard = findViewById(R.id.linkedinCard);
        pinterestCard = findViewById(R.id.pinterestCard);
        youtubeCard = findViewById(R.id.youtubeCard);

        fbCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.facebook.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        instaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.instagram.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        redditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.reddit.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        quoraCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.quora.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });
        twitterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://twitter.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        stackCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://stackoverflow.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        linkedinCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.linkedin.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        pinterestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.pinterest.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });

        youtubeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = "https://www.youtube.com/";
                Intent i = new Intent(SocialActivity.this, SocialWebView.class);
                i.putExtra("link", link);
                startActivity(i);
            }
        });
    }
}