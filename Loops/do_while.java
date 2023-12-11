package Loops;

public class do_while {
    public static void main(String[] args) {
        int i=0;
        
        do{
            int j=0;
            i++;
            do{
                j++;
                System.out.print("*");
                
            }while(j<i);
            System.out.println();
            
        }while(i<5);
    }
}
