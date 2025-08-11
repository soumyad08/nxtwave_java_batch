public class MultithreadByExtend extends Thread{
    public void run(){
        System.out.println(" Code execute here: " + Thread.currentThread().getName());
    }
}