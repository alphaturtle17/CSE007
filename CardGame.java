/*
Thor Long
CSE 007
Homework 4
CardGame.java is a card game that adds up the values of cards, after shuffling a deck and 
assigning hands to each player. The game ends when there is no cards left, or the user types in anything other than wanting to play again (y)
Coded on VSCode
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class CardGame {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        //Suits - Clubs, Hearts, Spades, Diamonds
        String[] suitNames = {"C", "H", "S", "D"};
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] deck = new String[52];
        String[] hand1 = new String[5];
        String[] hand2 = new String[5];
        int counter = 0;
        
        for(int i = 0; i < suitNames.length; i++){ //Appending the deck to have the suits plus ranks
            for(int j = 0; j < rankNames.length; j++){
                deck[counter] = suitNames[i] + rankNames[j];
                counter++;
            }
        }
        System.out.println("Unshuffled Deck of Cards");
        System.out.println(Arrays.toString(deck)); //Only print out in the beginning
        System.out.println();
        
        for(int l = 0; l <= 51; l++){ //Shuffling cards
            int shuffle = rand.nextInt(52);
            deck[l] = deck[shuffle];
        }
        System.out.println("Shuffled Deck of Cards");
        System.out.println(Arrays.toString(deck)); //Only print out in the beginning
        //

        int deckCounter = 0; //Keeps track of the index of the used cards outside of each loop
        boolean playing = true;

        // Above this line, don't loop
        do{
            for(int d1 = 0; d1 < hand1.length; d1++){ //Goes into the shuffled cards and picks first 5 cards from the index of deckCounter 
                hand1[d1] = deck[deckCounter];
                deckCounter++;
            }
            System.out.println();
            System.out.println("Player 1's hand: ");
            System.out.println(Arrays.toString(hand1)); //Print hand after assigning cards to hand
    
            for(int d2 = 0; d2 < hand2.length; d2++){ //Goes into the shuffled cards and picks first 5 cards from the index of deckCounter 
                hand2[d2] = deck[deckCounter];
                deckCounter++;
            }
    
            System.out.println();
            System.out.println("Player 2's hand: ");
            System.out.println(Arrays.toString(hand2)); //Print hand after assigning cards to hand
    
            int h1Value = 0; //Holds the values of each hand.
            int h2Value = 0;
    
            for(int h1c = 0; h1c < hand1.length; h1c++){ //Assigns values for each index of the hands
                char value = hand1[h1c].charAt(1);
                switch(value){
                    case 'A':
                        h1Value += 11;
                        break;
                    case 'K':
                    case 'Q':
                    case 'J':
                    case '1':
                        h1Value += 10;
                        break;
                    case '2':
                        h1Value += 2;
                        break;
                    case '3':
                        h1Value += 3;
                        break;
                    case '4':
                        h1Value += 4;
                        break;
                    case '5':
                        h1Value += 5;
                        break;
                    case '6':
                        h1Value += 6;
                        break;
                    case '7':
                        h1Value += 7;
                        break;
                    case '8':
                        h1Value += 8;
                        break;
                    case '9':
                        h1Value += 9;
                        break;
                }
            }
    
            for(int h2c = 0; h2c < hand2.length; h2c++){ //Assigns values for each index of the hands
                char value = hand2[h2c].charAt(1);
                switch(value){
                    case 'A':
                        h2Value += 11;
                        break;
                    case 'K':
                    case 'Q':
                    case 'J':
                    case '1':
                        h2Value += 10;
                        break;
                    case '2':
                        h2Value += 2;
                        break;
                    case '3':
                        h2Value += 3;
                        break;
                    case '4':
                        h2Value += 4;
                        break;
                    case '5':
                        h2Value += 5;
                        break;
                    case '6':
                        h2Value += 6;
                        break;
                    case '7':
                        h2Value += 7;
                        break;
                    case '8':
                        h2Value += 8;
                        break;
                    case '9':
                        h2Value += 9;
                        break;
                }
            }
    
    
            System.out.println("\nPlayer 1's hand value: " + h1Value);
            System.out.println("Player 2's hand value: " + h2Value);
    
            if(h1Value > h2Value){ //Literally just comparing the values, saying the bigger number wins
                System.out.println("Player 1 is the winner!");
            }else if(h1Value < h2Value){
                System.out.println("Player 2 is the winner!");
            }else{
                System.out.println("Wow! It's a tie!");
            }
            System.out.println("\nDo you want to play again? (y or n)");
            String stillPlaying = scnr.next(); //Input for 
            if(stillPlaying.toLowerCase().equals("y")){
                if(deckCounter < 41){
                    playing = true;
                }else{
                    System.out.println("You unfortunately ran out of cards. Have a good day!");
                    playing = false;
                }
            }else{
                System.out.println("Goodbye!");
                playing = false;
            }
        }while(playing == true);
        //regular while loop

        //Loop it all, make the "do you want to play again until you run out of cards y or n outbof bounds

        scnr.close();
    }
}