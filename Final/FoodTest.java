/*
Thor Long
5/15/2022
Final Exam

Since we overrided toString in vegetable and fruit, we don't have to worry about which version of toString
is going to be put out, since us overriding it makes JVM know that they want the most recent toString, so in this case
the toString in Vegetable for vegetables, Fruit for fruits.
*/
import java.util.Scanner;
public class FoodTest{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Food[] groceryCart = new Food[50];
        groceryCart[0] = new Vegetable("Romaine", 1.09, "Green");
        groceryCart[1] = new Fruit("Mango", 3.79, true);
        groceryCart[2] = new Vegetable ("Brussel Sprouts", 4.56, "Green");
        groceryCart[3] = new Fruit("Blueberry", 0.89, false);
        groceryCart[4] = new Vegetable("Purple Carrots", 1.56, "Purple");
        groceryCart[5] = new Vegetable("Spinach", 2.32, "Green");
        groceryCart[6] = new Vegetable("Carrots", 1.45, "Orange");
        groceryCart[7] = new Vegetable("Potatoes", 3.99, "Red");
        groceryCart[8] = new Vegetable("Broccoli", 5.21, "Green");
        groceryCart[9] = new Vegetable("Turnip", .99, "White");
        groceryCart[10] = new Vegetable("Onions", 1.99, "Yellow");
        groceryCart[11] = new Fruit("Apples", 5.79, true);
        groceryCart[12] = new Fruit("Banana", .78, false);
        groceryCart[13] = new Fruit("Kiwi", 2.65, true);
        groceryCart[14] = new Fruit("Strawberry", 4.79, true);
        groceryCart[15] = new Fruit("Watermelon", 6.32, false);

        System.out.println("Items in your cart");
        displayCart(groceryCart);

        sortByPrice(groceryCart);

        System.out.println("Cart sorted by price");
        displayCart(groceryCart);

        int search = getInt(scan);
        scan.nextLine(); //clearing the scanner of a new line character

        for(int i =0; i<search; i++){
            System.out.println("What item would you like to search for? ");
            String searchName = scan.nextLine();
            searchCart(groceryCart, searchName);
        }

        checkOut(groceryCart);
    }
    public static int getInt(Scanner s){
        boolean loopNeeded = true;
        int num = 0;
        do{
            System.out.println("How many items would you like to search for? ");
            if(s.hasNextInt()){
                num = s.nextInt();
                if(num > 0 ){
                    loopNeeded= false;
                } else {
                    System.out.println("Enter a num greater than 0");
                }
            } else {
                System.out.println("not a number");
                s.nextLine();
            }
        }while(loopNeeded);
        return num;
    }

    //I changed the order of this to match the program, as well as changed displayCart back to what it was named in the exam, same with searchCart
    public static void displayCart(Food[]list){ 
        int num = list[0].getNumFood();
        for(int i = 0; i < num; i++){
            System.out.println(list[i].toString());
        }
    }
    public static void searchCart(Food[]list, String name){
        int num = list[0].getNumFood();
        for(int i = 0; i < num; i++){
            if(list[i].getName().equals(name)){
                System.out.println(list[i].toString());
            }
        }
    }
    public static void sortByPrice(Food[]list){
        int num = list[0].getNumFood();

        for(int i = 0; i < num; i++){ //Selection sort that I probably used for exam 1 or 2 idk, but citing myself ig
            int mIn = i;
            for(int j = i+1; j < num; j++){
                if(list[j].compareTo(list[mIn]) == -1){ //Ooh .compareTo
                    mIn = j;
                }
            }
            Food temp = list[mIn];
            list[mIn] = list[i];
            list[i] = temp;
        }
    }
    public static void checkOut(Food[]cart){
        int num = cart[0].getNumFood();
        double totalCost = 0;
        for(int i = 0; i < num; i++){
            totalCost += cart[i].getPrice();
        }
        double averageCost = totalCost / num;
        System.out.print("Total cost: ");
        System.out.printf("%.2f", totalCost);
        System.out.print("\nAverage cost per item: ");
        System.out.printf("%.2f", averageCost);
    }
}