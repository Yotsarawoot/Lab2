package Lab3.Q5;

public class TestAccount {

    public static void main (String[] args)
    {
        Account account = new Account("Oak",-1);
        System.out.println(account.readName());
        System.out.println(account.readBalance());

        account.modifyName("Norathep");
        System.out.println(account.readName());
        System.out.println(account.readBalance());

        account.deposit(500);
        System.out.println(account.readName());
        System.out.println(account.readBalance());

        account.deposit(-500);
        System.out.println(account.readName());
        System.out.println(account.readBalance());

    }
    
}
