package Obj_Oriented.final_keyword;

// final class Calc{
//     public void show(){
//         System.out.println("in Calc show");
//     }
//     public void add(int a,int b){
//         System.out.println(a+b);
//     }
// } - final keyword prevents inheritance

class Calc{
    public final void show(){
        System.out.println("By Swar");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    
}
//Method Overriding - Child class overrides the method of the Parent class. To prevent this - final keyword is used
public class Final_methods {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        c.show();
        c.add(3, 5);
    }
}
