package Obj_Oriented.Abstaction.Interfaces;

interface Animal_interface{
    void walk();
    // void eat(){

    // } Interfaces can only have abstract functions
    //DO NOT HAVE CONSTRUCTORS

    //All fields in interfaces are by default public static and final
    //All methods are public and abstract by default
    //A class that implements an interface must implement all the methods declared in the interface
    //Interfaces support multiple inheritance
}

interface Carnivore{

}
class Dog implements Animal_interface,Carnivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }

}

public class Interfaces_in_Java {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
    }
}
