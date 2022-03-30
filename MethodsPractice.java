/*
Thor Long
3/23/2022
Method Classwork Practice
*/
import java.util.Scanner;
public class MethodsPractice{
    public static void main(String args[]){
        boolean correct = false;
        int num;
        do{
            num = getInt();
            correct = getIntRange(10, 20, num);
        }while(!correct);
    }
    public static int getInt(){
        Scanner scnr = new Scanner(System.in);
        boolean correct;
        int num = 0;
        do{
            System.out.println("Enter an integer");
            correct = scnr.hasNextInt();
            if(!correct){
                System.out.println("Invalid type, you didn't enter an integer");
                scnr.nextLine();
            }else{
                num = scnr.nextInt();
            }
        }while(!correct);
        return num;
    }
    public static boolean getIntRange(int num1, int num2, int num){
        if(num >= num1 && num <= num2){
            System.out.println("Number is within the range!");
            return true;
        }else{
            System.out.println("Integer is not within the range");
            return false;
        }
    }

}