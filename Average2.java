/*
Thor Long
CSE 007
2/16/22
Average of 5 numbers again
vscode
*/
import java.util.Scanner;
public class Average2 {
   public static void main(String[]args){
       Scanner scnr = new Scanner(System.in);
       int sum=0;
       int counter = 0;
       int numVals = 0;
       System.out.println("Enter the number of integers that you want to average");
       while(true){ //always check for the valid output
           boolean correct = scnr.hasNextInt(); //returns a boolean value to compare
           if(correct){
               numVals = scnr.nextInt();                
               break; //the only thing that will end this loop
           }else{
               System.out.println("You entered an invalid value; Try again:");
               String junk = scnr.next();
           }
       }
       while(counter< numVals){ //loop to read in five values
           System.out.println("Enter an integer value");
           while(true){ //infinite loop to check for valid input
               boolean correct = scnr.hasNextInt(); //returns a boolean value
               if(correct){
                   int val = scnr.nextInt();
                   sum += val;
                   counter++;
                   break; //end the loop
               }else{
                   System.out.println("You entered an invalid value; Try again:");
                   String junk = scnr.next(); //since we didn't find an Int, we have to clear whatever was there
               }
           }
       }
       double average = (double) sum/numVals; //make sure your answer isn't truncated
       System.out.println("The average is " + average);
       scnr.close();
   }
}
