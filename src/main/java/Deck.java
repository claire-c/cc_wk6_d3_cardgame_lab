import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int countCards(){
        return cards.size();
    }

    public void populateDeck() {
        for (Suit eachSuit : Suit.values()){
            for (Rank eachRank : Rank.values()){
                Card card = new Card(eachSuit, eachRank);
                cards.add(card);
            }
        }

    }

}
