/*
Thor Long
CSE 007
Lab 6
This prompts the user to generate an inputed number of student grades in descending order, 
and then searches for a grade or grade range that is also inputed by the user.
Coded on VSCode
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class RandomGrades{
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        boolean good = true;
        int userInput = 0;

        do{ //This is a little checkpoint for input validation that just lets you go past if the critera are met.
            System.out.println("Enter an integer (5 to 150) that represents the number of students in CSE 007");
            if(scnr.hasNextInt() == false){
                System.out.println("Invalid input type");
                good = false;
            }else{
                userInput = scnr.nextInt();
                if(userInput < 5 || userInput > 150){
                    System.out.println("Out of range");
                    good = false;
                }else{
                    good = true;
                }
            }
        }while(!good);

        int[] randomArray = new int[userInput]; //Make the array with random grades out of the amount of people that the user inputted
        for(int i = 0; i < randomArray.length; i++){
            int rng = rand.nextInt(100);
            randomArray[i] = rng;
        }
        
        //Using a temporary variable, this swaps each element if they aren't in order. Used because it gets the job done, and the logic is
        //good to me because I understand it well.
        int temp = 0; 
        for(int j = 0; j < randomArray.length; j++){
            for(int k = j+1; k < randomArray.length; k++){
                if(randomArray[j] < randomArray[k]){
                    temp = randomArray[k];
                    randomArray[k] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
        }

        double average = 0; //This is just how my brain was like ok let's take the average
        double total = 0;
        for(int count = 0; count < randomArray.length; count++){
            total += randomArray[count];
        }
        average = total / randomArray.length;

        System.out.println("Sorted Grade Array: " + Arrays.toString(randomArray));
        System.out.print("\nAverage Grade: ");
        System.out.printf("%,.3f", average);
        System.out.println();

        //Printing out and formatting it using system.out.println, printf, and print


        int key = 0; 
        char keyChar = 'A';
        boolean correct = true;
        int iterate = 0;
        int count = 0;
        do{ //Do while so they don't get to leave
            System.out.println("Enter an integer (0-100), or a character (A-F) representing a grade");
            if(scnr.hasNextInt() == true){
                key = scnr.nextInt();
                if(key >= 0 && key <= 100){
                    correct = true;
                    int low = 0;
                    int high = randomArray.length - 1;
                    int keyIndex = -1;
                    while(high >= low){ //Literally just checks to see if the number is greater or less than the number, and then assigns it. Only works since we already sorted the thing already
                        int mid = (high + low) / 2;
                        iterate++;
                        if(randomArray[mid] < key){
                            high = mid - 1;
                        }else if(randomArray[mid] > key){
                            low = mid + 1;
                        }else{
                            keyIndex = mid;
                            break;
                        }
                    }
                    if(keyIndex == -1){
                        System.out.println("Key was not found");
                    }else{
                        System.out.println("Key is found at index " + keyIndex); //Gotta get that meaninful output
                        System.out.println("Number of interations is " + iterate);
                    }

                }else{
                    System.out.println("Out of range");
                    correct = false;
                    scnr.nextLine();
                }
            }else{
                keyChar = scnr.next().charAt(0);
                scnr.nextLine();
                correct = true;
                if(keyChar >= 'A' && keyChar <= 'F' && keyChar != 'E'){ //Letter grades but not E because E is trash
                    for (int index = 0; index < randomArray.length; index++){
                        switch(keyChar){
                            case 'A': //Add to count per letter grade, for loop for each letter grade
                                if(randomArray[index] >= 90){
                                    count++;
                                }
                                break;
                            case 'B':
                                if(randomArray[index] >= 80 && randomArray[index] < 90){
                                    count++;
                                }
                                break;
                            case 'C':
                                if(randomArray[index] >= 70 && randomArray[index] < 80){
                                    count++;
                                }
                                break;
                            case 'D':
                                if(randomArray[index] >= 60 && randomArray[index] < 70){
                                    count++;
                            }
                                break;
                            case 'F':
                                if(randomArray[index] < 60){
                                    count++;
                                }
                                break;
                        }
                    }
                    System.out.println("The number of letter grade " + keyChar + " is " + count); //Meaning full
                }else{
                    System.out.println("You did not enter an A, B, C, D, or F");
                    correct = false;
                }
            }
        }while(correct == false);
        scnr.close();
    }
}