package inbuiltexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword
{
    public static void main(String[] args)
    {
        try
        {
            getFile();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void getFile() throws IOException {
        FileReader f=new FileReader("Hey.java");
        f.read();
    }
}
