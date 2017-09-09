package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.btnAsk);

        final int[] imageViewIds = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5 };

        final ImageView ball = (ImageView) findViewById(R.id.imageBall);

        askButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int answerIndex = new Random().nextInt(4);

                ball.setImageResource(imageViewIds[answerIndex]);
            }
        });
    }
}
