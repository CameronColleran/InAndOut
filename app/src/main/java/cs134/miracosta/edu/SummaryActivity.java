/**
 * SummaryActivity.java: Class which receives incoming data from OrderActivity.java and performs
 * calculations, then updates corresponding Text Views
 *
 * @author Cameron Colleran
 * @version 1.0
 */
package cs134.miracosta.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

import cs134.miracosta.edu.Model.Order;

public class SummaryActivity extends AppCompatActivity
{
    /**
     * Instance variables
     */
    /** Order object to do calculations */
    Order order;
    /** NumberFormatter for Text View's outputs */
    private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
    /** Total Amount Text View */
    private TextView totalAmountTextView;
    /** Items Amount Text View */
    private TextView itemsAmountTextView;
    /** Subtotal Amount Text View */
    private TextView subtotalAmountTextView;
    /** Tax Amount Text View */
    private TextView taxAmountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        // Initializing data variables
        int doubleDoubleAmount;
        int cheeseburgerAmount;
        int frenchFriesAmount;
        int shakesAmount;
        int smallAmount;
        int mediumAmount;
        int largeAmount;

        Intent intent = getIntent();
        order = new Order();

        // Instantiating data with data from intent
        doubleDoubleAmount = intent.getIntExtra("DoubleDoubleAmount",0);
        cheeseburgerAmount = intent.getIntExtra("CheeseburgerAmount",0);
        frenchFriesAmount = intent.getIntExtra("FrenchFriesAmount",0);
        shakesAmount = intent.getIntExtra("ShakesAmount",0);
        smallAmount = intent.getIntExtra("SmallAmount",0);
        mediumAmount = intent.getIntExtra("MediumAmount",0);
        largeAmount = intent.getIntExtra("LargeAmount",0);

        // Populating Order (model) object with data
        order.setmDoubleDoubles(doubleDoubleAmount);
        order.setmCheeseburgers(cheeseburgerAmount);
        order.setmFrenchFries(frenchFriesAmount);
        order.setmShakes(shakesAmount);
        order.setmSmallDrinks(smallAmount);
        order.setmMediumDrinks(mediumAmount);
        order.setmLargeDrinks(largeAmount);

        // Wiring up text views
        totalAmountTextView = findViewById(R.id.totalAmountTextView);
        itemsAmountTextView = findViewById(R.id.itemsAmountTextView);
        subtotalAmountTextView = findViewById(R.id.subtotalAmountTextView);
        taxAmountTextView = findViewById(R.id.taxAmountTextView);

        // Setting Text Views
        totalAmountTextView.setText(currency.format(order.calculateTotal()));
        itemsAmountTextView.setText(Integer.toString(order.calculateNumOfItems()));
        subtotalAmountTextView.setText(currency.format(order.calculateSubtotal()));
        taxAmountTextView.setText(currency.format(order.calculateTax()));
    }

    /**
     * On click for Start New Order Button
     * @param v
     */
    public void returnToMain(View v)
    {
        // Finish intent and return to OrderActivity
        finish();
    }

}
