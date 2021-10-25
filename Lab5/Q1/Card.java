package Lab5.Q1;

public class Card {
    private Rank rank;
    private Suit suit;
    
    public Card (Rank r, Suit s) {
        rank = r;
        suit = s;
    }

    public boolean isHighCard(){
        boolean result;
        if(rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING || rank == Rank.ACE){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public boolean isSuit(Suit s){
        boolean result;
        return result = (suit == s)? true:false;
    }

    public void print(){
        System.out.println(rank + " and " + suit);
    }
}
