/*
Thor Long
Lab 11
5/4/2022
ShapeTest and the subsequent shape classes test overloading and using super methods
and sowhat to show inheritence and polymorphism
*/
public class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private static int numTri = 0;

    public Triangle(){
        super("Triangle", "Green");
        numTri++;
    }
    public Triangle(double base, double height, double side1, double side2){
        this();
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    public Triangle(String name, String color, double base, double height, double side1, double side2){
        super(name, color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        numTri++;
    }
    /*
    @param
    @return double
    */  
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    /*
    @param
    @return double
    */  
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    /*
    @param
    @return double
    */  
    public double getSide1(){
        return side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    /*
    @param
    @return double
    */  
    public double getSide2(){
        return side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public static int getNumTri(){
        return numTri;
    }
    @Override
    public double computeArea(){
        double area = .5 * base * height;
        return area;
    }
    @Override
    public double computePerimeter(){
        double perim = base + side1 + side2;
        return perim;
    }
    @Override
    public String toString(){
        return super.toString() + "\t Base: " + base + " Area: " + computeArea() + " Perimeter: " + computePerimeter();
    }
}
