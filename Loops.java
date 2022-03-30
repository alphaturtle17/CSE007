import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int counter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        int total = 0;
        double average;
        boolean good = true;
        int userNum = 0;

        do{
            //Inner do loops checks for int betweel -100 -> 100
            do{
                System.out.println("Enter an integer between -100 and 100 (inclusive), the input ends if it is 0");
                if(scnr.hasNextInt() == false){
                    good = false;
                    System.out.println("You entered an invalid value");
                    scnr.nextLine();
                }else{
                    userNum = scnr.nextInt();
                    if(userNum < -100 || userNum > 100){
                        System.out.println("Integer out of range. Must be from -100 to 100");
                        good = false;
                    }else{
                        good = true;
                    }
                }
            }while(!good);
            if(userNum < 0){
                negativeCounter = negativeCounter + 1;
                total += userNum;
                counter += 1;
            }else if(userNum > 0){
                positiveCounter = positiveCounter + 1;
                total += userNum;
                counter += 1;
            }
            if(counter > 0){
                average = total / counter;
                System.out.println("Average: " + average);
                System.out.println("Positive counter: " + positiveCounter);
                System.out.println("Negative counter: " + negativeCounter); 
            }else{
                System.out.println("No numbers were entered for the list");
            }
        }while(userNum != 0);
    }
}