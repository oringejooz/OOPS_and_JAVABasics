package Exception_Handling;

public class DemoException {
    public static void main(String[] args) {
        int i,j,k=0;
        int[] arr = new int[4];

        i=5;j=2;
        try
        {
            k=i/j;
            for(int z=0;z<=arr.length;z++){
                arr[z]=z+1;
            }

            for(int value:arr){
                System.out.println(value);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum number of values is "+arr.length);
        }
     System.out.println(k);   
    }
}
