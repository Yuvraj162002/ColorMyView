package com.example.constraintlayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.constraintlayout2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // Create activity main binding..
    ActivityMainBinding b;
    //Create color..
    int mcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /// Inititalize the activity main binding..
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
    }

    /// Click on the text to visible all boxes...

    public void ClickOnTextView(View view) {
        b.BoxOne.setVisibility(View.VISIBLE);
        b.BoxTwo.setVisibility(View.VISIBLE);
        b.BoxThree.setVisibility(View.VISIBLE);
        b.BoxFour.setVisibility(View.VISIBLE);
        b.BoxFive.setVisibility(View.VISIBLE);
    }

    //// GET COLOR TO ALL BOXES.....


    // Get color to first box..
        public void ClickOnBoxFirst(View view) {
            mcolor = getResources().getColor(R.color.Grey);
            b.BoxOne.setBackgroundColor(mcolor);
        }

       //Get color to Second box..
        public void ClickOnBoxTwo(View view) {
            mcolor = getResources().getColor(R.color.DarkGrey);
            b.BoxTwo.setBackgroundColor(mcolor);
        }

        /// Get color to third box..
        public void ClickOnBoxThree(View view) {
            mcolor = getResources().getColor(R.color.purple_700);
            b.BoxThree.setBackgroundColor(mcolor);
        }

        /// Get color to Fourth Box..
        public void ClickOnBoxFour(View view) {
            mcolor = getResources().getColor(R.color.purple_200);
            b.BoxFour.setBackgroundColor(mcolor);
        }
        // Get color to First box..
        public void ClickOnBoxFive(View view) {
            mcolor = getResources().getColor(R.color.purple_700);
            b.BoxFive.setBackgroundColor(mcolor);
        }

        //// GET COLOR ON BOXES BY CLICKING ON BUTTONS..

   //Get Red color to third box..
    public void RedBtton(View view) {
        mcolor = getResources().getColor(R.color.Red);
        b.BoxThree.setBackgroundColor(mcolor);

    }
    //Get Yellow  color to fourth  box..
    public void YellowButton(View view) {
        mcolor = getResources().getColor(R.color.Yellow);
        b.BoxFour.setBackgroundColor(mcolor);

    }
    // //Get Green  color to fivth box..
    public void GreenButton(View view) {
        mcolor = getResources().getColor(R.color.Green);
        b.BoxFive.setBackgroundColor(mcolor);
    }



}