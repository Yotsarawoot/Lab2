package Lab6.Q2;

public class TestClub {
   
    public static void main(String[] args){
        SportClub s = new SportClub("Sport", 50);
        s.addMember(10);
        s.changeName("sport");
        System.out.println(s.getName());
        System.out.println(s.determineBudget());
        s.advertise();

        MarketingClub m = new MarketingClub("Marketing", 20, 10000);
        m.addMember(10);
        System.out.println(m.getName());
        m.changeName("marketing");
        System.out.println(m.getName());
        System.out.println(m.determineBudget());
        System.out.println(m.useBudget(12000));
        System.out.println(m.determineBudget());
        m.advertise();
    }
    
}
