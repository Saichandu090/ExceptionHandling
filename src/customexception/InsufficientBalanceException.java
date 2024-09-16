package customexception;

public class InsufficientBalanceException extends RuntimeException
{
    private String message="Insufficient Balance to withdraw funds!!";

    @Override
    public String getMessage()
    {
        return message;
    }

    @Override
    public String toString()
    {
        return message;
    }
}
