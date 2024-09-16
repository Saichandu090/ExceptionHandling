package inbuiltexceptions;

public class Unchecked
{
    public static void main(String[] args) {

        int a=0;

        try
        {
            System.out.println(a/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("We cannot divide by zero ");
        }

        System.out.println("Hiii");
    }
}
