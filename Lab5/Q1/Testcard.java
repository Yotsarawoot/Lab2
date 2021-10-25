package Lab5.Q1;

public class Testcard {

    public static void main(String[] args) {
        Card c = new Card(Rank.TWO, Suit.HEARTS);   
        Card c1 = new Card(Rank.QUEEN, Suit.DIAMONDS); 

        boolean result = c.isHighCard();
        System.out.println(result);
        result = c1.isHighCard();
        System.out.println(result);

        result = c.isSuit(Suit.DIAMONDS);
        System.out.println(result);
        result = c1.isSuit(Suit.DIAMONDS);
        System.out.println(result);

        c.print();
        c1.print();
    }
}
