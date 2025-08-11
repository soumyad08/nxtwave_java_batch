public class MultithreadByRunnable implements Runnable {
    public void run(){
        System.out.println(" Current Thread is " + Thread.currentThread().getName());
    }
}