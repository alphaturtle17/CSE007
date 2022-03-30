/*
Thor Long
CSE 007
2/9/2022
Seasons if statements producing the season
*/

import java.util.Scanner;
public class SeasonsIf {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a date as month then day");
        String userMonth = scnr.next(); //Read first as a String
        int userDay = scnr.nextInt(); //Read second as an int
        userMonth = userMonth.toLowerCase(); //Accounts for all cases of capitals
        if((userMonth.equals("march") && userDay >= 20)|| userMonth.equals("april") || userMonth.equals("may") || (userMonth.equals("june") && userDay <= 20)){
            System.out.println("It is Spring!");
        }
        if((userMonth.equals("june") && userDay >= 21)|| userMonth.equals("july") || userMonth.equals("august") || (userMonth.equals("september") && userDay <= 21)){
            System.out.println("It is Summer!");
        }
        if((userMonth.equals("september") && userDay >= 22)|| userMonth.equals("october") || userMonth.equals("november") || (userMonth.equals("december") && userDay <= 20)){
            System.out.println("It is Autumn!");
        }
        if((userMonth.equals("december") && userDay >= 21)|| userMonth.equals("january") || userMonth.equals("february") || (userMonth.equals("march") && userDay <= 19)){
            System.out.println("It is Spring!");
        }
    }
}
