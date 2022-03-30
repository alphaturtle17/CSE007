/*
Thor Long
CSE 007
2/15/2022
Homework 2
Creates a program to test math skills
VSCode
*/
import java.util.Scanner;
public class MathMenu {
    public static void main(String args[]){
        System.out.println("Welcome to the Math Program");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Enter your choice:");

        Scanner scnr = new Scanner(System.in);
        int selection = 1;
        selection = scnr.nextInt();
        if(selection == 1 || selection == 2 || selection == 3 || selection == 4){ //Checks to see if you made a correct selection
            int num1 = (int)(Math.random()*52+1);
                                                    //Initialize two random integers 
            int num2 = (int)(Math.random()*52+1);
            switch(selection){
                case 1:
                System.out.println("What is " + num1 + " + " + num2); //These just go 
                int input = scnr.nextInt();
                if(input == num1+num2){
                    System.out.println("You are correct!");
                }else{
                    System.out.println("You are incorrect :(");
                }
                break;
                case 2:
                System.out.println("What is " + num1 + " - " + num2);
                int input2 = scnr.nextInt();
                if(input2 == num1-num2){
                    System.out.println("You are correct!");
                }else{
                    System.out.println("You are incorrect :(");
                }
                break;
                case 3:
                System.out.println("What is " + num1 + " X " + num2);
                int input3 = scnr.nextInt();
                if(input3 == num1*num2){
                    System.out.println("You are correct!");
                }else{
                    System.out.println("You are incorrect :(");
                }
                break;
                case 4:
                System.out.println("What is " + num1 + " / " + num2 + "(use integer division)");
                int input4 = scnr.nextInt();
                if(input4 == num1/num2){
                    System.out.println("You are correct!");
                }else{
                    System.out.println("You are incorrect :(");
                }
                break;
            }
        }else{
            System.out.println("Invalid selection");
        }
        scnr.close();
    }
}
