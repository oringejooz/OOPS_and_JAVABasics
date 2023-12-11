package Exception_Handling;

import java.util.*;

public class DemoException3 {
    public static void main(String[] args) {
        int i,j,k=0;
        Scanner sc = new Scanner(System.in);
        try
        {i=sc.nextInt();
        j=sc.nextInt();
        k=i/j;

        }

        catch(Exception e){
            System.out.println("Unknown Exception "+e);
        }
        finally{
            System.out.println("Output : "+k);
            System.out.println("BYE");
            sc.close();
        }
        

    }
}
