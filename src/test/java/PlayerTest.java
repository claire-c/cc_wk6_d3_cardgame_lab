import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;

    @Before
    public void before(){
        player1 = new Player("Bob");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", player1.getName());
    }

    @Test
    public void canCountHand(){
        assertEquals(0, player1.countHand());
    }

    @Test
    public void canGetHand(){
        assertEquals(0,player1.countHand());
    }
}
