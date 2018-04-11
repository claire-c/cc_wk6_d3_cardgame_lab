import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player1;
    private Player player2;
    private Deck deck;
    private Game game;

    @Before
    public void before(){
        player1 = new Player("Claire");
        player2 = new Player("Joseph");
        deck = new Deck();
        game = new Game(player1, player2);
    }

    @Test
    public void canGetPlayer1(){
        assertEquals("Claire", game.getPlayer1().getName());
    }

    @Test
    public void canGetPlayer2(){
        assertEquals("Joseph", game.getPlayer2().getName());
    }

    @Test
    public void gameHasDeckEmptyDeck(){
        assertEquals(0, game.getDeck().countCards());
    }

    @Test
    public void gameHasFullDeckAfterCreateDeck(){
        game.createDeck();
        assertEquals(52, game.getDeck().countCards());

    }


}
