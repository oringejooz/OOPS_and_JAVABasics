package Obj_Oriented.Polymorphism;


class Student{
    String name;
    int age;
    long stu_id;

    public void detailFill(String name,int age,long stu_id){
        this.name=name;this.age=age;this.stu_id=stu_id;
    }

    public void studentDetails(){
        System.out.println("******Student Details******\n"+this.name+"\n"+this.age+"\n"+this.stu_id);

    }
    //Default Constructor 
    //Non Parameterized Constructor
    //Parameterized Constructor
    //Copy Constructor

    //Constructor OverLoading

    //*******Non Parameterized*******
    Student(){
        System.out.println("\nNon Parameterized Constructor called ");
    }

    //*******Parameterized*******
    Student(String name,int age,long stu_id){
        this.name = name;this.age=age;this.stu_id=stu_id;
        System.out.println("\nParameterized Constructor called");
    }

    //*******Copy Constructor*******

    Student(Student s){
        this.name=s.name;this.age=s.age;this.stu_id=s.stu_id;
        System.out.println("\nCopy Constructor Called");
    }

}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();//Constructor - facilitate in object creation; have the same name as class; no return type;for a single object, a contructor is called only once
        s1.detailFill("Swarnima", 20, 500105696);
        s1.studentDetails();

        //Using Parameterized
        Student s2 = new Student("Navya",20,500107895);
        s2.studentDetails();

        Student s3 = new Student(s2);
        s3.studentDetails();
    }
}
