/*
Thor Long
5/15/2022
Final Exam

Food is declared as abstract because of the vagueness of what a food is in this context. We are defining more classes, 
vegetables and fruits, that have a is-a relationship and we must impliment each of the variables, name and price, to all of those
classes, and thus make the code easier to logic out. getType is an abstract method because of the same reason. At the 'Food' level, we only know that
it's a food, not a fruit or vegetable, therefore we make it abstract in order to tell the system 
that we're using it with the child classes, and java tells us that we have to as well.
*/
public abstract class Food implements Comparable<Food>{
    private String name;
    private double price;
    private static int numFood;

    protected Food(String name, double price){
        this.name = name;
        this.price = price;
        numFood++;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getNumFood(){
        return numFood;
    }
    public abstract String getType();
    @Override
    public String toString(){
        return "Name: " + name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Food){ //instanceof goes into object obj and looks to see, used from the bankAccount thing
            Food food = (Food) obj;
            return name == food.getName();
        }
        return false;
    }
    @Override
    //compareTo
    public int compareTo(Food food){ //BAObj1.CompareTo(BAobj2)
        if(price > food.getPrice()){ //Comes from BankAccount.java
            return 1;
        }else if(price < food.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }
}