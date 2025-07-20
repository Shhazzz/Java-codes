/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to perform addition of positive integers till negative integer is entered using while loop
	UIN: 241P092
	Date: 11/7/25
*/package RcoeJavaExp;
import java.util.Scanner;

public class Exp4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        final String correctPassword = "rcoe1234";
        String inputPassword;
        do {
            System.out.print("Enter pawssword: ");
            inputPassword = sc.nextLine();

            if (!inputPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again!\n");
            }
        } while (!inputPassword.equals(correctPassword));
        System.out.println("\nLogged in Successfully! Welcome to the system!");
        sc.close();
    }
}
