import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> performDeque = new ArrayDeque<>();
        //Insertion
        performDeque.addLast(1);
        performDeque.addLast(5);
        performDeque.addLast(10);

        System.out.println("Insertion of elements in for each loop ");
        performDeque.forEach((Integer val) -> System.out.println(val));

        //Deletion
        int element = performDeque.removeFirst();
        System.out.println("Deletion elements: " + element);

        // LIFO(Stack based)

        int removeEle = performDeque.removeFirst();
        System.out.println("Removal Elements: " + removeEle);

        System.out.println("Original Queue :" + performDeque);
    }
}