package Input;

import java.util.*;

public class IntScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num1 = sc.nextInt();
        System.out.println("The number is "+num1);
        System.out.println("Enter decimal number ");
        double num2 = sc.nextDouble();
        System.out.println("The decimal is "+num2);
        System.out.println("enter bool ");
        boolean var = sc.nextBoolean();
        System.out.println(var+" Is the boolean value ");
        sc.close();
    }
}

// Similarly we can input float and other data types
