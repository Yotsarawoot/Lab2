package Lab6.Q2;

public class MarketingClub extends Club {
    private int budget;

    public MarketingClub (String c, int m, int b){
        super(c, m);
        budget = b;
    }

    public boolean useBudget (int u){
        if(budget < u){
            budget = budget - u;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int determineBudget(){
        return (budget > 0)? 0:(numMember*1000);
    }
}
