package Obj_Oriented.Inheritance;

class Shape1{
    String type;
    String colour;
    public void area(){
        System.out.println("Displaying area");
    }
}


//Subclass or child class
class Triangle1 extends Shape1{
    public void area(int length,int height){
        System.out.println("Area of Triangle is :"+(1/2)*length*height);
    }
}

//Sub-sub class
class EquilateralTriangle1 extends Triangle1{
    public void area(int length,int height){
        System.out.println("Area of Triangle is :"+(1/2)*length*height);
    }
}

//This was MULTI-LEVEL INHERITANCE  Base Class ------> SubClass------>Sub-sub class

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        
    }
}

