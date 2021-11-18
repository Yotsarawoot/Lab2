package Lab8.Q1;

public class ClubManagingSystemTest {

    public static void main(String args[]) {
        Club student = new Club("Student", 10);
        student.addMember(190);
        Club Football = new SportClub("Football", 22);
        Football.addMember(18);
        Club RoV = new EsportClub("RoV", 5);
        Club Advertising = new MarketingClub("Advertising", 2, 100);
        Advertising.addMember(8);
        
        Club[] cl = {student, Football, RoV, Advertising};
        ClubManagingSystem club = new ClubManagingSystem(cl);

        System.out.println(club.getNum());

        System.out.println(club.getHighestMemberClub().getName());
        System.out.println(club.getAllMember());
        System.out.println(club.determineAllBudget());
        ClubManagingSystem.advertiseClub(student);
        club.advertiseClub(1);

    }
    
}
