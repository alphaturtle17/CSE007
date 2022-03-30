/*
Thor Long
CSE 007
2/22/2022
Respect.java prompts a selection statement to print out a message (string) in 4 different patterns STILL NEED C
*/
import java.util.Scanner;
public class Respect {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        String userInput = "x"; //Just default the get out of program just in case
        String userString = "what"; //Placeholder so they don't yell at me
        do{
            System.out.println("Input a character (A, B, C, or D) to correspond to a pattern. Type 'X' to exit.");
            userInput = scnr.next();
            userInput = userInput.toLowerCase(); //Make sure everything isn't case sensitive

            switch(userInput){
                case "a":
                    System.out.println("Enter a message in you want to see in the pattern."); //Just prompt the message afterwards
                    userString = scnr.next();
                    /*
                    R
                    R E
                    R E S
                    R E S P E
                    R E S P E C
                    R E S P E C T
                    */
                    for(int rows = 0; rows < userString.length(); rows++){
                        for(int col = 0; col <= rows ; col++){
                            System.out.print(userString.charAt(col) + " ");
                        }
                        System.out.println();
                    }
                    return;
                case "b":
                    System.out.println("Enter a message in you want to see in the pattern.");
                        userString = scnr.next();
                    /*
                    R E S P E C T
                    R E S P E C
                    R E S P E 
                    R E S P
                    R E S
                    R E
                    R
                    */

                    for(int rows = userString.length(); rows >= 0; rows--){
                        for(int col = 0; col < rows; col++){
                            System.out.print(userString.charAt(col) + " ");
                        }
                        System.out.println();
                    }
                    return;
                case "c":
                    System.out.println("Enter a message in you want to see in the pattern.");
                    userString = scnr.next();
                    /*
                                R
                              E R
                            S E R
                          P S E R
                        E P S E R
                      C E P S E R
                    T C E P S E R
                    */
                    for(int row = 0; row < userString.length(); row++){
                        for(int blanks = userString.length() - 1; blanks >= row; blanks--){
                            System.out.print(" ");
                        }
                        for(int column = row; column >= 0; column--){
                            System.out.print(userString.charAt(column));
                        }
                        System.out.println();
                    }
                    return;
                case "d":
                    System.out.println("Enter a message in you want to see in the pattern.");
                    userString = scnr.next();
                    /*
                    T C E P S E R
                    C E P S E R
                    E P S E R
                    P S E R
                    S E R
                    E R
                    R
                    */
                    for(int rows = userString.length(); rows >= 0; rows--){
                        for(int col = rows - 1; col >= 0; col--){
                            System.out.print(userString.charAt(col) + " ");
                        }
                        System.out.println();
                    }
                    return;
                case "x": //X breaks out of the loop, so it then checks X typed in so it doesn't trigger the default invalid response
                    break;
                default:
                    System.out.println("Invalid response, try again!\n"); //Try again, error message for invalid character.
                    break;
            }
        }while(!"x".equals(userInput.toLowerCase())); //Checks if X is typed in, and stops if it does.
        scnr.close();
    }
}
