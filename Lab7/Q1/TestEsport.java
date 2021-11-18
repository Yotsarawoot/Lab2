package Lab7.Q1;

public class TestEsport {
   
    public static void main(String[] args){
        EsportClub e = new EsportClub("Esport", 100);
        e.advertise();
        System.out.println(e.determineBudget());
        System.out.println(e.getName());
        
        Club c = new EsportClub("Esport", 100);
        c.advertise();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());
    }
    
}
