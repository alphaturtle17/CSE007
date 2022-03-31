import java.util.Scanner;
import java.util.Arrays;
public class CharCount {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        boolean running = true;
        char [] alphabet = {'a', 'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int [] counts = new int[26];
        do{
            System.out.println("Enter a word or phrase: ");
            String userString = scnr.nextLine();
            char [] stringCharacters = stringCharacters(userString);

            for(int i = 0; i < alphabet.length; i++){
                for(int j = 0; j < stringCharacters.length; j++){
                    if(alphabet[i] == stringCharacters[j]){
                        counts[i] += 1;
                        System.out.println(i);
                    }
                }
            }

            System.out.println(Arrays.toString(counts)); //Still unsorted
            counts = sortInt(counts); //This method sorts the integers in counts in descending order, but I need a way to get the alphabet to remember
                                      //the different indicies
            System.out.println(Arrays.toString(counts));

        }while(running == true);
    }
    public static char [] stringCharacters(String userInput){
        char strChar [] = new char[userInput.length()];
        for(int i = 0; i < userInput.length(); i++){
            strChar[i] = userInput.charAt(i);
        }
        System.out.println(Arrays.toString(strChar));
        return strChar;
    }
    public static int [] sortInt(int [] randomArray){
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
    public static char [] sortInt(char [] alphabet){
        int[] indicies = new int[26];

        return alphabet;
    }
}
