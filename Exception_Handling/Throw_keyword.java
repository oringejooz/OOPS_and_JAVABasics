package Exception_Handling;

import java.util.*;

public class Throw_keyword {
    public static void main(String[] args) throws Exception {
        int i,j,k=0;
        try(Scanner sc = new Scanner(System.in)){
            i=sc.nextInt();
            j=sc.nextInt();
            k=i/j;
            if(k<4){
                throw new Exception("Minimum value of k is 4");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
