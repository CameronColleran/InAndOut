/**
 * Order.java: Class representing an order (Model)
 *
 * @author Cameron Colleran
 * @version 1.0
 */
package cs134.miracosta.edu.Model;
public class Order
{
    /**
     * Instance variables
     */
    /** Amount of Cheeseburgers */
    private int mCheeseburgers;
    /** Amount of Double-Double Burgers */
    private int mDoubleDoubles;
    /** Amount of French Fries */
    private int mFrenchFries;
    /** Amount of Large Drinks */
    private int mLargeDrinks;
    /** Amount of Medium Drinks */
    private int mMediumDrinks;
    /** Amount of Shakes */
    private int mShakes;
    /** Amount of Small Drinks */
    private int mSmallDrinks;

    /**
     * Constants
     */
    /** Price of Cheeseburgers */
    private static final double PRICE_CHEESEBURGER = 2.15;
    /** Price of Double-Double Burgers */
    private static final double PRICE_DOUBLE_DOUBLE = 3.6;
    /** Price of French Fries */
    private static final double PRICE_FRENCH_FRIES = 1.65;
    /** Price of Large Drinks */
    private static final double PRICE_LARGE_DRINK = 1.75;
    /** Price of Medium Drinks */
    private static final double PRICE_MEDIUM_DRINK = 1.55;
    /** Price of Shakes */
    private static final double PRICE_SHAKE = 2.2;
    /** Price of Small Drinks */
    private static final double PRICE_SMALL_DRINK = 1.45;
    /** Tax Rate */
    private static final double TAX_RATE = 0.08;

    /**
     * Constructor
     */
    public Order()
    {
        mCheeseburgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mShakes = 0;
        mSmallDrinks = 0;
    }

    /**
     * Method which calculates the subtotal by multiplying all amount by their corresponding prices
     * and then adding them up
     *
     * @return the subtotal
     */
    public double calculateSubtotal()
    {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDoubles * PRICE_DOUBLE_DOUBLE) +
                (mFrenchFries * PRICE_FRENCH_FRIES) + (mLargeDrinks * PRICE_LARGE_DRINK) +
                (mMediumDrinks * PRICE_MEDIUM_DRINK) + (mShakes * PRICE_SHAKE) +
                (mSmallDrinks * PRICE_SMALL_DRINK);
    }

    /**
     * Method which calculates the added tax by multiplying the subtotal by the tax rate (8%)
     *
     * @return the added tax
     */
    public double calculateTax()
    {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * Method which calculates the total by adding the subtotal and the added tax
     *
     * @return the total
     */
    public double calculateTotal()
    {
        return calculateSubtotal() + calculateTax();
    }

    /**
     * Method which calculates the total number of items in the order by adding up all the amounts
     *
     * @return the total number of items in the order
     */
    public int calculateNumOfItems()
    {
        return mDoubleDoubles + mCheeseburgers + mFrenchFries + mShakes + mSmallDrinks +
                mMediumDrinks + mLargeDrinks;
    }

    /**
     * Getter for Cheeseburger amount
     *
     * @return the cheeseburger amount
     */
    public int getmCheeseburgers()
    {
        return mCheeseburgers;
    }

    /**
     * Setter for Cheeseburger amount
     *
     * @param mCheeseburgers the cheeseburger amount
     */
    public void setmCheeseburgers(int mCheeseburgers)
    {
        this.mCheeseburgers = mCheeseburgers;
    }

    /**
     * Getter for Double-Double Burger amount
     *
     * @return the double-double burger amount
     */
    public int getmDoubleDoubles()
    {
        return mDoubleDoubles;
    }

    /**
     * Setter for Double-Double Burger amount
     *
     * @param mDoubleDoubles the double-double burger amount
     */
    public void setmDoubleDoubles(int mDoubleDoubles)
    {
        this.mDoubleDoubles = mDoubleDoubles;
    }

    /**
     * Getter for French Fries amount
     *
     * @return the french fries amount
     */
    public int getmFrenchFries()
    {
        return mFrenchFries;
    }

    /**
     * Setter for French Fries amount
     *
     * @param mFrenchFries the french fries amount
     */
    public void setmFrenchFries(int mFrenchFries)
    {
        this.mFrenchFries = mFrenchFries;
    }

    /**
     * Getter for Large Drinks amount
     *
     * @return the large drinks amount
     */
    public int getmLargeDrinks()
    {
        return mLargeDrinks;
    }

    /**
     * Setter for Large Drinks amount
     *
     * @param mLargeDrinks the large drinks amount
     */
    public void setmLargeDrinks(int mLargeDrinks)
    {
        this.mLargeDrinks = mLargeDrinks;
    }

    /**
     * Getter for Medium Drinks amount
     *
     * @return the medium drinks amount
     */
    public int getmMediumDrinks()
    {
        return mMediumDrinks;
    }

    /**
     * Setter for Medium Drinks amount
     *
     * @param mMediumDrinks the medium drinks amount
     */
    public void setmMediumDrinks(int mMediumDrinks)
    {
        this.mMediumDrinks = mMediumDrinks;
    }

    /**
     * Getter for Shakes amount
     *
     * @return the shakes amount
     */
    public int getmShakes()
    {
        return mShakes;
    }

    /**
     * Setter for Shakes amount
     *
     * @param mShakes the shakes amount
     */
    public void setmShakes(int mShakes)
    {
        this.mShakes = mShakes;
    }

    /**
     * Getter for Small Drinks
     *
     * @return the small drinks amount
     */
    public int getmSmallDrinks()
    {
        return mSmallDrinks;
    }

    /**
     * Setter for Small Drinks
     *
     * @param mSmallDrinks the small drinks
     */
    public void setmSmallDrinks(int mSmallDrinks)
    {
        this.mSmallDrinks = mSmallDrinks;
    }
}
