package ThreadingConcepts;

class Counter{
    int count;
    public synchronized void increment(){//synchronised makes sure that the method is being used by only one thread at a time
        count++;
    }
}

public class Demo1_3 {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i=0;i<5;i++){
                    c.increment();
                }
            }
        };
        Runnable obj2 = new Runnable(){
            public void run(){
                for(int i=0;i<5;i++){
                    c.increment();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try{
        t1.join();//Join allows main to wait for the two threads and come back
        t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        finally{
            System.out.println(c.count);
        }
    }
}
