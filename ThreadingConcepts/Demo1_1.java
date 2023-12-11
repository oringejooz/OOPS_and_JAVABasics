package ThreadingConcepts;

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
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

public class Demo1_1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);//Suggests that Scheduler should set it to highest priority
        obj1.start();
                    try{
            Thread.sleep(2);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        obj2.start();
//Threads Priority - range goes from 1-10 (1 least 10 highest)


    }
}
