package inbuiltexceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked
{
    public static void main(String[] args)
    {
        try
        {
            FileReader f=new FileReader("Hey.txt");
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found!!");
        }
    }
}
