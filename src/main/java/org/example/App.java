package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String inputtedPassword;
        String correctPassword = "abc$123";
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password? ");
        inputtedPassword = input.next();
        if(inputtedPassword.equals(correctPassword))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

    }
}
