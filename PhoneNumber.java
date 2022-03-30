/*
Thor Long
2/4/2022
Phone number program, formats a 10 digit phone 
number to be read easily.
*/
import java.util.Scanner;
public class PhoneNumber {
    public static void main(String args[]){
        long phoneNumber;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a 10 digit phone number");
        phoneNumber = scnr.nextLong();
        long right = phoneNumber % 10000; //Seperates the different segments of the big 10 digit number
        phoneNumber = phoneNumber / 10000;
        long middle = phoneNumber % 1000;
        phoneNumber = phoneNumber / 1000;
        System.out.println("Formatted phone number: "+ "("+ phoneNumber + ") " + middle + "-" + right); //Nice

    }
}
