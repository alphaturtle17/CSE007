public class CheckingAccount extends BankAccount{
    
    public CheckingAccount(String owner, String type, double balance){
        super(owner, type, balance); //No private variables, just brings into the super class
    }
    public CheckingAccount(int number, String owner, String type, double balance){
        super(number, owner, type, balance);
    }
    @Override
    public String toString(){
        return super.toString() + getInterestRate();
    }
    @Override
    public double getInterestRate(){
        return 0; //Checking acocunts do not get interest rates
    }
    public double applyMonthlyInterest(){
        return balance;
    }
}