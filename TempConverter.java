/*
Thor Long
2/6/2022
CSE 007
Converter from celsius to farenheit
*/

import java.util.Scanner;
public class TempConverter{

    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the temp in degrees CELSIUS");
        double celsius;
        celsius = scnr.nextDouble();

        double farenheit =  celsius*(9.0/5.0)   + 32.0; //Make sure you have the .0s to type cast to doubles

        System.out.println(celsius + " degrees celsius is " + farenheit + " degrees farenheit.");

    }
}