/*
Thor Long
3/31/2022
Lab 7
This program calculates the taxes need to be done using the american tax system
*/
import java.util.Scanner;
public class CalculateTaxes {

    final static double TEN_PCT = 0.1; //funny numbers that are always percentages
    final static double TWELVE_PCT = 0.12;
    final static double TWENTY_TWO_PCT = 0.22;
    final static double TWENTY_FOUR_PCT = 0.24; 
    public static void main(String argsp[]){
        Scanner scnr = new Scanner(System.in);
        double wages, interest, unemployComp, withheld;
        int status, tax, agi, due, deduction, taxable;
        
        System.out.println("Enter your wage"); //long slieu of input statements
        wages = getDouble(scnr);
        System.out.println("Enter the amount of interest");
        interest = getDouble(scnr);
        System.out.println("Enter the amount of unemployment compensation");
        unemployComp = getDouble(scnr);
        System.out.println("Enter status (0-dependent, 1-single, 2-married");
        status = getInt(scnr);
        System.out.println("Enter the amount of taxes withheld");
        withheld = getDouble(scnr);

        // Calculate AGI and taxable amount
        agi = computeAGI(wages, interest, unemployComp);
        System.out.printf("AGI: $%,d\n", agi);

        deduction = getDeduction(status);
        System.out.printf("Deduction: $%,d\n", deduction);
            
        // Calculate taxable income
        taxable = getTaxable(agi, deduction);
        System.out.printf("Taxable income: $%,d\n", taxable);

        // Calculate tax 
        tax = calcTax(status, taxable);   
        System.out.printf("Federal tax: $%,d\n", tax);
        
        // Calculate tax due
        due = calcTaxDue(tax, withheld);
        System.out.printf("Tax due: $%,d\n", due);

    }

    public static double getDouble(Scanner scnr){
        double returnVal = 0.0;
        boolean good = false;
        do{
            System.out.println("Input positive double value "); //We want a double and we want it now
            if(scnr.hasNextDouble() == true){
                returnVal += scnr.nextDouble();
                if(returnVal > 0){
                    good = true;
                }else{
                    System.out.println("Must be positive");
                    scnr.nextLine();
                    good = false;
                }
            }else{
                System.out.println("Invalid data type");
                scnr.nextLine();
                good = false;
            }

        }while(good == false);

        return returnVal;
    }

    public static int getInt(Scanner scnr){ //Gets the status of the taxpayer, but an int 012
        int status = 0;
        boolean good = false;
        do{
            System.out.println("Enter an integer");
            if(scnr.hasNextInt() == true){
                status = scnr.nextInt();
                switch(status){
                    case 0:
                    case 1:
                    case 2:
                        good = true;
                        break;
                    default:
                        System.out.println("Invalid number");
                        scnr.nextLine();
                        good = false;
                        break;
                }
            }else{
                System.out.println("Invalid data type");
                scnr.nextLine();
            }
        }while(good == false);

        return status;
    }

    //Adjusted gross income
    public static int computeAGI(double wages, double interest, double unemployment){
        double agi;
        agi = Math.abs(wages);
        agi += Math.abs(interest);
        agi += Math.abs(unemployment);
        return (int) agi;
    }

    public static int getDeduction(int status){ //assigning deduction values to the marital status of each person
        int deduction = 0;
        switch(status){
            case 0:
            deduction = 6000;
            break;
            case 1:
            deduction = 12000;
            break;
            case 2:
            deduction = 24000;
            break;
        }
        return deduction;
    }

    public static int getTaxable(int agi, int deduction){ //deductions are taken off of the AGI before taxes are taken
        int taxable;
        taxable = agi - deduction;
        if(taxable < 0){
            taxable = 0;
        }
        return taxable;
    }

    public static int calcTax(int status, int taxable){ //math
        double tax = 0.0;
        // Married
        if (status == 2) {
            if(taxable > 80000){
            tax = (taxable-80000) * TWENTY_TWO_PCT + 9200;
            }
            else if(taxable > 20000){
            tax = (taxable-20000) * TWELVE_PCT + 2000; 
            }else{
            tax = taxable * TEN_PCT;
            }
        } 
        // Single or dependent
        else {
            if(taxable > 85000) {
            tax = (taxable-85000) * TWENTY_FOUR_PCT + 14500;
            }
            else if(taxable > 40000) {
            tax = (taxable-40000) * TWENTY_TWO_PCT + 4600;
            }
            else if(taxable > 10000) {
            tax = (taxable-10000) * TWELVE_PCT + 1000; 
            }
            else {
            tax = taxable * TEN_PCT;
            }
        }
        tax = Math.round(tax);
        return (int) tax;
    }

    public static int calcTaxDue(int tax, double withheld){ //make sure that there's nothing withheld
        double due;
        if(withheld < 0){
            withheld = 0;
        }
        due = tax - withheld;
        return (int) due;
    }
}
