package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DemoException2 {
    public static void main(String[] args) {
       int i,j,k=0;
       Scanner sc = new Scanner(System.in);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       try{
            i=sc.nextInt();
            j=Integer.parseInt(br.readLine());
            k=i/j;
       }
       catch(IOException e){

       }
       catch(Exception e){
        System.out.println(e);
       }
       sc.close();
       System.out.println(k);

    }
}
