/*
Thor Long
Lab 9
4/18/2022
Emulates a calculator, object that gets put into other stuff
*/
public class Calculator {
    private double value = 0;
    private static int operations = 0;

    public void add(double val){
        value += val;
        operations++;
    }
    public void subtract(double val){
        value -= val;
        operations++;
    }
    public void multiply(double val){
        value = value * val;
        operations++;
    }
    public void divide(double val){
        value = value / val;
        operations++;
    }
    public void clear(){
        value = 0;
        operations = 0;
    }
    public double getValue(){
        return value;
    }
    public int getOperations(){
        return operations;
    }
}
