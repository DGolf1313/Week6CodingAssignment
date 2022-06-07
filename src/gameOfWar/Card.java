package gameOfWar;

public class Card {
	
	private int cardValue;
	private String cardName;
	
	public Card (int cardValue, String cardName) {
		this.setCardValue(cardValue);
		this.setcardName(cardName);
		
	}
	
	
	// getters and setters
	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getcardName() {
		return cardName;
	}
	
	
	public void setcardName(String cardName) {
		this.cardName = cardName;
	}
	
	//gives a description of a card
	public String describeCard() {
		String returnDescription = ("The " + this.getCardValue() + " of " + this.getcardName());
		return returnDescription;
	
	}

}
