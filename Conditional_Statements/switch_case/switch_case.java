package Conditional_Statements.switch_case;
import java.util.*;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("Enter a number from 1 to 3");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Bonjour");
                break;
            case 3:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }
       sc.close();
    }
}
