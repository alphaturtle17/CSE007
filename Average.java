/*
Thor Long
CSE 007
Average value of 5 numbers
*/
import java.util.Scanner;
public class Average {
   public static void main(String args[]){
       System.out.println("Type in 5 digits, press enter between each value");
       Scanner scnr = new Scanner(System.in);
       int sum = 0;
       int counter = 0;

       while(counter< 5){ //loop to read in five values
             boolean correct = scnr.hasNextInt(); //returns a boolean value
             if(correct){
                 int val = scnr.nextInt();
                 sum += val; // sum = sum + val; is equivalent
                 counter++; //counter = counter + 1; is equivalent
             }else{
                 System.out.println("You entered an invalid value; Try again:");
                 String junk = scnr.next(); //since we didn't find an Int clear whatever was there
               }
           }
           double average = sum/5.0;
           System.out.println("The average is " + average);
           scnr.close();
       }
   }

