package ThreadingConcepts;
class X implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
            Thread.sleep(15);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Y implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Demo1_2 {
    public static void main(String[] args) {
        Runnable obj1 = new X();
        Runnable obj2 = new Y();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
