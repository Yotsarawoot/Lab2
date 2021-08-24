import java.util.Scanner;

public class Q2
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Float grade = in.nextFloat();
        String result = ( grade == 4.0 || grade == 3.5 || grade == 3.0 || grade == 2.5 || grade == 2.0 || grade == 1.5 || grade == 1.0 ||grade == 0.0) ? "true":"false";
        System.out.println(result);
    }
}