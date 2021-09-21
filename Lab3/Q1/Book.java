package Lab3.Q1;

public class Book {
    public String title;
    public String auther;
    public double price;

    public Book(String t, String a, double p) {
        title = t;
        auther = a;
        price = p;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }
}
