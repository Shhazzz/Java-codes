/*
	NAME: Shaz Zahra Zaidi
	Aim : WAP to demonstrate the concept of classes and objects, showcasing object-
	      oriented programming principles such as encapsulation and reuse of code.
	UIN: 241P092
	Date: 20/8/25
*/
package RcoeJavaExp;

//Defining a Students class
class Students {
    // Defining Private data members i.e.(Encapsulation)
    private String name;
    private int rollNumber;
    private char grade;
    private int age;
    // Constructor to initialize student details
    public Students(String name, int rollNumber, char grade, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age = age;
    }
    // Public method to display student details (Code Reuse)
    public void displayDetails() {
        System.out.print("Name: " + name);
        System.out.print("\t\tRoll Number: " + rollNumber);
        System.out.print("\nGrade: " + grade);
        System.out.print("\t\tAge: " + age);
        System.out.println("\n----------------------");
    }
}
//Main class to test Student objects
public class Jexp1 {
    public static void main(String[] args) {
// Creating student objects (Object creation)
        Students student1 = new Students("Ali", 21, 'A', 21 );
        Students student2 = new Students("Zoey", 29, 'A', 20);
        Students student3 = new Students("Chloe", 13, 'B', 20);
// Displaying student details
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
/*      [OUTPUT]

Name: Ali		Roll Number: 21
Grade: A		Age: 21
----------------------
Name: Zoey		Roll Number: 29
Grade: A		Age: 20
----------------------
Name: Chloe		Roll Number: 13
Grade: B		Age: 20
----------------------

Process finished with exit code 0
 */
