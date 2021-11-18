package Lab9.Q1;

public class UndergradStudent extends PSUStudent {
    protected int currentYear;

    public UndergradStudent (int a, Double g){
        super(a, g);
        currentYear = 1;
    }

    public void setCurrentYear(int c){
        currentYear = c;
    }

    public Double getGrade(){
        return gpa*(1+currentYear/10.0);
    }
}
