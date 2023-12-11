package NestedClasses;

public class DemoA {
    public static void main(String[] args) {
        Integer num = new Integer(8);
        Integer num1 = 12;
        int n = 5;
        Integer number = new Integer(n);//Boxing- taking a primitive value and storing it in an object
        System.out.println(num);
        System.out.println(num1);
        int num2 = num1.intValue();
        System.out.println(num2);

    }
}
