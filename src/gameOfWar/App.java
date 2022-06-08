package gameOfWar;

public class App {

	public static void main(String[] args) {

		//instantiating a new deck
		Deck deck = new Deck();
		
		
		//Shuffling the deck
		deck.shuffle();
		
		//Creating players for the game
		Player player1 = new Player("CHARLIE, Player1");
		Player player2 = new Player("JAMIE, Player2");
		
		//have each player draw their hand
		for(int i = 0; i < 26; i++) {
			player1.getCardsInHand().add(deck.draw());
			player2.getCardsInHand().add(deck.draw());
		}
		
		//have players flip through the deck and see who wins each turn.
		for(int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if( player1Card.getCardValue() > player2Card.getCardValue()) {
				player1.incrementScore();
				System.out.println("Player 1's card is: " + player1Card.describeCard());
				System.out.println("Player 2's card is: " + player2Card.describeCard());
				System.out.println("Player 1 wins the point");
				System.out.println();}
			else if( player1Card.getCardValue() < player2Card.getCardValue()) {
				player2.incrementScore();
				System.out.println("Player 1's card is: " + player1Card.describeCard());
				System.out.println("Player 2's card is: " + player2Card.describeCard());
				System.out.println("Player 2 wins the point");
				System.out.println();}
			else if ( player1Card.getCardValue() == player2Card.getCardValue()) {
				System.out.println("Player 1's card is: " + player1Card.describeCard());
				System.out.println("Player 2's card is: " + player2Card.describeCard());
				System.out.println("The cards were the same, no points were earned.");
				System.out.println();
				
			}else {
				System.out.println("***");
			}
		}
			//Print out final scores!
			System.out.println(player1.describe());
			System.out.println(player2.describe());
			
			if(player1.playerScore() > player2.playerScore()) {
				System.out.println("Player 1 Has won the game!!");
			}if(player1.playerScore() < player2.playerScore()) {
				System.out.println("Player 2 Has won the game!!");
			}else if (player1.playerScore() == player2.playerScore()) {
				System.out.println("The game has ended in a draw");
			}
		}
		
	}


