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

public class SummaryActivity extends AppCompatActivity
{
    /**
     * Instance variables
     */
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
        double total;
        double subtotal;
        int numOfItems;
        double tax;


        Intent intent = getIntent();

        // Instantiating data with data from intent
        total = intent.getDoubleExtra("Total",0.0);
        subtotal = intent.getDoubleExtra("Subtotal",0.0);
        numOfItems = intent.getIntExtra("NumOfItems",0);
        tax = intent.getDoubleExtra("Tax",0.0);

        // Wiring up text views
        totalAmountTextView = findViewById(R.id.totalAmountTextView);
        itemsAmountTextView = findViewById(R.id.itemsAmountTextView);
        subtotalAmountTextView = findViewById(R.id.subtotalAmountTextView);
        taxAmountTextView = findViewById(R.id.taxAmountTextView);

        // Setting Text Views
        totalAmountTextView.setText(currency.format(total));
        itemsAmountTextView.setText(Integer.toString(numOfItems));
        subtotalAmountTextView.setText(currency.format(subtotal));
        taxAmountTextView.setText(currency.format(tax));
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
