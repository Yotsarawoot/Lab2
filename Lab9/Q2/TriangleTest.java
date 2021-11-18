package Lab9.Q2;

public class TriangleTest {

    public static void main(String[] args){
        RightTriangle r = new RightTriangle(3.0, 5.0, 4.0);
        System.out.println(r.getLongestSideLength());
        System.out.println(r.getPerimiter());
        System.out.println(r.getLargestAngle());
        
        System.out.println(" ");
        EqualateralTriangle e = new EqualateralTriangle(6.0);
        System.out.println(e.getLongestSideLength());
        System.out.println(e.getPerimiter());
        System.out.println(e.getLargestAngle());
        

        
    }
    
}
