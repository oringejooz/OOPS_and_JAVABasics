package Arrays._2DArrays;

import java.util.*;

public class simple2D {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter element"+(i+1)+","+(j+1));
                int num = sc.nextInt();
                array[i][j]=num;
            }
        }
        sc.close();
    }
}
