package Lab8.Q1;

public class ClubManagingSystem {
    private Club[] clubList;
    private int numClub;

    public ClubManagingSystem(Club[] cl){
        clubList = cl;
        numClub = cl.length;
    }

    public int getNum(){
        return numClub;
    }

    public int determineAllBudget(){
        int sum = 0;
        for(int i = 0; i < numClub; i++){
            sum = sum + clubList[i].determineBudget(); 
        }
        return sum;
    }

    public int getAllMember(){
        int sum = 0;
        for(int i = 0; i < numClub; i++){
            sum = sum + clubList[i].numMember;
        }
        return sum;
    }

    public Club getHighestMemberClub(){
        int maxMember = 0;
        for(int i = 0; i < numClub; i++){
            if(maxMember < clubList[i].numMember) maxMember = clubList[i].numMember;
        }
        Club re = clubList[1];
        for(int i = 0; i < numClub; i++){
            if(maxMember == clubList[i].numMember) re = clubList[i];
        }
        return re;
    }

    public static void advertiseClub(Club c){
        c.advertise();
    }

    public void advertiseClub(int i){
        clubList[i].advertise();
    }
}
