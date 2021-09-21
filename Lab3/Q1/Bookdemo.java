package Lab3.Q1;

public class Bookdemo {
    
    public static void main (String[] args)
    {
        Book one = new Book("","Pie",100.0d);
        String title = one.title;
        String auther = one.auther;
        System.out.println("Title Name: " + title);
        System.out.println("Auther Name: " + auther);
    }
}
