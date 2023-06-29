import java.util.ArrayList;

public class Player {
    private int sumaValue = 0;
    private int id;
    private String name;
    private ArrayList<Card> cardcollection = new ArrayList<>();

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        for(int i = 0; i < 2;i++) {
            this.takeCard();
        }

    }

    public int getSumaValueCards() {
        return sumaValue;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public ArrayList<Card> getCardcollection() {
        return cardcollection;
    }

    public void setSumaValue(int sumaValue) {
        this.sumaValue = sumaValue;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player" + this.id + " : " + this.name;
    }

    public void takeCard() {
        Card card = Card.getRandom();
        cardcollection.add(card);
        sumaValue += card.getVALUE();
    }

    public Player comparePlayers(Player otherPlayer) {
        Player winner;
        if((this.getSumaValueCards() > otherPlayer.getSumaValueCards()) && (this.getSumaValueCards()<=21)) {
            winner = this;
        } else if ((this.getSumaValueCards() < otherPlayer.getSumaValueCards()) && (otherPlayer.getSumaValueCards()<= 21)) {
            winner = otherPlayer;
        } else if ((this.getSumaValueCards() > otherPlayer.getSumaValueCards()) && (this.getSumaValueCards() > 21) && (otherPlayer.getSumaValueCards() <= 21)) {
            winner = otherPlayer;

        } else if ((this.getSumaValueCards() < otherPlayer.getSumaValueCards()) && (otherPlayer.getSumaValueCards() > 21) && (getSumaValueCards() <= 21)) {
            winner = otherPlayer;
        } else {
            winner = null;
        }
        return winner;
    }

}
