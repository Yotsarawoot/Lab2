package Lab9.Q1;

public class PSUstudentTest {
    
    public static void main(String[] args) {
		PSUStudent p1 = new UndergradStudent(19, 1.2);
		System.out.println(p1.getAge());
		System.out.println(p1.getGrade());

		PSUStudent p2 = new GradStudent(25, 2.0);
		System.out.println(p2.getAge());
		System.out.println(p2.getGrade());
	}


}
