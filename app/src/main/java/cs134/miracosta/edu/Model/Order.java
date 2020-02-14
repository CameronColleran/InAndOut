package cs134.miracosta.edu.Model;

public class Order
{
    /**
     * Instance variables
     */
    private int mCheeseburgers;
    private int mDoubleDoubles;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mShakes;
    private int mSmallDrinks;

    /**
     * Constants
     */
    private static final double PRICE_CHEESEBURGER = 3.6;
    private static final double PRICE_DOUBLE_DOUBLE = 2.15;
    private static final double PRICE_FRENCH_FRIES = 1.65;
    private static final double PRICE_LARGE_DRINK = 1.75;
    private static final double PRICE_MEDIUM_DRINK = 1.55;
    private static final double PRICE_SHAKE = 2.2;
    private static final double PRICE_SMALL_DRINK = 1.45;
    private static final double TAX_RATE = .08;

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

    public double calculateSubtotal()
    {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDoubles * PRICE_DOUBLE_DOUBLE) +
                (mFrenchFries * PRICE_FRENCH_FRIES) + (mLargeDrinks * PRICE_LARGE_DRINK) +
                (mMediumDrinks * PRICE_MEDIUM_DRINK) + (mShakes * PRICE_SHAKE) +
                (mSmallDrinks * PRICE_SMALL_DRINK);
    }

    public double calculateTax()
    {
        return calculateSubtotal() * TAX_RATE;
    }

    public double calculateTotal()
    {
        return calculateSubtotal() + calculateTax();
    }

    public int calculateNumOfItems()
    {
        return mDoubleDoubles + mCheeseburgers + mFrenchFries + mShakes + mSmallDrinks +
                mMediumDrinks + mLargeDrinks;
    }

    public int getmCheeseburgers()
    {
        return mCheeseburgers;
    }

    public void setmCheeseburgers(int mCheeseburgers)
    {
        this.mCheeseburgers = mCheeseburgers;
    }

    public int getmDoubleDoubles()
    {
        return mDoubleDoubles;
    }

    public void setmDoubleDoubles(int mDoubleDoubles)
    {
        this.mDoubleDoubles = mDoubleDoubles;
    }

    public int getmFrenchFries()
    {
        return mFrenchFries;
    }

    public void setmFrenchFries(int mFrenchFries)
    {
        this.mFrenchFries = mFrenchFries;
    }

    public int getmLargeDrinks()
    {
        return mLargeDrinks;
    }

    public void setmLargeDrinks(int mLargeDrinks)
    {
        this.mLargeDrinks = mLargeDrinks;
    }

    public int getmMediumDrinks()
    {
        return mMediumDrinks;
    }

    public void setmMediumDrinks(int mMediumDrinks)
    {
        this.mMediumDrinks = mMediumDrinks;
    }

    public int getmShakes()
    {
        return mShakes;
    }

    public void setmShakes(int mShakes)
    {
        this.mShakes = mShakes;
    }

    public int getmSmallDrinks()
    {
        return mSmallDrinks;
    }

    public void setmSmallDrinks(int mSmallDrinks)
    {
        this.mSmallDrinks = mSmallDrinks;
    }
}
