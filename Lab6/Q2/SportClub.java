package Lab6.Q2;

public class SportClub extends Club{
    
    public SportClub (String c, int m){
        super(c, m);
    }

    @Override
    public void changeName(String newName){
        System.out.println("Cannot change the name");
    }

    @Override
    public int determineBudget(){
        return (numMember * 1000) + (numMember - minNumMember) * 100;
    }

}
