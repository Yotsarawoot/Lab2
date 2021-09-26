package Lab3.Q6;

public class AccountListTest {

    public static void main (String[] args)
    {
        AccountList al = new AccountList(3);

        boolean success = al.appendAccount (new Account("Pie1", -1));
        System.out.println(success);

        success = al.appendAccount (new Account("Pie2", 1));
        System.out.println(success);

        success = al.appendAccount (new Account("Pie3", 5));
        System.out.println(success);

        success = al.appendAccount (new Account("Pie4", 10));
        System.out.println(success);

        Account acc = al.getAccount(1);
        if(acc != null)
        {
            System.out.println(acc.readName());
            System.out.println(acc.readBalance());
        }

        acc = al.getAccount(3);
        if(acc != null)
        {
            System.out.println(acc.readName());
            System.out.println(acc.readBalance());
        }
    }
    
}
