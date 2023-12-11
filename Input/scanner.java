package Input;

import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Your name is "+name);
        sc.close();//CLOSE SCANNER
    }
}
