public class CalculatorTest {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        calc.add(10);
        System.out.println(calc.getValue());
        calc.subtract(100);
        System.out.println(calc.getValue());
        calc.multiply(10);
        System.out.println(calc.getValue());
        calc.divide(2);
        System.out.println(calc.getValue());
        System.out.println(calc.getOperations());
        calc.clear();
        System.out.println(calc.getValue());
        System.out.println(calc.getOperations());
    }
}
