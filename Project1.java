/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP that takes first and last name and birth year and displays user's age.
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;
import java.util.Scanner;

public class Project1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String fname, lname;
        int birthYear;
        int age;

        System.out.print("Enter your first name: ");
        fname = sc.nextLine();
        System.out.print("Enter your last name: ");
        lname = sc.nextLine();
        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();
        age = 2024- birthYear;

        System.out.println("\nHello, "+fname +" "+lname+"!\nYou're "+age+" years old.");

        sc.close();
    }
}
