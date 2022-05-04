/*
Thor Long
Lab 11
5/4/2022
ShapeTest and the subsequent shape classes test overloading and using super methods
and sowhat to show inheritence and polymorphism
*/
public class Rectangle extends Shape{
    private double length;
    private double width;
    private static int numRec = 0;

    public Rectangle(){
        super("Rectangle", "Orange");
        numRec++;
    }
    public Rectangle(double length, double width){
        this();
        this.length = length;
        this.width = width;
    }
    public Rectangle(String name, String color, double length, double width){
        super(name, color);
        this.length = length;
        this.width = width;
        numRec++;
    }
    /*
    @param
    @return double
    */  
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    /*
    @param
    @return double
    */  
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public static int getNumRec(){
        return numRec;
    }
    @Override
    public double computeArea(){
        double area = length * width;
        return area;
    }
    @Override
    public double computePerimeter(){
        double perim = (2 * length) + (2 * width);
        return perim;
    }
    @Override
    public String toString(){
        return super.toString() + "\t Length: " + length + " Width: " + width + " Area: " + computeArea() + " Perimeter: " + computePerimeter();
      }
}
