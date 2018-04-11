import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card1;
    private Card card2;
    private Card card3;

    @Before
    public void before(){
        card1 = new Card(Suit.CLUBS, Rank.ACE);
        card2 = new Card(Suit.DIAMONDS, Rank.JACK);
        card3 = new Card(Suit.HEARTS, Rank.FIVE);

    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.CLUBS, card1.getSuit());


    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.JACK,card2.getRank());
    }
}
