import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        List <Integer> values2 = new ArrayList<>();
        values2.add(1);
        values2.add(2);
        //values2.add(3);

        System.out.println(" checking equality between 2 values: " + values.equals(values2));

        // Size
        System.out.println(" The Size of array is: " + values.size());

        //is-empty
        System.out.println(" Is the array empty or, not: " + values.isEmpty());

        // contains() => It will search for an element in the collection.
        System.out.println(values.contains(2));

        //add
        values.add(5);
        System.out.println("addesd values now: " + values.contains(5));

        // remove using index
        values.remove(3);
        System.out.println(" remove the values using: " + values.contains(5));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        values.addAll(stackValues);
        System.out.println(" Add all values using containsAll: " + values.containsAll(stackValues));
    }
}