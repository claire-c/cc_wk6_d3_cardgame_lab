import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countHand(){
        return hand.size();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
