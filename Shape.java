/*
Thor Long
Lab 11
5/4/2022
ShapeTest and the subsequent shape classes test overloading and using super methods
and sowhat to show inheritence and polymorphism
*/
public abstract class Shape {
    private String color;
    private String name;
    private static int numShapes = 0;

    protected Shape(){
        name = "Name";
        color = "Color";
        numShapes++;
    }

    protected Shape(String name, String color){
        this.color = color;
        this.name = name;
        numShapes++;
    }
    /*
    @param
    @return String
    */    
    public String getColor(){
        return color;
    }
    /*
    @param
    @return String
    */    
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    
    public abstract double computeArea();
    public abstract double computePerimeter();
    @Override
    public String toString(){
        return "Name: " + name + "; Color: " + color;
    }
}
