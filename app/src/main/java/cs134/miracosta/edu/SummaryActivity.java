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
    Order order;
    private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    private TextView totalAmountTextView;
    private TextView itemsAmountTextView;
    private TextView subtotalAmountTextView;
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
        System.out.println("DOUBLES " + doubleDoubleAmount);
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

    public void returnToMain(View v)
    {
        finish();
    }

}
