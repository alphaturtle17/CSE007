/*
Thor Long
2/25/2022
Spits out the factorial of the input number

*/
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        boolean good = true;
        int userNum = 0;
        do{
            System.out.println("Please enter a positive integer: ");
            if(scnr.hasNextInt() == false){
                System.out.println("Invalid response"); //Entered a string or some other stuff
                    good = false;
                scnr.nextLine();
            }else{
                userNum = scnr.nextInt();
                if(userNum < 0){
                    System.out.println("Integer out of range, must be positive"); //No negative numbers allowed.
                    good = false;
                }else{
                    good = true;
                    int factorial = 1;
                    for(int i = 1; i <= userNum; i++){ //This worked like last minute
                        factorial = factorial * i;
                    }
                    System.out.println("The factorial of " + userNum + " is " + factorial);
        
                    continue;
                }
                }
            }while(!good);
 
    }
}
