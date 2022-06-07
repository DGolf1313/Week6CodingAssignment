package gameOfWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cardInDeck = new ArrayList<Card>();
	List<String> suit = Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds");
	
	public Deck() {
		for (int i = 2; i<=14; i++) {
			Card spades  = new Card(i, "Spades");
			cardInDeck.add(spades);
			Card hearts = new Card (i, "Hearts");
			cardInDeck.add(hearts);
			Card clubs = new Card (i, "Clubs");
			cardInDeck.add(clubs);
			Card diamonds = new Card (i, "Diamonds");
			cardInDeck.add(diamonds);
			
		}
		
	}
	
	//takes a deck and randomizes the cards
	public void shuffle() {
		Collections.shuffle(cardInDeck);
	}
	
	//finds and returns the top card of a deck 
	public Card draw() {
		Card topCardOfDeck = cardInDeck.get(0);
		cardInDeck.remove(0);
		return topCardOfDeck;
		
	
	}
	
	
}
	
	

