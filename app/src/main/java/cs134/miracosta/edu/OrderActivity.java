/**
 * OrderActivity.java: Class which feeds data from Text Views to SummaryActivity.java (Controller)
 *
 * @author Cameron Colleran
 * @version 1.0
 */
package cs134.miracosta.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity
{
    /**
     * Instance variables
     */
    /** Double-Double Burger Edit Text View */
    private EditText doubleDoubleEditTextView;
    /** Cheeseburger Edit Text View */
    private EditText cheeseburgerEditTextView;
    /** French Fries Edit Text View */
    private EditText frenchFriesEditTextView;
    /** Shakes Edit Text View */
    private EditText shakesEditTextView;
    /** Small Drinks Edit Text View */
    private EditText smallEditTextView;
    /** Medium Drinks Edit Text View */
    private EditText mediumEditTextView;
    /** Large Drinks Edit Text View */
    private EditText largeEditTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Wiring up edit text views
        doubleDoubleEditTextView = findViewById(R.id.doubleDoubleEditTextView);
        cheeseburgerEditTextView = findViewById(R.id.cheeseburgerEditTextView);
        frenchFriesEditTextView = findViewById(R.id.frenchFriesEditTextView);
        shakesEditTextView = findViewById(R.id.shakeEditTextView);
        smallEditTextView = findViewById(R.id.smallEditTextView);
        mediumEditTextView = findViewById(R.id.mediumEditTextView);
        largeEditTextView = findViewById(R.id.largeEditTextView);
    }

    public void goToSummary(View v)
    {
        // Creating variables for intent from text views
        int doubleDoubleAmount;
        int cheeseburgerAmount;
        int frenchFriesAmount;
        int shakesAmount;
        int smallAmount;
        int mediumAmount;
        int largeAmount;

        try // try to get int value from edit text view
        {
            doubleDoubleAmount = Integer.parseInt(doubleDoubleEditTextView.getText().toString());
        }
        catch (NumberFormatException e) // catch if no number is entered in edit text view -> set to 0
        {
            doubleDoubleAmount = 0;
        }
        try
        {
            cheeseburgerAmount = Integer.parseInt(cheeseburgerEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            cheeseburgerAmount = 0;
        }
        try
        {
            frenchFriesAmount = Integer.parseInt(frenchFriesEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            frenchFriesAmount = 0;
        }
        try
        {
            shakesAmount = Integer.parseInt(shakesEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            shakesAmount = 0;
        }
        try
        {
            smallAmount = Integer.parseInt(smallEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            smallAmount = 0;
        }
        try
        {
            mediumAmount = Integer.parseInt(mediumEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            mediumAmount = 0;
        }
        try
        {
            largeAmount = Integer.parseInt(largeEditTextView.getText().toString());
        }
        catch (NumberFormatException e)
        {
            largeAmount = 0;
        }


        Intent intent = new Intent(this,SummaryActivity.class);

        // Populating intent
        intent.putExtra("DoubleDoubleAmount", doubleDoubleAmount);
        intent.putExtra("CheeseburgerAmount", cheeseburgerAmount);
        intent.putExtra("FrenchFriesAmount", frenchFriesAmount);
        intent.putExtra("ShakesAmount", shakesAmount);
        intent.putExtra("SmallAmount", smallAmount);
        intent.putExtra("MediumAmount", mediumAmount);
        intent.putExtra("LargeAmount", largeAmount);


        // Go to SummaryActivity
        startActivity(intent);
    }
}
