package RandomExercises;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private static ArrayList<Card> deck = new ArrayList<>();
	private Random getNumber = new Random();

	public Deck() {
		this.deck = deck;

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		for (String suit : suits) {
			for (String rank : ranks) {

				Card card = new Card(suit, rank);

				deck.add(card);
			}
		}
	}

	public ArrayList getDeck() {
		return deck;
	}

	public Card getNextCard() {

		if (!deck.isEmpty()) {
			int index = getNumber.nextInt(deck.size());
			return deck.remove(index);
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
