package customexception;

public class AgeInvalidException extends RuntimeException
{
    private String message="Age Invalid for Marraige";

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
