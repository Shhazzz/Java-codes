/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP that prompts the user to enter name, age, and favorite number to display personalised greeting.
	UIN: 241P092
	Date: 11/7/25
*/
package RcoeJavaExp;

import java.util.Scanner;

public class ProblemSolving1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int age, favNo;
        String name;

        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age= sc.nextInt();
        System.out.print("Enter your favourite number: ");
        favNo = sc.nextInt();
        System.out.println("\nHello, " +name+ "!\n"+"You're "+age+" years old.\nYou're favourite number is "+favNo+"\nAnd double of your favourite number is "+ (2*favNo)+".");

        sc.close();

    }
}
