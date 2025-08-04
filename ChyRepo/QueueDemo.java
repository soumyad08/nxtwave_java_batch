import java.util.*;
public class QueueDemo {
    public static void main(String[] args){
        ArrayDeque<Integer> pdq=new ArrayDeque();
        List<List<Integer> lol=new ArrayList<>({1,2,3,4,68,0,-2});
        lol=lol.stream().sorted();
        System.out.println(lol);

        pdq.addLast(1);
        pdq.addLast(5);
        pdq.addLast(18);
        System.out.println(pdq);
        int e1=pdq.removeFirst();
        System.out.println(e1);
        int e2=pdq.removeLast();
        System.out.println(pdq);
        System.out.println(e2);
        System.out.println("Removed em");

    }
}