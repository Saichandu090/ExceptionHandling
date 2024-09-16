package customexception;

public class BankImpl implements Bank
{
    private double balance;

    @Override
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println(amount+" deposited Successfully!!");
    }

    @Override
    public void withDraw(int amount)
    {
        if(amount>balance)
        {
            try
            {
                throw new InsufficientBalanceException();
            }
            catch (InsufficientBalanceException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            balance -= amount;
            System.out.println(amount+" Withdrawn Successfully!!");
        }
    }

    @Override
    public void checkBalance()
    {
        System.out.println("Available Balance : "+balance);
    }
}
