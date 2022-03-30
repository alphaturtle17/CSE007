/*Sample header
Solution for Lab 3
CSE007 Spring 2022
*/
public class CardsMethod {
	public static void main(String[] args) {
		// Declaring variables
		String suitName = "", cardIdentity = "";
		int suit, identity;
		
		// Generating a random card between 1 and 52
		int card = generateCard();
		System.out.println(card);

		suitName = findSuit(card);
		System.out.println(suitName);
		
		// Calculating the suit and identity numbers
		cardIdentity = findIdentity(card);
		
		// Finding the card identity
		
		// Display card identity and suit name
		System.out.println("You picked the " + cardIdentity + " of " + suitName);

	}
	public static int generateCard(){
		int card = (int) (Math.random()*52) + 1;
		return card;
	}
	public static String findSuit(int card){
		int suit = card / 13;
		String suitName = "Null";
		if (suit == 0) // 0-12
			suitName = "Diamonds";
		else if (suit == 1) // 13-25
			suitName = "Clubs";
		else if (suit == 2)
			suitName = "Hearts";
		else if (suit == 3)
			suitName = "Spades";
		return suitName;
	}
	public static String findIdentity(int card){
		int identity = card % 13;
		String cardIdentity = "Null";
		switch(identity) {
			case 0: cardIdentity = "King"; break;
			case 1: cardIdentity = "Ace"; break;
			case 2: cardIdentity = "2"; break;
			case 3: cardIdentity = "3"; break;
			case 4: cardIdentity = "4"; break;
			case 5: cardIdentity = "5"; break;
			case 6: cardIdentity = "6"; break;
			case 7: cardIdentity = "7"; break;
			case 8: cardIdentity = "8"; break;
			case 9: cardIdentity = "9"; break;
			case 10: cardIdentity = "10"; break;
			case 11: cardIdentity = "Jack"; break;
			case 12: cardIdentity = "Queen"; break;	
		}
		return cardIdentity;
	}

}