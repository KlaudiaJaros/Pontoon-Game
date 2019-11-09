package RandomExercises;

import java.util.ArrayList;
import java.util.Scanner;

//PONTOON GAME, USING OBJECT-ORIENTATED PROGRAMMING

public class CardsAndDeckTest {

	public static void main(String[] args) {

		ArrayList<Card> cardList = new ArrayList<>();
		Deck deck = new Deck();

		System.out.println("Let's play a pontoon game!");
		System.out.println(".......................");

		char response = 'Z';

		while (response != 'q' && response != 'n') {

			boolean game = true;

			Scanner getInput = new Scanner(System.in);
			System.out.println("-> Would you like to draw a card?");

			String userResponse = getInput.nextLine();
			userResponse.toLowerCase();
			response = userResponse.charAt(0);

			if (response == 'n' || response == 'q') {
				System.out.println("Game over. Goodbye!");
				break;
			}

			Card firstCard = new Card("Hearts", "Ace");
			firstCard = deck.getNextCard();
			int value = firstCard.getValue();
			System.out.println(firstCard + ", Value: " + value);

			while (response == 'y' && game) {
				if (value > 21) {
					game = false;
					System.out.println("You've lost!");

				} else if (value == 21) {
					game = false;
					System.out.println("You've won!!!");

				}

				else if (game) {
					System.out.println("Would you like another card?");
					String userRes = getInput.nextLine();
					userRes.toLowerCase();
					response = userRes.charAt(0);
					if (response == 'n' || response == 'q') {
						game = false;
						System.out.println("Your score: " + value + ". Game over, Goodbye!");
						break;
					}
					Card nextCard = new Card("Hearts", "Ace");
					nextCard = deck.getNextCard();
					int nextValue = nextCard.getValue();
					value += nextValue;
					System.out.println(nextCard + ", Value: " + value);

				}
			}
		}
	}
}
