package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIdx) {
                    case 2:
                    case 1:
                        storyIdx = 3;
                        story.setText(R.string.T3_Story);
                        top.setText(R.string.T3_Ans1);
                        bottom.setText(R.string.T3_Ans2);
                        break;
                    case 3:
                        storyIdx = 6;
                        story.setText(R.string.T6_End);
                        top.setVisibility(View.INVISIBLE);
                        bottom.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });


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
                    case 2:
                        story.setText(R.string.T4_End);
                        top.setVisibility(View.INVISIBLE);
                        bottom.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        storyIdx = 5;
                        story.setText(R.string.T5_End);
                        top.setVisibility(View.INVISIBLE);
                        bottom.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });

    }
}
