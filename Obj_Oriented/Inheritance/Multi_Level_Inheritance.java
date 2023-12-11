package Obj_Oriented.Inheritance;

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

//Sub-sub class
class EquilateralTriangle extends Triangle{
    public void area(int length,int height){
        System.out.println("Area of Triangle is :"+(1/2)*length*height);
    }
}

//This was MULTI-LEVEL INHERITANCE  Base Class ------> SubClass------>Sub-sub class

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        
    }
}

