package Lab3.Q6;

public class AccountList {
    private Account[] account = {};

    public AccountList (int Num)
    {
        account = new Account[Num];
    }

    public boolean appendAccount (Account account)
    {
        int i = 0;
        int append = 0;
        do
        {
            if(i < this.account.length)
            {
                if(this.account[i] == null)
                {
                    this.account[i] = account;
                    append = 1;
                    break;
                }
                else
                {
                    i++;
                    continue;
                }
            }
            else break;
        }   while(append<1);
        if(append == 1) return true;
        else 
        {
            return false;
        }
    }

    public Account getAccount (int idx)
    {
        int i = 0, count = 0;
        while(i<account.length)
        {

            if(this.account[i] != null)
            {
                count++;
                i++;
                continue;
            }
            else if(this.account == null) break;
        }
        if(idx < count && idx >= 0 ) return account[idx];
        else System.out.println("Input index exceeds the numberof appended elements"); return null;
    }
}
