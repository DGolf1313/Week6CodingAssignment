package gameOfWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> cardsInHand	= new ArrayList<Card>();
	private int score = 0; 
	private String playerName;
	
	
	public Player(String playerName) {
		List<Card> cardsInHand = new ArrayList<Card>();
		int score = 0;
		
		this.playerName = playerName;
		this.setCardsInHand(cardsInHand);
	}
	
	/* unused, but didn't want to delete yet
	 * //takes a deck, shuffles and distributes it between two players public void
	 * dealPlayersHands(Player player1, Player player2) { Deck currentDeck = new
	 * Deck(); currentDeck.shuffle(); for (int i =0; i < 26; i++) {
	 * player1.getCardsInHand().add(currentDeck.draw());
	 * player2.getCardsInHand().add(currentDeck.draw()); }
	 * 
	 * }
	 */
	
	
	//describes a player and gives their current score
	public String describe() {
		StringBuilder results = new StringBuilder();
		results.append("Hello I'm " + playerName + " and my score was: " + score);
		//for(int i = 0; i <26; i++) {
		//getCardsInHand().get(i).describeCard();
		
		return results.toString();
			 
	}
	
	//flips the top card of a players hand and removes it.
	public Card flip() {
		Card topCard = getCardsInHand().get(0);
		getCardsInHand().remove(0);
	
		return topCard;
	}
	
	//takes a deck and returns the top card back to the hand
	public void draw(Deck deck) {
		getCardsInHand().add(deck.draw());
		
	}
	//adds points to a players score
	public void incrementScore() {
		score = score + 1;
	}

	public List<Card> getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(List<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	public int playerScore() {
		int scoreResults = score;
	return scoreResults;
	}
	
	
}