package Lab9.Q1;

public class GradStudent extends PSUStudent {
    protected int passThesis;

    public GradStudent (int a, Double g){
        super(a, g);
        passThesis = 0;
    }

    public void setPassThesis(int p){
        passThesis = p;
    }

    public Double getGrade(){
        return gpa*passThesis;
    }

}
