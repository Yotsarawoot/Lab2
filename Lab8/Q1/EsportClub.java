package Lab8.Q1;

final class EsportClub extends SportClub {

    public EsportClub(String c, int m) {
        super(c, m);
        minNumMember = 1;
    }

    @Override
    public final void advertise(){
        System.out.println("No need to advertise");
    }


    

}
