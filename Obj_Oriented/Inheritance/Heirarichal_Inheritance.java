package Obj_Oriented.Inheritance;

//Base class
class Shape{
    String type;
    String colour;
    public void area(){
        System.out.println("Displaying area");
    }
}


//Subclass or child class
class Triangle extends Shape{
    public void area(int length,int height){
        System.out.println("Area of Triangle is :"+(1/2)*length*height);
    }
}

class Circle extends Shape{
    public void area(int radius){
        System.out.println("Area of circle :"+(22/7)*radius*radius);
    }
}

public class Heirarichal_Inheritance {
    public static void main(String[] args) {
        
    }
}
