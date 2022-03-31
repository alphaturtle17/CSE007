/*
Thor Long
HW5
3/31/2022 VS CODE
This program is supposed to find the numerical amounts of characters and spit out, in descending order, each quantity of letter, only problem
with me is getting the descending order part, as making the counts descending is easy, but I can't for the life of me figure out
how to make the specific letters also fall into place.
*/
import java.util.Scanner;
import java.util.Arrays;
public class CharCount {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        char [] alphabet = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int [] counts = new int[26];

        System.out.println("Enter a word or phrase: ");
        String userString = scnr.nextLine();
        char [] stringCharacters = stringCharacters(userString);

        for(int i = 0; i < alphabet.length; i++){
            for(int j = 0; j < stringCharacters.length; j++){
                if(alphabet[i] == stringCharacters[j]){
                    counts[i] += 1;
                }
            }
        }

        int [] indicies = new int[26];

        for(int k = 0; k < counts.length; k++){
            if(counts[k] != 0){
                indicies[k] = k;
            }
        }
        //counts = sortInt(counts); This method sorts the counts in descending order, but finding a way to conceptualize the movement of the alphabet is messing with me 
        //System.out.println(Arrays.toString(indicies));
        //System.out.println(Arrays.toString(counts));

        for(int l = 0; l < alphabet.length; l++){ 
            if(counts[l] != 0){ 
                System.out.println("There are " + counts[l] + " " + alphabet[l] + "'s");
            }
        }
        scnr.close();
    }
    public static char [] stringCharacters(String userInput){ //Gets a string, returns individual characters
        char strChar [] = new char[userInput.length()];
        for(int i = 0; i < userInput.length(); i++){
            strChar[i] = userInput.charAt(i);
        }
        System.out.println(Arrays.toString(strChar));
        return strChar;
    }
    public static int [] sortInt(int [] randomArray){ //Gets the integers and sorts them in descending
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
        return randomArray;
    }
}
