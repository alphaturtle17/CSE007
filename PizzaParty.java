/*
Thor Long
2/4/2022
Pizza Party program, compares your price budget, number of friends, and amount of pizzas 
for a weekend party and tells you if your budget can afford it
*/
import java.util.Scanner;
public class PizzaParty{
    public static void main(String args[]){
        double budget; //Declaring these variables like
        int numFriends;
        double avgSlicePerson;
        double costPerPizza;
        int wholePizzas;
        double totalPizzaCost;
        double totalTaxOwed;
        double total;
        double lastTotal;
        final int slicePerPizza = 8;
        final double salesTax = .06;
        final double deliveryFee = 4.99;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Pizza Party Weekend");

        System.out.println("Budget:");
        budget = scnr.nextDouble();
        System.out.println("Number of friends on Friday:");
        numFriends = scnr.nextInt();
        System.out.println("Slices per person?");
        avgSlicePerson = scnr.nextDouble();
        System.out.println("How much does the pizza cost?");
        costPerPizza = scnr.nextDouble();
        double slices = numFriends * avgSlicePerson;
        double pizzas = slices / slicePerPizza;
        wholePizzas = (int) (Math.ceil(pizzas));
        totalPizzaCost = costPerPizza * wholePizzas;
        totalTaxOwed = totalPizzaCost * salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;
        lastTotal = total;

        System.out.println("Friday Night Party"); //Lil calculations and formatting to make sure it's all readable
        System.out.printf(wholePizzas + " Pizzas: $%.2f", totalPizzaCost);
        System.out.println();
        System.out.printf("Tax: $%.2f", totalTaxOwed);
        System.out.println();
        System.out.printf("Delivery: $%.2f", deliveryFee);
        System.out.println();
        System.out.printf("Total: $%.2f", total);
        System.out.println();

        System.out.println("Number of friends on Saturday:"); //On the repeat again for saturday instead of friday
        numFriends = scnr.nextInt();
        System.out.println("Slices per person?");
        avgSlicePerson = scnr.nextDouble();
        System.out.println("How much does the pizza cost?");
        costPerPizza = scnr.nextDouble();
        double slices2 = numFriends * avgSlicePerson;
        double pizzas2 = slices2 / slicePerPizza;
        wholePizzas = (int) (Math.ceil(pizzas2));
        totalPizzaCost = costPerPizza * wholePizzas;
        totalTaxOwed = totalPizzaCost * salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;
        lastTotal += total;
        boolean canAfford = lastTotal <= budget;

        System.out.println("Saturday Night Party");
        System.out.printf(wholePizzas + " Pizzas: $%.2f", totalPizzaCost);
        System.out.println();
        System.out.printf("Tax: $%.2f", totalTaxOwed);
        System.out.println();
        System.out.printf("Delivery: $%.2f", deliveryFee);
        System.out.println();
        System.out.printf("Total: $%.2f", total);
        System.out.println();

        System.out.printf("Weekend total: $%.2f", lastTotal); //Calcs total and if you can afford it
        System.out.println();
        System.out.println("Can you afford? " + canAfford);

    }
}