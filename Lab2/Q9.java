package Lab2;

import java.util.Scanner;

public class Q9 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Size = in.nextInt();
        int Num[] = new int[Size];
        for(int i = 0; i < Size; i++)
        {
            Num[i] = in.nextInt();
        }
        int Reverse[] = new int[Size];
        for(int i = 0; i < Size; i++)
        {
            Reverse[i] = Num[Size - (i + 1)];
        }
        for(int i = 0; i < Size; i++)
        {
            System.out.print(Num[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < Size; i++)
        {
            System.out.print(Reverse[i] + " ");
        }
        in.close();
    }
}
