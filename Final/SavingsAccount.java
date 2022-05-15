public class SavingsAccount extends BankAccount{
    private double yearlyInterest;

    public SavingsAccount(String owner, String type, double balance, double rate){
        super(owner, type, balance);
        yearlyInterest = rate;
    }
    public SavingsAccount(int number, String owner, String type, double balance, double rate){
        super(number, owner, type, balance);
        yearlyInterest = rate;
    }
    @Override
    public double getInterestRate(){
        return yearlyInterest;
    }
    public void setInterestRate(double yearlyInterest){
        this.yearlyInterest = yearlyInterest;
    }
    public double applyMonthlyInterest(){
        balance = balance + (balance * yearlyInterest/12) / 100;
        return balance;
    }
    @Override
    public String toString(){
        return super.toString() + " Yearly interest: " + yearlyInterest;
    }
}
