package fullstack;


import java.util.Scanner;

public class P1 {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	
	public void disply() {
		System.out.println("Enter 1st no: ");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("a=" +a+ "\tb=" +b+ "\tc=" +c);
	}
}




package fullstack2;
import fullstack.P1;

public class packageoutsidepackage {
	public static void main(String[] args) {
		P1 p= new P1();
		p.disply();
	}

}
