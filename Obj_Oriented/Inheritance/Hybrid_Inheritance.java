package Obj_Oriented.Inheritance;

//Hybrid Inheritance

class Shape2{
     String shape_type;
     String colour;
}

class Triangle2 extends Shape2{
    public void area(int b,int h){
        System.out.println("Area of Triangle :"+(0.5*b*h));
    }
}

class Circle2 extends Shape2{
    public void area(int r){
        System.out.println("Area of Circle :"+(3.14*r*r));
    }
}

class EquilateralTriangle2 extends Triangle2{

}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        EquilateralTriangle2 et1 = new EquilateralTriangle2();
        et1.shape_type="Equilateral_Triangle";
        et1.colour="red";
        System.out.println(et1.shape_type+" "+et1.colour);
        et1.area(5, 4);
    }
}
