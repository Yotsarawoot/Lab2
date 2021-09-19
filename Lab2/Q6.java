import java.util.Scanner;

public class Q6 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Charge = in.nextInt();
        double Cost = 0;
        if(Charge > 0 && Charge <= 35)
        {
            Cost = 85;
        }
        else if(Charge > 35 && Charge <= 150)
        {
            Cost = 85 + 1.12*(Charge - 35);
        }
        else if(Charge > 150)
        {
            Cost = 85 + 1.12*(115) + + 2.13*(Charge - 150);
        }
        else
        {

        }
        System.out.print(Cost);
        in.close();
    }
    
}
