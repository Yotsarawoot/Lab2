package Lab9.Q1;

public abstract class PSUStudent {
    protected int age;
    protected Double gpa;

    public PSUStudent (int a, Double g){
        age = a;
        gpa = g;
    }
    
    public int getAge (){
        return age;
    }

    public abstract Double getGrade();
    
}
