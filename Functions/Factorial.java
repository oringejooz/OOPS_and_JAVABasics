package Functions;



public class Factorial {
    public static int fact(int num){
        int fact_ = 1;
        for(int i=1;i<=num;i++){
            fact_*=i;
        }
        return fact_;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
