package Lab8.Q1;

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
        return (budget > 1000)? 0:(numMember*1000);
    }
}
