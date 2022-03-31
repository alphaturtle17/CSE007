/*
Thor Long
CSE 007
Spring 2022
Java ATM
CHANGELOG 3/3/2022 Added arrays to hold account number, pins, and balances for 10 respective accounts. Edited all instances to have an index of 
"accountArgs" since all the indexes of the accounts are the same across the board. This is used for accountArr[], and balanceArr[] since they
are both repeated back to the user at different times. I also deleted the set values for balance pin and account, since those are now irrelivant. 
*/
import java.util.Scanner;

public class ATM {
    public static void main (String args[]){
        boolean atm = true;
        boolean running = true;
        boolean loggedIn = false;
        int userChoice;     
        int input;
        int [] accountArr = {99999, 12345, 84670, 24360, 11111, 19241, 92837, 88888, 332244, 28394};
        int [] pinArr = {9999, 1234, 8467, 2436, 1111, 1924, 9283, 8888, 3224, 2839};
        double [] balanceArr = {1000, 1231, 999999, 2134, 15324, 12345, 34235, 2351, 122, 19039};
        final int VIEW_BALANCE = 1;
        final int WITHDRAW = 2;
        final int DEPOSIT = 3;
        final int EXIT = 4;
        final int CANCEL = 7;

        /*
        getAuthentication() //Get pin and account number and verify
        userChoice = displayMenu(); 
        getBalance(); //Return balance
        getWithdraw(int ); //Subtract, then return balance in the end
        depositAmount = getDeposit(); //Deposit amount

        */

        boolean good = true;
        Scanner scnr = new Scanner(System.in);


        while(atm == running){
            do{
                System.out.println("Input Account Number:");
                if(scnr.hasNextInt() == false){
                    good = false;
                    System.out.println("Incorrect type");
                    scnr.nextLine();
                }else{
                    int accInput = scnr.nextInt();
                    boolean accountAccess = false;
                    int i = 0;
                    int accountArgs = 0;

                    for(i = 0; i < accountArr.length; i++){
                        if(accInput == accountArr[i]){
                            accountArgs = i;
                            accountAccess = true;
                        }
                    }
                    if(accountAccess == true){
                        System.out.println("Input PIN:");
                        int pinInput = scnr.nextInt();
                        boolean pinAccess = false;

                        for(int j = 0; j < pinArr.length; j++){
                            if(pinInput == pinArr[j]){
                                pinAccess = true;
                            }
                        }
            
                        if(pinAccess == true){
                            loggedIn = true;
                            System.out.println("Logged in!\n");
        
                            while(loggedIn == running){
                               
                                System.out.println("Main Menu:");
                                System.out.println("1 - View Balance");
                                System.out.println("2 - Withdraw Cash");
                                System.out.println("3 - Deposit Funds");
                                System.out.println("4 - Exit");
                                System.out.println("Account number " + accountArr[accountArgs] + " pin number " + pinArr[accountArgs] + " has a balance of " + balanceArr[accountArgs]);
                                userChoice = scnr.nextInt();
                                
                                switch(userChoice){
                                    case VIEW_BALANCE:
                                        System.out.println("\nView Balance");
                                        System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                        break;
                                    case WITHDRAW:
                                        do{
                                            System.out.println("\nHow much do you want to Withdraw?");
                                            System.out.println("1 - $20");
                                            System.out.println("2 - $50");
                                            System.out.println("3 - $80");
                                            System.out.println("4 - $100");
                                            System.out.println("5 - $200");
                                            System.out.println("6 - $500");
                                            System.out.println("7 - Cancel Transaction");
                                            input = scnr.nextInt();
                                            switch(input){
                                                case 1:
                                                if(balanceArr[accountArgs] >= 20){
                                                    balanceArr[accountArgs] -= 20;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                case 2:
                                                if(balanceArr[accountArgs] >= 50){
                                                    balanceArr[accountArgs] -= 50;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                case 3:
                                                if(balanceArr[accountArgs] >= 80){
                                                    balanceArr[accountArgs] -= 80;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                case 4:
                                                if(balanceArr[accountArgs] >= 100){
                                                    balanceArr[accountArgs] -= 100;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                case 5:
                                                if(balanceArr[accountArgs] >= 200){
                                                    balanceArr[accountArgs] -= 200;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                case 6:
                                                if(balanceArr[accountArgs] >= 500){
                                                    balanceArr[accountArgs] -= 500;
                                                    System.out.println("Your balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                                
                                                }else{
                                                    System.out.println("Insufficient Funds");
                                                }break;
                                                }
                                        }while(input != CANCEL);
                                        break;
                                    case DEPOSIT:
                                        System.out.println("\nHow much do you want to deposit?");
                                        int depositAmount = scnr.nextInt();
                                        balanceArr[accountArgs] += depositAmount;
                                        System.out.println("Your new balance for account number '" + accountArr[accountArgs] + "' is: " + balanceArr[accountArgs] + "\n");
                                        break;
                                    case EXIT:
                                        System.out.println("\nGoodbye have a nice day!");
                                        running = false;
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                        break;
                                }
                            }
                        }else{
                            System.out.println("Invalid PIN\n");
                        }
                    }else{
                        System.out.println("Invalid Account Number\n");
                    }      
                }
            }while(!good);
        }
        scnr.close();
        System.exit(0);
    }




}
