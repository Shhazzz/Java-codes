/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to create student class storing static data member collegeName shared by all students
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;

class StudentStatic {
    // Static data member
    static String collegeName = "RCOE SE";

    // Instance data members
    int rollNumber, marks;
    String studentName;

    // Constructor
    StudentStatic(int rollNumber, String studentName, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.studentName = studentName;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
        System.out.println("----------------------");
    }
}

public class Project3 {
    public static void main(String[] args) {
        // Creating student objects
        StudentStatic s1 = new StudentStatic(1, "Ali", 90 );
        StudentStatic s2 = new StudentStatic(2, "Alisha", 80);
        StudentStatic s3 = new StudentStatic(3, "Brandon", 93);

        // Displaying details before changing the college name
        System.out.println("Student details: ");
        s1.display();
        s2.display();
        s3.display();

    }
}
