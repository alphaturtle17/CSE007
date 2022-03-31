/*
Thor Long
3/31/2022
Overload overage is practice with overloading the uh methods making sure it's super good and cool while also practicing making methods and calling using that logic
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class OverloadAverage {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int [] array1 = new int[10];
        double [] array2 = new double[10];
        boolean letter = false;

        do{
            System.out.println("Enter a number between 2 and 25, represents the length of the array");
        }while(intValidation() == false);
        String choice = "";
        do{
            System.out.println("Enter a character, i or d, representing the type of array to be created");
            choice = scnr.next();
            switch(choice.toLowerCase()){
                case "i":
                    letter = true;
                break;
                case "d":
                    letter = true;
                break;
                default:
                    System.out.println("Wrong input"); //kinda figured that would be easiest
                    letter = false;
                break;
            }
        }while(letter == false);

        if(choice.equals("i")){ //ah yes meaningful output, but it looks so good with the methods
            fillArray(array1);
            printArray(array1);
            System.out.println("The average of your array is: " + findAverage(array1));
        }
        if(choice.equals("d")){
            fillArray(array2);
            printArray(array2);
            System.out.println("The average of your array is: " + findAverage(array2));
        }
        scnr.close();
    }

    public static void fillArray(int [] iarray){
        Random rand = new Random();
        for(int i = 0; i < iarray.length; i++){
            iarray[i] = rand.nextInt(100); //Change using rand.nextInt(100); to make each a random 
        }
    }

    public static void fillArray(double [] darray){
        Random rand = new Random();
        for(int i = 0; i < darray.length; i++){
            darray[i] = rand.nextInt(100);
        }
    }
    
    public static void printArray(int [] iarray){
        System.out.println(Arrays.toString(iarray)); //Make it nice
    }

    public static void printArray(double [] darray){
        System.out.println(Arrays.toString(darray));
    }

    public static double findAverage(int [] iarray){
        double total = 0;
        for(int i = 0; i < iarray.length; i++){
            total = total + iarray[i];
        }
        return total/iarray.length; //literally average
    }

    public static double findAverage(double [] darray){
        double total = 0;
        for(int i = 0; i < darray.length; i++){
            total = total + darray[i];
        }
        return total/darray.length; //same
    }

    public static boolean intValidation(){ //so nice just calling intValidation() one time in a tiny while loop
        Scanner scnr = new Scanner(System.in);
        boolean good = false;
        if(scnr.hasNextInt() == false){
            System.out.println("Wrong input type");
            good = false;
            scnr.nextLine();
        }else{
            System.out.println("Valid data type");
            good = true;
        }
        scnr.close();
        return good;
    }
}
