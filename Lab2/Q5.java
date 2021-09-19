import java.util.Scanner;

public class Q5 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int SumNumber = in.nextInt();
        int Num[] = new int[SumNumber];
        for(int i = 0; i < SumNumber; i++){
            Num[i] = in.nextInt();
        }
        int Max = LargestNum(Num, SumNumber);
        System.out.println(Max);
        int Average = averageNum(Num, SumNumber);
        System.out.println(Average);
        in.close();
    }

    public static int LargestNum(int[] Num, int SumNumber)
    {
        int Max = 0;
        for(int i = 0; i < SumNumber; i++)
        {
            Max = (Num[i] > Max)? Num[i]:Max;
        }
        return Max;
    }

    public static int averageNum(int[] Num, int SumNumber)
    {
        int Average, sum = 0;
        for(int i = 0; i < SumNumber; i++)
        {
            sum = sum + Num[i];
        }
        Average = sum / SumNumber;
        return Average;
    }
    
}
