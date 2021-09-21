package Lab2;

import java.util.Scanner;

public class Q3 
{
    
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int Celsius = in.nextInt();
        printWeather(Celsius);
        in.close();
    }

    public static void printWeather (int Celsius)
    {
        if(Celsius < 0) System.out.println("Freezing Weather");
        else if(Celsius >= 0 && Celsius < 10) System.out.println("Very Cold Weather");
        else if(Celsius >= 10 && Celsius < 20) System.out.println("Cold Weather");
        else if(Celsius >= 20 && Celsius < 30) System.out.println("Normal in Temp");
        else if(Celsius >= 30 && Celsius < 40) System.out.println("It's hot");
        else System.out.println("It's very hot");
    }
}
