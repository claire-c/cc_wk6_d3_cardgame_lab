import java.util.Collections;

public class Game {

    private Player player1;
    private Player player2;
    private Deck deck;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
    }

    public Player getPlayer1(){
        return this.player1;
    }

    public Player getPlayer2(){
        return this.player2;
    }

    public Deck getDeck() {
        return deck;
    }

    public void createDeck(){
        deck.populateDeck();
        Collections.shuffle(deck.cards);
    }
}
