package Exception_Handling;

//Try with Resource compatible withonly Java 1.7 and later versions
import java.util.*;

public class Try_with_Resources {
    public static void main(String[] args) {
        String str=null;
        try(Scanner sc = new Scanner(System.in)){
            str = sc.nextLine();
        }
        finally{ 
            System.out.println(str);
        }    
    }
}
