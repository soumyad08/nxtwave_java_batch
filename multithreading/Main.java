public class Main{
    public static void main(String[] args) {
        System.out.println(" Going inside main method: " + Thread.currentThread().getName());
        MultithreadByExtend multi = new MultithreadByExtend();
//        Thread thread = new Thread(multi);
//        thread.start();
        multi.start();
        System.out.println(" Finish Main Method: " + Thread.currentThread().getName());
    }
}
