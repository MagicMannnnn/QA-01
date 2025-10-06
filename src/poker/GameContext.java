package poker;

public class GameContext {
    static Deck deck =  new Deck();

    public static Card getCard() {
        return deck.pop();
    }

}
