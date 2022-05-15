public class Bank {
    private String name;
    private String branch;
    private BankAccount[] bankAccounts;
    private int count;

    public static double monthlyFee;

    public Bank(String name, String branch){
        this.name = name;
        this.branch = branch;
        this.count = 0;
    }
    public Bank(String name, String branch, BankAccount [] bankAccts){
        this.name = name;
        this.branch = branch;
        bankAccounts = bankAccts;
        /*
        for(int i = 0; i < bankAccts.length; i++){
            if(bankAccts[i] instanceof CheckingAccount){
                bankAccounts[i] = new CheckingAccount(bankAccts[i].getNumber(), bankAccts[i].getOwner(), bankAccts[i].getType(), bankAccts[i].getBalance());
            }else{
                bankAccounts[i] = new SavingsAccount(bankAccts[i].getNumber(), bankAccts[i].getOwner(), bankAccts[i].getType(), bankAccts[i].getBalance(), bankAccts[i].getInterestRate());
            }
            
            bankAccounts = bankAccts;
            count = bankAccts.length;
        }
        */
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public BankAccount getAccount(int num){
        for(int i = 0; i < bankAccounts.length; i++){
            if(bankAccounts[i].getNumber() == num){
                return bankAccounts[i];
            }
        }
        return null;
    }
    public void applyMonthlyFee(){
        for(int i = 0; i < bankAccounts.length; i++){
            bankAccounts[i].balance = bankAccounts[i].balance - monthlyFee;
        }
    }public void viewAllAccounts(){
        String titles = "Bank Name: " + name + "\t" + "Bank Branch: " + branch + "\n" + "Type: " + "\t\t" + "Account Number" + "\t" + "Owner" + "\t\t\t" + "Balance" + "\t\t" + "Interest";
        System.out.println(titles);
        for(int i = 0; i < bankAccounts.length; i++){
            System.out.println(bankAccounts[i]);
        }
    }


    public void sortAccounts(){
        java.util.Arrays.sort(bankAccounts);
    }
}
