import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
            public void canCountCards(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canGetCard(){
        deck.populateDeck();
        deck.getCard();
        assertEquals(51, deck.countCards());
    }

    @Test
    public void didShuffle(){
        deck.populateDeck();
        deck.shuffleCards();
        Card cardToCompare = deck.getCard();
        Boolean comparison = (card.getRank() == cardToCompare.getRank());
        assertEquals(false, comparison); ;
    }

}
