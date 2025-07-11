//wap using buffer reader for allinput typs
package sh23packagee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prog5 {
	public static void main(String[] args)  throws IOExcepion {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter our name: ");
		String name= br.readLine();
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("Enter your percentage: ");
		double percentage = Double.parseDouble(br.readLine());
		
		System.out.print("Enter your grade: ");
		char grade = br.readLine().charAt(0);
		
		System.out.print("Enter float number: ");
		float f = Float.parseFloat(br.readLine());
		
		System.out.print("Enter long number: ");
		long l = Long.parseLong(br.readLine());
		
		System.out.print("Student (true/false): ");
		boolean b = Boolean.parseBoolean(br.readLine());
		
	}
}
