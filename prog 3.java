//wap to perfrom addition of postive integers till neagtive number is entered using while loop
package sh23packagee;

import java.util.Scanner;

public class prog3add {
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
