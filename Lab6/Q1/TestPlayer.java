package Lab6.Q1;

public class TestPlayer {

    public static void main(String[] args){
        FootballPlayer f = new FootballPlayer("Ronaldo", 7);
        BasketballPlayer b = new BasketballPlayer("Jame", 23);
        f.print();
        b.print();
        f.playGame();
        b.playGame();
        System.out.println(f.getMinutePlayed());
        System.out.println(b.getMinutePlayed());
        b.changeJerseyNumber(6);
    }
}
