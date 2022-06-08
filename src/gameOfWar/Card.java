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
	public StringBuilder describeCard() {
		StringBuilder returnDescription = new StringBuilder();
		if (this.getCardValue() < 11) {
		returnDescription.append("The " + this.getCardValue() + " of " + this.getcardName());
		} else if (this.getCardValue() == 11) {
			returnDescription.append("The Jack of " + this.getcardName());
		} else if (this.getCardValue() == 12) {
			returnDescription.append("The Queen of " + this.getcardName());
		}else if (this.getCardValue() == 13) {
			returnDescription.append("The King of " + this.getcardName());
		} else if (this.getCardValue() == 14) {
			returnDescription.append("The Ace of " + this.getcardName());
		}
		return returnDescription;
	}
}
