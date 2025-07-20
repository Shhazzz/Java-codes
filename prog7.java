/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to store student information using method overloading and constructor overloading
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    char grade;
    int mark1, mark2, mark3;

    // Constructor 1: Name and Roll Number only
    Student(String name, int rollNo, char grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        this.mark1 = this.mark2 = this.mark3 = 0;
    }
    // Constructor 2: Name, Roll Number and 3 Marks
    Student(String name, int rollNo, char grade, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }
    // Method 1: calculateTotal() with no parameters
    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    // Overloaded Method 2: calculateTotal() with 3 parameters
    int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    void displayStudentInfo() {
        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
    }
}

public class Exp7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s;

        System.out.println("Choose how to create Student:");
        System.out.println("1. With Name Roll Number and Grade only");
        System.out.println("2. With Name, Roll Number and 3 Marks");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter your grade: ");
        char grade;
        grade = sc.next().charAt(0);

        if (choice == 1) {
            // Constructor Overloading - 1
            s = new Student(name, roll, grade);

            // Use Method Overloading to calculate total by taking marks from user
            System.out.print("Enter Mark 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter Mark 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter Mark 3: ");
            int m3 = sc.nextInt();

            int total = s.calculateTotal(m1, m2, m3);
            System.out.println("Your grade is: "+grade);
            System.out.println("Total Marks (using method overloading): " + total);
        } else {
            // Constructor Overloading - 2
            System.out.print("Enter Mark 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter Mark 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter Mark 3: ");
            int m3 = sc.nextInt();

            s = new Student(name, roll, grade, m1, m2, m3);
            s.displayStudentInfo();
        }
        sc.close();
    }
}
