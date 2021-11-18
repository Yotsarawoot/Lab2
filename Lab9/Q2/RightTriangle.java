package Lab9.Q2;

public class RightTriangle extends Triangle{
    protected Double side1;
    protected Double side2;
    protected Double side3;

    public RightTriangle(Double s1, Double s2, Double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public Double getLongestSideLength(){
        Double maxSide = 0.0;
        maxSide = (maxSide < side1)? side1:maxSide;
        maxSide = (maxSide < side2)? side2:maxSide;
        maxSide = (maxSide < side3)? side3:maxSide;
        return maxSide;
    }

    public Double getPerimiter(){
        return side1+side2+side3;
        
    }

    public Double getLargestAngle(){
        Double largeAngle = 90.0;
        return largeAngle;
    }
}
