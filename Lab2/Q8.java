import java.util.Scanner;

public class Q8 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        int count = 0;
        for (int i = 1; i <= Num; i++)
        {
            if(Num%i == 0) count++;
        }
        String result = (count == 2) ? "A prime number":"Not a prime number";
        System.out.println(result);
    }
}
