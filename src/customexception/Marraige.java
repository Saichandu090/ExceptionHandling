package customexception;

import java.util.Scanner;

public class Marraige
{
    static int age;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        age=sc.nextInt();
        if(age<18) {
            try {
                throw new AgeInvalidException();
            } catch (AgeInvalidException e) {
                System.out.println(e);
            }
        }
        else
            System.out.println("Welcome to Matrimony!!");

    }
}
