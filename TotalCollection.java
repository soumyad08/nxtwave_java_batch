import java.util.*;

public class TotalCollection {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(7);

        System.out.println(values);

//        Iterator<Integer> iterateValues = values.iterator();
//        while(iterateValues.hasNext()){
//            int val = iterateValues.next();
//            System.out.println(val);
//
//            if(val == 5){
//                iterateValues.remove();
//            }
//        }
//
//        System.out.println(" For each method in collec");
//        values.forEach((Integer val) -> System.out.println(val));

        // Collection

        System.out.println(" size : " + values.size());
        System.out.println(" size : " + values.isEmpty());
        System.out.println(" contains ele : " + values.contains(3));
        values.add(9);
        System.out.println(" contains ele : " + values.contains(9));

        values.remove(2);
        System.out.println(" remove " + values.contains(5));

        System.out.println(values);

        Stack<Integer> stackval = new Stack<>();
        stackval.add(11);
        stackval.add(13);
        stackval.add(15);

        values.addAll(stackval);
        System.out.println(" Add all values  " + values.containsAll(stackval));

        System.out.println(values);
    }
}