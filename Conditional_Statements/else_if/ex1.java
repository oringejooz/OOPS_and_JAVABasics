package Conditional_Statements.else_if;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int a = sc.nextInt();
        System.out.println("Enter num 2:");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
        sc.close();
    }
}
