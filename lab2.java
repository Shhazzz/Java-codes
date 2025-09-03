/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to demonstrates: Constructor Overloading – using different constructors
	      in the same class. Method Overloading – using methods with the same name
	      but different parameter lists.
	UIN: 241P092
	Date: 21/8/25
*/
package RcoeJavaExp;

//Student class with Constructor and Method Overloading
class SEStudent {
    private String name;
    private int rollNumber;
    private int marks;
    private char grade;
    // Constructor 1: Only name and roll number
    public SEStudent(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = -1; // default value indicating marks not set
        this.grade = grade;
    }
    // Constructor 2: Name, roll number, and marks
    public SEStudent(String name, int rollNumber, int marks, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = grade;
    }
    // Method 1: Display name and roll number only
    public void display() {
        System.out.println("Name\t\t: " + name);
        System.out.println("Roll Number\t: " + rollNumber);
        System.out.println("Grade\t\t: " + grade);
    }
    // Method 2: Display all details including marks
    public void display(boolean showMarks) {
        display(); // reuse the basic display
        if (showMarks && marks != -1) {
            System.out.println("Marks\t\t: " + marks);
        } else if (showMarks) {
            System.out.println("Marks\t\t: Not Available");
        }
    }
}

//Main class to test the program
public class Lab2 {
    public static void main(String[] args) {
// Using Constructor 1
        SEStudent student1 = new SEStudent("Ali", 21, 'A');
// Using Constructor 2
        SEStudent student2 = new SEStudent("Shaz", 29, 'B');
// Using Method Overloading
        System.out.println("\t--Student 1 (Basic Info)--");
        student1.display(); // name and roll number only
        System.out.println("\n\t--Student 2 (Full Info)--");
        student2.display(true); // name, roll number, and marks
    }
}
/*      [OUTPUT]
	--Student 1 (Basic Info)--
Name		: Ali
Roll Number	: 21
Grade		: A

	--Student 2 (Full Info)--
Name		: Shaz
Roll Number	: 29
Grade		: B
Marks		: Not Available

Process finished with exit code 0
 */
