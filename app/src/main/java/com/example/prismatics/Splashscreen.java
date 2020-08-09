package com.example.prismatics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.worldd);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://globalvoices.org/?gclid=CjwKCAjwmrn5BRB2EiwAZgL9oq4SMSwgGaZHdq7gBwYoE8qyj7SN3I0SES-8RaH-2RS0ukurN9pgnBoCCiIQAvD_BwE");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.nationall);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://www.mid-day.com/news/national");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.locall);
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://timesofindia.indiatimes.com/topic/today's-local-news");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.entertainmentt);
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://www.mid-day.com/entertainment");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



    }

}