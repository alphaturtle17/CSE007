import java.util.Scanner;
public class BankManager{

    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        BankAccount [] bankAcctList = new BankAccount[10];
        bankAcctList[0] = new CheckingAccount(379661,"Alesia, Hixenbaugh","Checking",15691.31);
        bankAcctList[1] = new CheckingAccount(178176,"Lai,Harabedian    ","Checking",3381.99);
        bankAcctList[2] = new CheckingAccount(781741,"Brittni,Gillaspie ","Checking",29384.16);
        bankAcctList[3] = new CheckingAccount(833783,"Jani,Biddy        ","Checking",1001.66);
        bankAcctList[4] = new CheckingAccount(144152,"Chauncey,Motley   ", "Checking",32364.91);
        bankAcctList[5] = new SavingsAccount(113197,"Josephine,Darakjy  ","Savings ",8953.61,6.87);
        bankAcctList[6] = new SavingsAccount(152889,"Art,Venere         ", "Savings ", 88527.96,0.07);
        bankAcctList[7] = new SavingsAccount(883228,"Raylene,Kampa      ","Savings ",3902.02,7.85);
        bankAcctList[8] = new SavingsAccount(149236,"James,Butt         ", "Savings ",53209.73,3.25);
        bankAcctList[9] = new SavingsAccount(129855,"Flo,Bookamer       ","Savings ",8812.16,1.99);  
        Bank myBank = new Bank("Lehigh University Bank","Bethlehem",bankAcctList); //
        Bank.monthlyFee = 20;
        int choice;
        do{ 
        choice = bankMenu(myScanner);
        switch (choice){
            case 1: manageAcct(myScanner,myBank);
                break;
            case 2: myBank.viewAllAccounts();
                break;
            case 3: myBank.applyMonthlyFee();
                    myBank.viewAllAccounts();
                break;
            case 4: myBank.sortAccounts();
                    myBank.viewAllAccounts();
                break;
            case 5: System.out.println("Good Bye");
               
        }
    }while (choice !=5);

    }
    public static void manageAcct(Scanner myScanner, Bank myBank){
        int choice;
        BankAccount ba;
        int acct;
        
        do{
            System.out.println("Enter your account number");
            acct = myScanner.nextInt();
            ba = myBank.getAccount(acct);
            if(ba == null){
                System.out.println("Invalid Account -- try again");
            }
        }while(ba == null);
        
        do{
        choice = manageAcctMenu(myScanner);
        switch (choice){
            case 1: ba = myBank.getAccount(acct);
                    System.out.println(ba);
                    System.out.println(ba.getBalance());
                    break;
            case 2: ba = myBank.getAccount(acct);
                    ba.withdraw(100.00);
                    System.out.println(ba);
                    break;
            case 3: ba = myBank.getAccount(acct);
                    ba.deposit(100.00);
                    System.out.println(ba);
                    break;
            case 4: ba = myBank.getAccount(acct);
                    System.out.println(ba.applyMonthlyInterest());
                    myBank.viewAllAccounts();
                    break;
            case 5: break;
        }
    }while(choice != 5);

    }
    public static int bankMenu(Scanner myScan){
        System.out.println("Welcome to Lehigh Unversity Bank");
        System.out.println("Select an operation:");
        System.out.println("1: Manage Existing Accounts");
        System.out.println("2: List All Accounts");
        System.out.println("3: Apply Monthly Fee to all accounts");
        System.out.println("4: Sort Accounts");
        System.out.println("5: Exit");
        int choice = myScan.nextInt();
        return choice;
    }
    public static int manageAcctMenu(Scanner myScan){
        System.out.println("Select an operation:");
        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Monthly Interest");
        System.out.println("5: Return to Main Menu");
        int choice = myScan.nextInt();
        return choice;
    }




    //@param scnr
    //@return number int
    public static int checkInt(Scanner scnr){
        boolean good = false;
        int number = 0;
        do{
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