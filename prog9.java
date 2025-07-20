/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to create student class storing static data member collegeName shared by all students
	UIN: 241P092
	Date: 15/7/25
*/
package RcoeJavaExp;

class StudentWithStatic {
    // Static data member
    static String collegeName = "RCOE SE";

    // Instance data members
    int rollNumber;
    String studentName;

    // Constructor
    StudentWithStatic(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    // Static method to change the college name
    static void changeCollegeName(String name) {
        collegeName = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("College: " + collegeName);
        System.out.println("----------------------");
    }
}

public class Exp9 {
    public static void main(String[] args) {
        // Creating student objects
        StudentWithStatic s1 = new StudentWithStatic(1, "Ayesha");
        StudentWithStatic s2 = new StudentWithStatic(2, "Imran");
        StudentWithStatic s3 = new StudentWithStatic(3, "Brandon");

        // Displaying details before changing the college name
        System.out.println("Before changing college name:");
        s1.display();
        s2.display();
        s3.display();

        // Changing the college name using static method
        StudentWithStatic.changeCollegeName("RCOE TE");

        // Displaying details after changing the college name
        System.out.println("After changing college name:");
        s1.display();
        s2.display();
        s3.display();
    }
}
