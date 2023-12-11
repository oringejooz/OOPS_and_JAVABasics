package Arrays;
import java.util.*;


public class IndexSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number "+(i+1));
            int input=sc.nextInt();
            array[i]=input;
        }

        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

        System.out.println("Enter number you want to search in the array ");
        int search = sc.nextInt();

        for(int i=0;i<n;i++){
            if(array[i]==search){
                System.out.println("Item found at index "+i);
                break;
            }
            else{
                continue;
            }
        }

        sc.close();
    }
}
