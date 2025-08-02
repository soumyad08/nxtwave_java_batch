import java.util.*;

public class List {
    public static void main(String[] args) {
        // linked list implements both deque and list interface.
        // it supports deque method like: getFirst, getLast, removeFirst, removeLast etc.

        LinkedList<Integer> list = new LinkedList<>();

        // Deque Functionality
        list.addLast(200);
        list.addLast(400);
        list.addLast(600);
        list.addFirst(100);

        System.out.println("My First Element will: " + list.getFirst());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0, 50);
        list2.add(1, 60);
        list2.add(2, 70);
        list2.add(3, 80);

        System.out.println("my list element: " + list2.get(2) + " and " + list2.get(3));
    }
}

// insertion t.c => O(1)
// insertion in particular index: O(n)
// searching: O(n)
// Deletion : O(1)
// Deletion in particular index: O(n)