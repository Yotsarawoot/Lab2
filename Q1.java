public class Q1 
{
    public static float CelsiusToFarenhien (float Celsius)
    {
        float Farenhien;
        Farenhien = Celsius*9/5 + 32 ;
        return Farenhien;
    }
    public static void main(String[] args)
    {
        System.out.println(CelsiusToFarenhien(52));
        System.out.println(CelsiusToFarenhien(0));
    }
}
