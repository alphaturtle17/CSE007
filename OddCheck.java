/*
Thor Long
CSE 007
2/7/2022
Check if a number is Odd or Even
*/
import java.util.Scanner;

public class OddCheck {
   public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("Input a number");
      int inputNum = myScanner.nextInt();
   
      if (inputNum % 2 != 0) { //fill in the conditional expression to check if inputNum is odd (not using any other classes)
        System.out.println(inputNum+ " is an odd number.");
      }
      else { //if the inputNum isn't odd, then it must be even
        System.out.println(inputNum+ " is an even number.");
      } 

      myScanner.close();
   }
}