/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP program to demonstrate the concepts of: Single Inheritance, Multilevel Inheritance,
 		  Method Overriding (Runtime Polymorphism) and Multiple Inheritance using Interfaces.
	UIN: 241P092
	Date: 3/9/25
*/
package RcoeJavaExp;
import java.util.Scanner;

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}
//Single Inheritance: Student inherits from Person
class SE_Student extends Person {
    protected int rollNumber;
    public SE_Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }
    // Overridable method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}
//Multilevel Inheritance: GraduateStudent inherits from Student
class GraduateStudent extends SE_Student {
    private String specialization;
    public GraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
//Interface 1: for multiple inheritance
interface ScholarshipHolder {
    void displayScholarshipAmount();
}
//Interface 2: for multiple inheritance
interface SportsPlayer {
    void displaySport();
}
//Class implementing multiple interfaces
class AllRounderStudent extends GraduateStudent implements ScholarshipHolder, SportsPlayer {
    private double scholarshipAmount;
    private String sport;
    public AllRounderStudent(String name, int rollNumber, String specialization, double scholarshipAmount, String sport) {
        super(name, rollNumber, specialization);
        this.scholarshipAmount = scholarshipAmount;
        this.sport = sport;
    }
    @Override
    public void displayScholarshipAmount() {
        System.out.println("Scholarship Amount: $" + scholarshipAmount);
    }
    @Override
    public void displaySport() {
        System.out.println("Sport: " + sport);
    }
    // Overriding displayInfo to add more details
    @Override
    public void displayInfo() {
        super.displayInfo(); // call GraduateStudent's displayInfo
        displayScholarshipAmount();
        displaySport();
    }
}
//Main class to run the demo
public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your specialisation: ");
        String specialization = sc.nextLine();

        System.out.println("\n=== Graduate Student Info ===");
        GraduateStudent gradStudent = new GraduateStudent(name , rollNumber,specialization);

        gradStudent.displayInfo();

        System.out.print("\nEnter your name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your specialisation: ");
        String specialization1 = sc.nextLine();
        System.out.println("\n=== All-Rounder Student Info ===");
        AllRounderStudent allRounder = new AllRounderStudent(name2, rollNum,
                specialization1 , 1500.00, "Basketball");
        allRounder.displayInfo(); // Runtime Polymorphism
    }
}
/*      [OUTPUT]
Enter your name: Brandon Robert
Enter your roll number: 21
Enter your specialisation: CS

=== Graduate Student Info ===
Name: Brandon Robert
Roll Number: 21
Specialization: CS

Enter your name: Brian Hollister
Enter your roll number: 29
Enter your specialisation: AI

=== All-Rounder Student Info ===
Name: Brian Hollister
Roll Number: 29
Specialization: AI
Scholarship Amount: $1500.0
Sport: Basketball

Process finished with exit code 0

 */
