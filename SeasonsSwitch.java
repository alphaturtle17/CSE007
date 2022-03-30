/*
Thor Long
CSE 007
2/9/2022
Seasons switch statements producing the season
*/
import java.util.Scanner;
public class SeasonsSwitch {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a date as month then day");
        String userMonth = scnr.next(); //Read first as a String
        int userDay = scnr.nextInt(); //Read second as an int
        userMonth = userMonth.toLowerCase(); //Accounts for all cases of capitals
        switch(userMonth){
            case "march":
                switch(userDay){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    System.out.println("It is Winter!");
                    break;
                }
                System.out.println("It is Spring!");
            break;
            case "april":
                System.out.println("It is Spring!");
            break;
            case "may":
                System.out.println("It is Spring!");
            break;
            case "june":
            switch(userDay){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                System.out.println("It is Spring!");
                break;
            }
            switch(userDay){
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                System.out.println("It is Summer!");
                break;
            }
            break;
            case "july":
                System.out.println("It is Summer!");
            break;
            case "august":
                System.out.println("It is Summer!");
            break;
            case "september":
            switch(userDay){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                System.out.println("It is Summer!");
                break;
            }
            switch(userDay){
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                System.out.println("It is Autumn!");
                break;
            }
            break;
            case "october":
                System.out.println("It is Autumn!");
            break;
            case "november":
                System.out.println("It is Autumn!");
            break;
            case "december":
            switch(userDay){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                System.out.println("It is Autumn!");
                break;
            }
            switch(userDay){
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                System.out.println("It is Winter!");
                break;
            }
            break;
            case "january":
                System.out.println("It is Winter!");
            break;
            case "february":
                System.out.println("It is Winter!");
            break;
        }
    }
}
