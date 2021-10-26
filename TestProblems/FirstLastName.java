package TestProblems;

import java.util.Scanner;

public class FirstLastName {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter your first name : ");
        String firstname = input.next();

        System.out.print("Enter your last name : ");
        String lastname = input.next();

        System.out.println("Your full name is "+ firstname + " " + lastname);
    }
}
