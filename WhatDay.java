/*
Thor Long
CSE 007
2/22/2022
Checks user input month/day/year and sees/spits out what day of the week it is
Coded on VSCODE
*/
import java.util.Scanner;
public class WhatDay {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        boolean running = true; //Running is to kill the whole program just in case, might not use this tbh because I can just do return;
        boolean inMonth = true; //These are to make sure the while loops trigger
        boolean inDay = true;
        boolean inYear = true; 
        do{
            System.out.println("Input the month as an integer, inclusive 1-12"); //First prompt
            do{
            if(scnr.hasNextInt() == false){
                inMonth = false;
                System.out.println("Wrong type, please input the month as an integer, inclusive 1-12"); //Wrong type for month
                scnr.nextLine();
            }else{
                int month = scnr.nextInt();
                if(month >= 1 && month <=12){
                    do{
                        System.out.println("Input the day as an integer, inclusive 1-31"); //Second prompt
                        if(scnr.hasNextInt() == false){
                            inDay = false;
                            System.out.println("Wrong type, please input a day between 1-31"); //Wrong type for day
                            scnr.nextLine();
                        }else{
                            int day = scnr.nextInt();
                            if(day >= 1 && day <= 31){
                                do{
                                    System.out.println("Input the year as an integer, inclusive 1700-2399"); //Third prompt
                                    if(scnr.hasNextInt() == false){
                                        inYear = false;
                                        System.out.println("Wrong type, please input a year between 1700-2399"); //Wrong type for year, all three spit you back to the beginning
                                        scnr.nextLine();
                                    }else{
                                        int year = scnr.nextInt();
                                        if(year >= 1700 && year <= 2399){
                                            int yy = year % 100;
                                            int yearCode = (yy + (yy / 4)) % 7;

                                            int monthCode = 0;

                                            int centCode = 0;
                                            int century = (int) year / 100;

                                            int leapYear = 0;
                                            switch(month){ //Manually assigning month codes since I don't see any pattern for this
                                                case 1:
                                                    monthCode = 0;
                                                    break;
                                                case 2:
                                                    monthCode = 3;
                                                    break;
                                                case 3:
                                                    monthCode = 3;
                                                    break;
                                                case 4:
                                                    monthCode = 6;
                                                    break;
                                                case 5:
                                                    monthCode = 1;
                                                    break;
                                                case 6:
                                                    monthCode = 4;
                                                    break;
                                                case 7:
                                                    monthCode = 6;
                                                    break;
                                                case 8:
                                                    monthCode = 2;
                                                    break;
                                                case 9:
                                                    monthCode = 5;
                                                    break;
                                                case 10:
                                                    monthCode = 0;
                                                    break;
                                                case 11:
                                                    monthCode = 3;
                                                    break;
                                                case 12:
                                                    monthCode = 5;
                                                    break;
                                            }
                                            switch(century){ //Manually assigning century codes
                                                case 17:
                                                    centCode = 4;
                                                    break;
                                                case 18:
                                                    centCode = 2;
                                                    break;
                                                case 19:
                                                    centCode = 0;
                                                    break;
                                                case 20:
                                                    centCode= 6;
                                                    break;
                                                case 21:
                                                    centCode = 4;
                                                    break;
                                                case 22:
                                                    centCode = 2;
                                                    break;
                                                case 23:
                                                    centCode = 0;
                                                    break;
                                            }
                                            if(year % 4 == 0){ //These are formatted this way so the progression can check all of them and override as necessary
                                               leapYear = 1;
                                            }
                                            if(year % 100 == 0){ //That way the first checks if it's div by 4, the next cancels it out if div by 100
                                                leapYear = 0;
                                            }
                                            if(year % 400 == 0){ //And the third one overrides the div 100 with 400
                                                leapYear = 1;
                                            }

                                            int dayOTW = (yearCode + monthCode + centCode + day - leapYear) % 7;
                                            switch(dayOTW){ //Using case for each dayOTW code to give a meaningful output that isn't just a number on a screen
                                                case 1:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Monday!");
                                                    break;
                                                case 2:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Tuesday!");
                                                    break;
                                                case 3:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Wednesday!");
                                                    break;
                                                case 4:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Thursday!");
                                                    break;
                                                case 5:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Friday!");
                                                    break;
                                                case 6:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Saturday!");
                                                    break;
                                                case 0:
                                                    System.out.println(month + "/" + day +"/" + year + " is a Sunday!");
                                                    break;
                                            }
                                            return;
                                        }else{
                                            System.out.println("Out of range, please write in bounds 1700-2399"); //Right type, wrong range
                                        }
                                    }
                                }while(!inYear);
                            }else{
                                System.out.println("Out of range, please write in bounds 1-31"); //Right type, wrong range
                            }
                        }
                    }while(!inDay);
                }else{
                    System.out.println("Out of range, please write in bounds 1-12"); //Right type, wrong range
                }
            }
            }while(!inMonth);
        }while(running == true);
        scnr.close(); //No open scanners in this house
    }
}
