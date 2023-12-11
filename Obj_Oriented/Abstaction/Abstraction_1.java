package Obj_Oriented.Abstaction;

//Abstract class must be declared with abstract keyword
abstract class Animal{
    abstract void walk();//Can have abstract and non abstract methods
    public void eat(){
        System.out.println("Animal eats");
    }
    //It cannot be instantiated
    //It can have Constructors and static methods also
    //It can have final methods that prevents the subclass to change the body of the method

    Animal(){
        System.out.println("Animal Created");
    }

}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction_1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk(); 

        // Animal animal = new Animal();//Cannot instantiate the type Animal- RUNTIME ERROR
        // animal.walk();

    }
      
}
