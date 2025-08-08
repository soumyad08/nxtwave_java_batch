import java.util.*;

public class Queue {
    public static void main(String[] args) {

        // We have two types in priority Queue:
        // 1. Minimum Priority Queue
        // 2. Maximum Priority Queue.

        ArrayDeque<Integer> arrayDe = new ArrayDeque<>();
        arrayDe.addFirst(5);
        arrayDe.addFirst(2);
        arrayDe.addFirst(7);
        arrayDe.addFirst(9);
        arrayDe.addFirst(1);

        System.out.println(arrayDe);

        int removeEle = arrayDe.removeFirst();
        System.out.println(removeEle);
//
//        while(!maxPQ.isEmpty()){
//            int val = maxPQ.poll();
//            System.out.println(" remove from top: " + val);
//        }
//
//        // for each operation
//        maxPq.forEach((Integer val) -> System.out.println(val));
//
//        while(!maxPq.isEmpty()){
//            int val = maxPq.poll();
//            System.out.println("remove from top: " + val);
//        }
//        System.out.println(maxPq);

    }
}