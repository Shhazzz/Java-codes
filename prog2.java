//multiplication  table prog 2
package sh23packagee;

import java.util.Scanner;

public class prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int n;
				System.out.println("Enter value of n: ");
				n=sc.nextInt();
				for (int i=1 ; i<=10 ; i++) {
					System.out.println(n+" x " +i+" = "+n*i);
					
				}
				sc.close();
	}

}
