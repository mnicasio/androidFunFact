package solutions.application.funfacts;

import android.graphics.Color;

import java.util.Random;

import static solutions.application.funfacts.FunFactsActivity.previousColors;

public class ColorWheel {

    //Fields or Member Variables - Properties about the object
    private final String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#03c4eb"  // DanzerPress
    };


    // Methods - Actions the object can take

   int getColor() {

        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        previousColors.add(color);
        return color;
    }

    int getPreviousColor(){
       //get previous fact color scheme
        int n = previousColors.size();
        n -= 1;
        int prevColor = previousColors.get(n);
        return prevColor;
    }

}