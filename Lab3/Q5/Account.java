package Lab3.Q5;

public class Account {
    private String name;
    private double balance;

    public Account (String name, double balance)
    {
        this.name = name;
        if(balance >= 0) this.balance = balance;
        else this.balance = 0;
    }

    public void modifyName (String name)
    {
        this.name = name;
    }

    public void deposit (double depositAmount)
    {
        if(depositAmount > 0) balance = balance + depositAmount;
    }

    public String readName ()
    {
        return name;
    }

    public double readBalance ()
    {
        return balance;
    }
}
