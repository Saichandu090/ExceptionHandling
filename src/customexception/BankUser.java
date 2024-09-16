package customexception;

public class BankUser
{
    public static void main(String[] args) {

        Bank bank=new BankImpl();
        bank.deposit(100);
        bank.deposit(600);
        bank.checkBalance();
        System.out.println("=========");
        bank.withDraw(2000);
        bank.checkBalance();
        System.out.println("=========");
    }
}
