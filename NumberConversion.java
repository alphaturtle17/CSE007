/*
Thor Long
CSE 007
2/15/2022
Homework 2 converting various numbers into decimal values
VSCode

The numbering systems are binary, decimal, and hexadecimal.
Binary is an important numbering system because that's what computers run on, meaning we need
    binary to communicate with the computers
Hexadecimal numbering system is used with programming to refer to memory location of errors
Decimal numbering system is used as real world counting, since it's base 10.
2147483647 is the biggest number an int can hold, that in binary is 0b1111111111111111111111111111111 (31 1s) 
*/
import java.util.Scanner;
public class NumberConversion {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a type (hex, octal, binary):");~
        String inputString = scnr.next();
        switch(inputString){
            case "hex":
                System.out.println("Enter a number (must be 2 digit hexadecimal)");
                String hex;
                hex = scnr.next();
                String digits = "0123456789ABCDEF"; //These are honestly the big thing that matter
                int value = 0;
                for(int i = 0; i < hex.length(); i++){
                    char c = hex.charAt(i);
                    int d = digits.indexOf(c);
                    value = 16 * value + d;
                }
                System.out.println("The decimal equivalent of the hex number " + hex + " is " +value);
            break;
            case "binary":
                System.out.println("Enter a number (must be 4 bits):"); // This counts it all and multiplies each bit by the corresponding position
                String binary = scnr.next();
                int decimal = 0;
                int base = 1;
                int length = binary.length();
                for (int i = length - 1; i >=0; i--){
                    if(binary.charAt(i) == '1'){
                        decimal += base;
                        base = base * 2;
                    }
                }
                System.out.println("The decimal equivalent of the binary number " + binary + " is " + decimal);
            break;
            case "octal":
                System.out.println("Enter a number (must be 3 digit octal):");
                int octal = scnr.nextInt();
                int octal1 = octal;
                int result = 0;
                int n = 0;
                while(true){
                    if(octal == 0){
                        break;
                    }else{
                        int thing = octal % 10;//really iinteresting fact that I didn't even know what an octal was, so this was very informational in that sense
                        result += thing * Math.pow(8,n);
                        octal = octal/10;
                        n++;
                    }
                }
                System.out.println("The decimal equivalent of the octal number " + octal1 + " is " + result);
            break;
            default:
                System.out.println("Error: Invalid Type");
            break;
        }

        scnr.close();
    }
}
