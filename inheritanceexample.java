class Person{
    public String name;
    private int age;
    protected String gender;
    
    public Person(String name, int age, String gender){
        this.name = name;
        this.age=age;
        this.gender=gender;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class Student extends Person{
    protected int rollNo;
    public float marks;
    public Student(String name, int age, String gender,int rollNo, float marks){
        super(name,age, gender);
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public void displayStudent(){
        System.out.println("............Studnt info........");
        System.out.println("Roll no: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}

public class InheritanceExample{
  public static void main(String args[]) {
    Student s=new Student("Name:",18,"Female",34,92.0f);
    //Person p=new Person;
    s.displayStudent();
    
  }
}
