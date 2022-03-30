/*
Thor Long
2/6/2022
CSE 007
Converter from farenheit to celsius
*/

import java.util.Scanner;
public class TempConverter2{

    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the temp in degrees FARENHEIT");
        double farenheit;
        farenheit = scnr.nextDouble();

        double celsius =  (farenheit - 32.0) * (5.0/9.0); //Make sure you have the .0s to type cast to doubles

        System.out.println(farenheit + " degrees farenheit is " + celsius + " degrees celsius.");

    }
}