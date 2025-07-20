/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to perform addition of positive integers till negative integer is entered using while loop
	UIN: 241P092
*/
package RcoeJavaExp;
import java.util.Scanner;

public class Exp3 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int num, sum=0;
        System.out.println("Enter postive integers to add and negative number to stop.");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while (num >= 0 ) {
            sum+=num;
            System.out.print("Enter a number: ");
            num=sc.nextInt();
        }
        System.out.println("\nYou've entered a negative number hence it ends here.");
        System.out.println("Sum of the positive numbers is: "+sum);
        sc.close();
    }
}
