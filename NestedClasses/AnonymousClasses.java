package NestedClasses;

// class A{
//     public void show(){
//         System.out.println("Showing A");
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("Showing B");
//     }
// }

abstract class B{
    public abstract void show();
}


public class AnonymousClasses {
    public static void main(String[] args) {
        // A obj = new A()
        // {
        // public void show(){
        //     System.out.println("Showing new");
        // } 
        // };
        // //Anonymous Inner Class
        // obj.show();
        B obj = new B()
        {
            public void show(){
                System.out.println("new Show");
            }
            //Works for multiple methods
        };
        obj.show();

    }
}
