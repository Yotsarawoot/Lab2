import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Integer = in.nextInt();
        int Sum = evenSum1toN(Integer);
        System.out.println(Sum);
        in.close();
    }

    public static int evenSum1toN (int Integer)
    {
        int Sum = 0;
        for(int i = 1; i <= Integer; i++)
        {
            if( i % 2 == 0 ) Sum = Sum + i;
        }
        return Sum;
    }
}
