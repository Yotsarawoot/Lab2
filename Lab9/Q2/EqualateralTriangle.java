package Lab9.Q2;

public class EqualateralTriangle extends Triangle{
    protected Double side;

    public EqualateralTriangle(Double s){
        side = s;
    }

    public Double getLongestSideLength(){
        return side;
    }

    public Double getPerimiter(){
        return side*3;
    }
    
    public Double getLargestAngle(){
        Double largeAngle = 60.0;
        return largeAngle;
    }

    
}