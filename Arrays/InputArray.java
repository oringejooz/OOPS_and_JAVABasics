package Arrays;

import java.util.*;



public class InputArray {

    public static int[] arrayMarksInput(int num){
    int marks[]=new int[num];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<num;i++){
        int mark = sc.nextInt();
        marks[i]=mark;
        sum=sum+mark;
    }
    System.out.println("Percentage = "+(sum/num));
    sc.close();
    return marks;
    
}

public static void main(String[] args) {
    int num = 5;
    int marks[]=arrayMarksInput(num);
    for(int i=0;i<num;i++){
        System.out.println(marks[i]);
    }
    
}
    
}
