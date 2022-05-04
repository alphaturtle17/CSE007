/*
Thor Long
Lab 11
5/4/2022
ShapeTest and the subsequent shape classes test overloading and using super methods
and sowhat to show inheritence and polymorphism
*/
import java.util.Scanner;
import java.util.Random;
public class ShapeTest {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
            
        System.out.println("How many shapes do you want to make?"); //Ask
        int numShapes = checkInt(scnr);
        Shape shapes[] = new Shape[numShapes];

        for(int i = 0; i < shapes.length; i++){
            boolean makingShape = true;
            do{
                System.out.println("What shape do you want index " + i + " to be? (1- circle, 2- triangle, 3- rectangle"); //So I can check for ints
                int shapePick = checkInt(scnr);
                if(shapePick == 1){
                    shapes[i] = new Circle(getRandomNumber(rand)); //All these just get random numbers
                    makingShape = false;
                    scnr.nextLine();
                }else if(shapePick == 2 ){
                    shapes[i] = new Triangle(getRandomNumber(rand), getRandomNumber(rand), getRandomNumber(rand), getRandomNumber(rand));
                    makingShape = false;
                    scnr.nextLine();
                }else if(shapePick == 3){
                    shapes[i] = new Rectangle(getRandomNumber(rand), getRandomNumber(rand));
                    makingShape = false;
                    scnr.nextLine();
                }else{
                    System.out.println("Not an option");
                    scnr.nextLine();
                }
            }while(makingShape == true);
        }

        for(int i = 0; i < Shape.getNumShapes(); i++){
            System.out.println(shapes[i].toString());
        }
        double totalPerim = 0;
        for(int i = 0; i < Shape.getNumShapes(); i++){
            totalPerim += shapes[i].computePerimeter();
        }
        double totalArea = 0;
        for(int i = 0; i < Shape.getNumShapes(); i++){
            totalArea += shapes[i].computeArea();
        }
        System.out.println("Total Area: " + totalArea); //Calculate and add
        System.out.println("Total Perimeter: " + totalPerim);

        double avgPerim = totalPerim / Shape.getNumShapes();
        double avgArea = totalArea / Shape.getNumShapes();

        System.out.println("Average Area: " + avgArea);
        System.out.println("Average Perimeter: " + avgPerim);
    }
    //@param scnr
    //@return number int
    public static int checkInt(Scanner scnr){
        boolean good = false;
        int number = 0;
        do{
            if(scnr.hasNextInt() == true){
                number = scnr.nextInt();
                good = true;
            }else{
                System.out.println("Invalid data type");
                scnr.nextLine();
                good = false;
            }
        }while(good == false);
        return number;
    }
    /*
    @param Random
    @return double
    */  
    public static double getRandomNumber(Random rand){
        double random = rand.nextInt(50);
        return random;
    }
}
