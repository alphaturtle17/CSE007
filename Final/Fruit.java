/*
Thor Long
5/15/2022
Final Exam

Overriding a method has identical objects and sort of replaces one method with another
through the @Override tag. This is used in getType and toString, getType is overridden
because the type of food is unique to each class, and the toString is overridden because the specific
information printed out is different per food. Overloading methods changes the object signature, and is used
here in public Fruit(){}, both constructors. This is used to imput variables that are
defined in Food.java to Fruit.java since Fruit extends Food. Because of this, we can define the 
variables name and price allowing us to overload Fruit with Food attributes.
*/
public class Fruit extends Food{
    private boolean seeds;
    private static int numFruit;

    public Fruit(boolean seeds){
        super("Fruit", 0.0);
        this.seeds = seeds;
        numFruit++;
    }
    public Fruit(String name, double price, boolean seeds){
        super(name, price);
        this.seeds = seeds;
        numFruit++;
    }
    public boolean getSeeds(){
        return seeds;
    }
    public void setSeeds(boolean seeds){
        this.seeds = seeds;
    }
    public int getNumFruit(){
        return numFruit;
    }
    @Override
    public String getType(){
        return "Fruit";
    }
    @Override
    public String toString(){
        return super.toString() + " Type: " + getType() + " Seeds: " + seeds + " Price: " + getPrice();
    }
}
