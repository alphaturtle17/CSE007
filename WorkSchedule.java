/*
Thor Long
4/11/2022
Exam Program
VSCODE
*/
import java.util.Random;
public class WorkSchedule {
    public static void main(String args[]){
        Random rand = new Random();
        int[][] employeeHours = new int[25][7];
        int[] totalHours = new int[7];

        fillEmployeeHours(employeeHours, rand); //Fills the empty array with the random integers between 0 and 12, representing hours
        //System.out.println(Arrays.deepToString(employeeHours));

        totalHours = calculateDailyTotals(employeeHours); //Adds each amount of hours per day and assigns it to the empty array.
        //System.out.println(Arrays.toString(totalHours));

        display(employeeHours, totalHours);
    }
    //This method assigns numerical values to the array, random values from 0-12
    public static void fillEmployeeHours(int[][] arr, Random rand){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = rand.nextInt(13);
            }
        }
    }

    //Creates a new array that holds the total of all hours worked per day across all employees.
    public static int[] calculateDailyTotals(int [][] arr){
        int [] dayTotal = new int[7];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                dayTotal[col] += arr[row][col];
            }
        }
        return dayTotal;
    }

    //Displays the data in a cool and readable way
    public static void display(int [][] allHours, int [] weekHours){
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHUR\tFRI\tSAT");
        int totalHours = 0;
        for(int row = 0; row < allHours.length; row++){
            for(int col = 0; col < allHours[row].length; col++){
                System.out.print("\t" + allHours[row][col]);
                totalHours += allHours[row][col]; //Might as well tally up the total hours now
            }
            System.out.println();
        }
        System.out.println(); //Just some formatting
        System.out.println("Total hours: " + totalHours);
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHUR\tFRI\tSAT");

        for(int i = 0; i < weekHours.length; i++){
            System.out.print("\t" + weekHours[i]);
        }
    }
}
