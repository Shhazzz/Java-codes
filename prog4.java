package sh23packagee;

import java.util.Scanner;

public class prog4loginsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
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
