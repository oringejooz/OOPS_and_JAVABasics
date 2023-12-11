package Conditional_Statements.if_else;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name - ");
        String name = sc.next();
        System.out.print("Enter your age - ");
        
        int age = sc.nextInt();
        if(age>=18){
            System.out.println(name+" is an adult");
        }
        else{
            System.out.println(name+" is not an adult");
        }
        sc.close();
    }
}
