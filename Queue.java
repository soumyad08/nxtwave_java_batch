import java.util.*;

public class Queue {
    public static void main(String[] args) {

        // We have two types in priority Queue:
        // 1. Minimum Priority Queue => which will take min heap of queue.
        // 2. Maximum Priority Queue => which will take max heap.

//        ArrayDeque<Integer> arr = new ArrayDeque<>();
//        arr.addLast(5);
//        arr.addLast(2);
//        arr.addLast(7);
//        arr.addLast(9);
//        arr.addLast(1);
//
//        System.out.println(arr);
//
//        // Deletion
//        int removeEle = arr.removeLast();
//        System.out.println(removeEle);
//
//        System.out.println(arr);

        ArrayDeque<Integer> arrAsStack = new ArrayDeque<>();
        arrAsStack.addFirst(4);
        arrAsStack.addFirst(6);
        arrAsStack.addFirst(9);

        System.out.println(arrAsStack);

        int removeEleAsS = arrAsStack.removeFirst();
        System.out.println(removeEleAsS);
//        while(!maxPQ.isEmpty()){
//            int val = maxPQ.poll();
//            System.out.println(" remove from top: " + val);
//        }
//
     System.out.println(arrAsStack);
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