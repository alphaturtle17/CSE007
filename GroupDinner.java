/*
Thor Long
CSE 007
HW1
Calculating what each person owes your for food,
including tax and tip

To solve the problem, I need to add each meal up with the respective meal and calculate tax and tip for them
Add tax to pre-tip, and tip pre-tax, and add up each of them to 
allow the rest of the numbers to look nice as well, printf($.2f) I think

*/
public class GroupDinner {
    public static void main(String args[]){
        int numFriends = 4; //Initializing all the friends that came, costs for food and bev
        double meal1 = 34.50;
        double meal2 = 17.99;
        double meal3 = 12.98;
        double meal4 = 25.75;

        double bev1 = 10.00;
        double bev2 = 7.99;
        double bev3 = 2.99;
        double bev4 = 2.99;

        double paSalesTax = 0.06; //Tax and tip rates, and scanner
        double tipRate = 0.15;

        double allFood = meal1 + meal2 + meal3 + meal4; //Total food/drink costs
        double allDrink = bev1 + bev2 + bev3 + bev4;
        double totalTip = 0.0; //Placeholder for all gratuity
        double totalTax = 0.0; //Placeholder for Tax
        double totalBill = 0.0; //Placeholder for bill



        double oneTotal = meal1 + bev1; //Calculate total of each meal, before tax and tip, then add tax and tip
        double oneTax = oneTotal * paSalesTax;
        double oneTip = oneTotal * tipRate;
        totalTax += oneTax; //Add tax of each meal to total count
        totalTip += oneTip; //Add tip of each meal to total count
        oneTotal += oneTax + oneTip; //Change oneTotal to add tax and tip so it's easier to add later

        double twoTotal = meal2 + bev2;
        double twoTax = twoTotal * paSalesTax;
        double twoTip = twoTotal * tipRate;
        totalTax += twoTax;
        totalTip += twoTip;
        oneTotal += twoTax + twoTip;

        double threeTotal = meal3 + bev3;
        double threeTax = threeTotal * paSalesTax;
        double threeTip = threeTotal * tipRate;
        totalTax += threeTax;
        totalTip += threeTip;
        threeTotal += threeTax + threeTip;

        double fourTotal = meal4 + bev4;
        double fourTax = fourTotal * paSalesTax;
        double fourTip = fourTotal * tipRate;
        totalTax += fourTax;
        totalTip += fourTip;
        fourTotal += fourTax + fourTip;

        totalBill = allFood + allDrink + totalTax + totalTip; //Add em all up
        System.out.println(numFriends + " friends came to dinner!");
        System.out.printf("Friend 1 owes: $%.2f", oneTotal); //Literally just a lot of print statements with a little adding or multiplying for tax totals
        System.out.println();
        System.out.printf("Friend 2 owes: $%.2f", twoTotal);
        System.out.println();
        System.out.printf("Friend 3 owes: $%.2f", threeTotal);
        System.out.println();
        System.out.printf("Friend 4 owes: $%.2f", fourTotal);
        System.out.println();
        System.out.printf("Food tax: $%.2f", allFood * paSalesTax);    
        System.out.println();
        System.out.printf("Bev Tax: $%.2f", allDrink * paSalesTax);
        System.out.println();
        System.out.printf("Sub Cost: $%.2f", allFood + allDrink);
        System.out.println();
        System.out.printf("Total Tax: $%.2f", totalTax);
        System.out.println();
        System.out.printf("Total Tip: $%.2f", totalTip);
        System.out.println();
        System.out.printf("Total Bill Cost: $%.2f", totalBill);
    }
}
