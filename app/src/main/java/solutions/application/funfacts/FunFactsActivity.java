package solutions.application.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.graphics.Color.*;

public class FunFactsActivity extends AppCompatActivity implements OnClickListener {
    //Declare our view variables
    private TextView factTextView;
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private ColorWheel colorWheel = new ColorWheel();
    private Button showFactButton;
    private Button previousFactButton;
    private FactBook factBook = new FactBook();
    private RelativeLayout relativeLayout;
    public static final List<Integer> factNumbers = new ArrayList<Integer>();
    public static final List<Integer> previousColors = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to corresponding variables
        factTextView = findViewById(R.id.factTextView);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        showFactButton = findViewById(R.id.showFactButton);
        showFactButton.setOnClickListener(this);
        previousFactButton = findViewById(R.id.previousFactButton);
        previousFactButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.showFactButton:
                String fact = factBook.getFact();
                //update the screen with our new fact
                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                previousFactButton.setTextColor(color);
                break;
            case R.id.previousFactButton:
                String prevFact = factBook.getPreviousFact();
                factTextView.setText(prevFact);

                int prevColor = colorWheel.getPreviousColor();
                relativeLayout.setBackgroundColor(prevColor);
                showFactButton.setTextColor(prevColor);
                previousFactButton.setTextColor(prevColor);
                break;
            default:
                break;
        }
    }
}




