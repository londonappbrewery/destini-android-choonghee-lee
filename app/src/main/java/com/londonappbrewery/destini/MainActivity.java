package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button top, bottom;

    int storyIdx = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        story = findViewById(R.id.storyTextView);
        top = findViewById(R.id.buttonTop);
        bottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIdx) {
                    case 1:
                        storyIdx = 3;
                        story.setText(R.string.T3_Story);
                        top.setText(R.string.T3_Ans1);
                        bottom.setText(R.string.T3_Ans2);
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIdx) {
                    case 1:
                        storyIdx = 2;
                        story.setText(R.string.T2_Story);
                        top.setText(R.string.T2_Ans1);
                        bottom.setText(R.string.T2_Ans2);
                        break;
                }
            }
        });

    }
}
