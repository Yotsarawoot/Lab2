import java.util.Scanner;

public class Q2
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Float grade = in.nextFloat();
        String result = passgrade(grade);
        System.out.println(result);
        in.close();
    }

    public static String passgrade (float grade){
        String result = ( grade == 4.0 || grade == 3.5 || grade == 3.0 || grade == 2.5 || grade == 2.0 || grade == 1.5 || grade == 1.0 ||grade == 0.0) ? "true":"false";
        return result;
    }
}