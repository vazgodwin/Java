package Advanced.Threads;

public class Thread1 implements Runnable{
    public void run(){
        System.out.println("Thread:1 -> "+Thread.currentThread().threadId());
    }
}
