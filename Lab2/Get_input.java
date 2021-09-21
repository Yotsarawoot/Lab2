package Lab2;

import java.util.Scanner;
class GetInputFromUser
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Your entered integer "+a);
        float b = in.nextFloat();
        System.out.println("Your entered float "+b);
        in.close();
    }
}

