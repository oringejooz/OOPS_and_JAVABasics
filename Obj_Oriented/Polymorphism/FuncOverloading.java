package Obj_Oriented.Polymorphism;


//Polymorphism - Compile Time & Run Time
//Compile Time : Function Overloading   Constructor Overloading
class Student2{
    String name;
    int age;
    //Function Overloading 
    public void printInfo(String name){
        System.out.println("1)Your name is - "+name);
    }
    public void printInfo(int age){
        System.out.println("2)Your age is - "+age);
    }
    public void printInfo(String name,int age){
        System.out.println("3)Name - "+name+"\nAge - "+age);
    }
    public void printInfo(int age,String name){
        System.out.println("4)Name - "+name+"\nAge - "+age);
    }

    //Differentiation factor b/w the functions

    /*Either diff. return types
     * if return types are same then data types of the arguments should be different
     * Or Number of arguments should be different
     * or Order of arguments should be different
    */
}

public class FuncOverloading {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name="Swarnima";
        s1.age=20;
        
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
        s1.printInfo(s1.age,s1.name);
    }
}
