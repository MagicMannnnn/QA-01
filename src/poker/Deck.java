package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        cards = new ArrayList<Card>();
        reset();
    }

    public void reset() {
        cards.clear();

        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }

        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    public Card pop() {
        if (cards.isEmpty()) {
            reset();
        }
        return cards.removeLast();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card card : cards) {
            result.append(card.toString()).append(", ");
        }
        return result.toString();
    }
}
