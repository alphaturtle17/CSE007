/*
Thor Long
2/24/2022
CSE 007
This program checks to see if palendromes exist, using integers as well as strings. Other data types like floats are read as strings and can also compile
in order to make this easier too :)
Coded on VSCODE
*/
import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        boolean running = true;
        do{
            System.out.println("Enter a phrase or number to check if it's a palindrome");
            if(scnr.hasNextInt() == true){
                while(running == true){ //Guess we gotta loop so these bozos don't type out of range
                    int number = scnr.nextInt();
                    int temp = number;
                    int digit = 0;
                    int reverse = 0;
                    if(number >= 11 && number <= 100000){ //Must be between
                        while(temp != 0){
                            digit = temp % 10;
                            reverse = reverse * 10 + digit;
                            temp /= 10;
                        }
                        System.out.println("Is " + number + " a palendrome? " + (reverse == number)); //Why not just check the true/false value at the very end
                        running = false;
                    }else{
                        System.out.println("Out of range, please type a number 11-100000"); //Yell at em
                    }
                }
            }else{
                boolean stringPal = true; //Defaults the palendrome to be true so I only need to look one way
                String stringy = scnr.nextLine(); //Stringy
                int first = 0;
                int last = stringy.length() -1;
                while(first < last){
                    if(stringy.charAt(first) != stringy.charAt(last)){
                        stringPal = false;
                        break;
                    }
                    first++;
                    last--;
                }
                System.out.println("Is " + stringy + " a palendrome? " + stringPal); //Is it???
                running = false;
            }

        }while(running == true);
        scnr.close();
    }
}
