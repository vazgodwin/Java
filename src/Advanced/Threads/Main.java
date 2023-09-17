package Advanced.Threads;

public class Main{
    public static void main(String[] args) throws InterruptedException {
//        for(int i=0;i<10;i++){
//            Thread1 a=new Thread1();
//            Thread t=new Thread(a);
//            t.start();
//        }
        Thread1 a=new Thread1();
        Thread t=new Thread(a);
        Thread2 b=new Thread2();
        t.start();
        b.start();
    }
}
