/*
Thor Long
CSE 007
2/14/2022
Card picker program, determines the card that you're getting and what suit based on random number generating
VS Code
*/
public class Card {
    public static void main(String args[]){

        String suitName = "";
        String cardIdentity = "";
        double cardNumber = (int) (Math.random()*51);
        int newNum = (int) cardNumber / 13; //Force int division 
        
        if(newNum == 1){
            suitName = "Diamonds";
        }else if(newNum == 2){
            suitName = "Clubs";
        }else if(newNum == 3){
            suitName = "Hearts";
        }else if(newNum == 4){
            suitName = "Spades";
        }
        cardNumber = (int) ((cardNumber+1) % 13);
        switch((int)cardNumber){ //Switch wants to complain about doubles so (int) that
            case 0:
                cardIdentity = "King";
            break;
            case 1:
                cardIdentity = "Ace";
            break;
            case 11:
                cardIdentity = "Jack";
            break;
            case 12:
                cardIdentity = "Queen";
            break;
            default:
                cardIdentity = Double.toString(cardNumber); //(Double.toString in order to convert to string lol)
        }
        System.out.println("You picked the " + cardIdentity + " of " + suitName);

    }
}
