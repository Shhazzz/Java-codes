/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP using buffer reader to take all inputs
	UIN: 241P092
	Date: 11/7/25
*/
package RcoeJavaExp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exp5 {
    public static void main(String[] args)  throws IOException {
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

        System.out.println("\n--- Your Inputs ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage in float: " + f);
        System.out.println("Double: " + percentage);
        System.out.println("Long: " + l);
        System.out.println("Student : " + b);
        System.out.println("Grade: " + grade);

    }
}
