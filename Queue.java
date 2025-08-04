import java.util.*;

public class Queue {
    public static void main(String[] args) {

        // We have two types in priority Queue:
        // 1. Minimum Priority Queue
        // 2. Maximum Priority Queue.

        PriorityQueue<Integer> maxPq = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPq.add(5);
        maxPq.add(2);
        maxPq.add(7);
        maxPq.add(9);
        maxPq.add(1);

        // for each operation
        maxPq.forEach((Integer val) -> System.out.println(val));

        while(!maxPq.isEmpty()){
            int val = maxPq.poll();
            System.out.println("remove from top: " + val);
        }
        System.out.println(maxPq);

    }
}