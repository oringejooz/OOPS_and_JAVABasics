package Obj_Oriented.Object_Class_JAVA;
//Every class in JAVA extends the object class

class Laptop{
    String model;
    int price;

    public String toString(){
        return "I overrid the toString method";
    }

    public boolean equals(Laptop that){
        if(this.model.equals(that.model)&&this.price==that.price){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        System.out.println(obj1);
        Laptop obj2 = new Laptop();

        obj1.model="Lenovo Legion";
        obj2.model="Lenovo Legion";

        obj1.price=1000;
        obj2.price=1000;

        //Methods of Object class

        //by default it calls the obj.toString() method
        //the toString method returns: getClass().getName()+"@"+Integer.toHexString(hashCode());
        //We can override the toString method

        //equals method for object comparision

        boolean b = obj1.equals(obj2);
        System.out.println(b);
    }    
}
