/*
Thor Long
Lab 11
5/4/2022
ShapeTest and the subsequent shape classes test overloading and using super methods
and sowhat to show inheritence and polymorphism
*/
public class Circle extends Shape{
    private double radius = 0;
    private static int numCircles = 0;

    public Circle(){
        super("Circle", "Red");
        numCircles++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }
    public Circle(String name, String color, int radius){
        super(name, color);
        this.radius = radius;
        numCircles++;
    }
    /*
    @param
    @return double
    */    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public static int getNumCircles(){
        return numCircles;
    }
    @Override
    public double computeArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public double computePerimeter(){
        double perim = 2 * Math.PI * radius;
        return perim;
    }
    @Override
    public String toString(){
        return super.toString() + "\t Radius: " + radius + "; Area: " + computeArea() + "; Perimeter " + computePerimeter();
    }
}
