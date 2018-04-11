import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> cards;

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

    public Card getCard(){
        return cards.remove(0);
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

}
