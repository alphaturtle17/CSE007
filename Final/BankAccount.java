public abstract class BankAccount implements Comparable<BankAccount>{
    //Comparable is already in java.lang
    private int number;
    private String owner;
    private String type;
    protected double balance;

    protected BankAccount(String owner, String type, double balance){
        this.owner = owner;
        this.type = type;
        this.balance = balance;
    }
    protected BankAccount(int number, String owner, String type, double balance){
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.balance = balance;
    }
    public String getOwner(){
        return owner;
    }
    public String getType(){
        return type;
    }
    public int getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        boolean enough = false;
        if(balance >= amount){
            balance -= amount;
            enough = true;
        }else{
            enough = false;
        }
        return enough;
    }

    //compareTo
    public int compareTo(BankAccount ba){ //BAObj1.CompareTo(BAobj2)
        if(balance > ba.getBalance()){
            return 1;
        }else if(balance < ba.getBalance()){
            return -1;
        }else{
            return 0;
        }
    }
    public String toString(){
        return "\tAccount type: " + type + " Account number: " + number + " Owner: " + owner + " Balance: " + balance;
    }
    public boolean equals(Object obj){
        if(obj instanceof BankAccount){ //instanceof goes into object obj and looks to see if it's a bank account
            BankAccount ba = (BankAccount) obj;
            return balance == ba.getBalance();
        }
        return false;
    }
    public abstract double getInterestRate();
    public abstract double applyMonthlyInterest(); //MuST BE IN CHILD 
}
