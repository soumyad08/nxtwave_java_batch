import java.util.*;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println(" values present here: " + values);

        // Iterate the value
        Iterator<Integer> valueInArrays = values.iterator();
        while(valueInArrays.hasNext()){
            int val = valueInArrays.next();
            System.out.println(val);

            if(val == 3){
                valueInArrays.remove();
            }
        }

        System.out.println(" Iterating the values using for each loop ");
        for(int val : values){
            System.out.println(val);
        }

        // for -each method
        System.out.println(" Here is my For Each ");
        values.forEach((Integer val) -> System.out.println(val));
    }
}