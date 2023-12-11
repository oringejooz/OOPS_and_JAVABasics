package Obj_Oriented.Inheritance;


//Inheritance improves code reusability
//When a class inherits the properties(data members & member functions) of another class it is called Inheritance

//Types of Inheritance

//Single Level
//Heirarichal 
//Multi-Level
//Hybrid

//Multiple Inheritance - concept of C++ Java doesn't support directly. INTERFACES are used


//Base or Parent or Super class
class Shape_{
    String type;
    String colour;
    public void area(){
        System.out.println("Displaying area");
    }
}


//Subclass or child class
class Triangle_ extends Shape_{
    public void area(int length,int height){
        System.out.println("Area of Triangle is :"+(1/2)*length*height);
    }
}

//This was SINGLE LEVEL INHERITANCE 1 Base Class ---extends---> 1 SubClass

public class Inheritance_Shape {
    public static void main(String[] args) {
        Triangle_ t1 = new Triangle_();
        t1.colour="Pink";
        t1.area();
    }
}
