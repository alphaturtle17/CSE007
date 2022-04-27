/*
Thor Long
4/20/2022
Lab that does the equation using only my own class Calculator. It is preset to answer the 
assigned expression to evaluate, in order x y z for inputs.
*/
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        Calculator calc = new Calculator();

        double x = 0;       
        double y = 0;
        double z = 0;

        System.out.println("Enter a value for x");
        x = checkNum(scnr);

        System.out.println("Enter a value for y");
        y = checkNum(scnr);

        System.out.println("Enter a value for z");
        z = checkNum(scnr);

        calc.add(4);
        calc.multiply(y);
        calc.multiply(y);
        calc.multiply(z);
        double t1 = calc.getValue(); //Assign each term to a value so it can get addded or subtracted individually OOA
        calc.clear();

        calc.add(2);
        for(int i = 0; i < x; i++){
            calc.multiply(y);
        }
        double t2 = calc.getValue();
        calc.clear();

        calc.subtract(7);
        calc.multiply(x);
        double t3 = calc.getValue();
        calc.clear();

        calc.add(t1);
        calc.add(t2);
        calc.add(t3);
        double numerator = calc.getValue();
        calc.clear();

        calc.add(5);
        calc.multiply(x);
        calc.multiply(y);
        double t4 = calc.getValue();
        calc.clear();

        calc.add(7);
        calc.multiply(z);
        double t5 = calc.getValue();
        calc.clear();

        calc.subtract(x);
        double t6 = calc.getValue();
        calc.clear();
        
        calc.add(t4);
        calc.add(t5);
        calc.add(t6);
        double denominator = calc.getValue();
        calc.clear();

        calc.add(numerator);
        calc.divide(denominator);

        System.out.println("The answer to this specific equation is: " + calc.getValue());

    }
    //@param scnr
    //@return number int
    public static int checkNum(Scanner scnr){
        boolean good = false;
        int number = 0;
        do{
            System.out.println("Enter an integer");
            if(scnr.hasNextInt() == true){
                number = scnr.nextInt();
                good = true;
            }else{
                System.out.println("Invalid data type");
                scnr.nextLine();
                good = false;
            }
        }while(good == false);
        return number;
    }

}
