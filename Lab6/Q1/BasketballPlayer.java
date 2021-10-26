package Lab6.Q1;

public class BasketballPlayer extends Player{
    
    public BasketballPlayer(String n, int j){
        super(n, j);
    }

    public void playGame(){
        minutesPlayed = minutesPlayed + 48;
    }

    public void changeJerseyNumber(int newNumber){
        jerseyNumber = newNumber;
        System.out.println(name+" change number to "+ jerseyNumber);
    }
}
