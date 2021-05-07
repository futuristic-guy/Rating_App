package com.example.burgerratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RatingBar ratingbar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        ratingbar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ratingValue = ratingbar.getRating();
                if(ratingValue <= 2){
                    textView.setText("Rating From 5 stars: " + ratingValue + "\nWe are sorry for Wasting Time.");
                    Toast.makeText(getApplicationContext(), "🙁", Toast.LENGTH_SHORT).show();

                }
                else if(ratingValue <= 3){
                    textView.setText("Rating From 5 stars: " + ratingValue + "\nWe are consistently improving.");
                    Toast.makeText(getApplicationContext(), "🙂", Toast.LENGTH_SHORT).show();
                }
                else if(ratingValue <= 4){
                    textView.setText("Rating From 5 stars: " + ratingValue + "\nWe are glad to Serve you.");
                    Toast.makeText(getApplicationContext(), "😊", Toast.LENGTH_SHORT).show();
                }
                else if(ratingValue <= 4.5){
                    textView.setText("Rating From 5 stars: " + ratingValue + "\nWe are so much glad to Serve you.");
                    Toast.makeText(getApplicationContext(), "😋", Toast.LENGTH_SHORT).show();
                }
                else if(ratingValue <= 5){
                    textView.setText("Rating From 5 stars: " + ratingValue + "\nWe are Keen to serve more for you.");
                    Toast.makeText(getApplicationContext(), "😎", Toast.LENGTH_SHORT).show();
                }
                else {
                    textView.setText("Please Give Rating.");
                }
            }
        });

    }
}