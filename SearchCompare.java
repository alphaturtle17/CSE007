/*
Thor Long
CSE 007
3/7/2022
Lab 5, searching for arrays for a random character, and returning the number
of searches completed with each algorithm.
Coded on VSCode
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class SearchCompare{
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int userLength = 10; //Random initialized values for userLength and key.
        char key = 'w';
        int indexValue = -1;
        int linearComparison = 0;
        int index;
        boolean good = true;

        do{//Decided to do a sort of checkpoints with the input validation rather than imbedding the program into the do while loops. 
            System.out.println("Enter a character between a to z lowercase, first character of the word will be counted");
            if(scnr.hasNextInt() == true){
                System.out.println("Incorrect input");
                good = false;
                scnr.nextLine();
            }else{
                String userString = scnr.nextLine();
                key = userString.charAt(0);
                good = true;

            }
        }while(!good);

        do{//Does it again but for the length
            System.out.println("Enter the length of the random array, greater than 15, less than 50");
            if(scnr.hasNextInt() == false){
                System.out.println("Incorrect input");
                good = false;
                scnr.nextLine();
            }else{
                userLength = scnr.nextInt();
                if(userLength >= 15 && userLength <= 50){
                    good = true;
                }else{
                    System.out.println("Incorrect range");
                    good = false;
                }
            }
        }while(!good);

        char [] myArray = new char [userLength];

        for(index = 0; index < myArray.length; index++){ //Algorithm one, linear
            myArray[index] = (char)(rand.nextInt(26) + 97);
        }
        System.out.println(Arrays.toString(myArray));
        for(index = 0; index < myArray.length; index++){
            if(myArray[index] == key){
                indexValue = index;
                linearComparison += 1;
                break;
            }else{
                linearComparison += 1;
            }
        }
        if(indexValue == -1){
            System.out.println(key + " was not found");
        }else{
            System.out.println(key + " was found at index " + indexValue);
        }

        //Arrays must be sorted for binary search because of the nature of the algorithm. It banks on the biggest numbers
        //being on the right, and the smaller ones on the left, therefore if they were out of order, it wouldn't work at all.

        int binaryComparison = 0;
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int high, mid, low, indexBin = -1;
        low = 0;
        high = myArray.length-1;
        while(high >= low){ //Alg 2, binary
            binaryComparison++;
            mid = (high + low)/2;
            if(key > myArray[mid]){
                low = mid + 1;
            }else if(key < myArray[mid]){
                high = mid - 1;
            }else{
                indexBin = mid;
                break;
            }
        }
        if(indexBin == -1){
            System.out.println(key + " was not found"); //Meaningful outputs
        }else{
            System.out.println(key + " was found at index " + indexBin);
        }
        System.out.println("Linear search had " + linearComparison + " comparisons");
        System.out.println("Binary search had " + binaryComparison + " comparisons");
        scnr.close();
    }
}