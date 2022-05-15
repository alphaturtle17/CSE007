/*
Thor Long
5/15/2022
Final Exam

Constructor chaining is when you have a constructor from a parent class that you actually
set from the child. In this program, we see it in public Vegetable, as we can clearly see
name and price are not attrivutes of vegetable, rather, they are attributes of Food, that Vegetable
inherits. This way, we can allow multiple classes to inherit name and price since they can be used 
with things like Fruit as well. The chaining happening when we invoke 'public Vegetable(String name, double price, String color(){};'
is seen with the super(name, price) that assigns a name and price to the vegetable through Food, even though Vegetable does not 
specifically have it defined in that class, since Vegetable extends Food.
*/
public class Vegetable extends Food{
    private String color;
    private static int numVeg;

    public Vegetable(String color){
        super("Vegetable", 0.0);
        this.color = color;
        numVeg++;
    }
    public Vegetable(String name, double price, String color){
        super(name, price);
        this.color = color;
        numVeg++;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getNumVeg(){
        return numVeg;
    }
    @Override
    public String getType(){
        return "Vegetable";
    }
    @Override
    public String toString(){
        return super.toString() + " Type: " + getType() + " Color: " + getColor() + " Price: " + getPrice();
    }
}