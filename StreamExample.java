import java.util.List;
import java.util.ArrayList;

public class StreamExample{
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4000);
        salaryList.add(6000);
        salaryList.add(9000);
//
//        int count = 0;
//        for(Integer salary : salaryList){
//            if(salary > 3000) {
//                count++;
//            }
//        }

        long outputCount = salaryList.stream().filter((Integer sal) -> sal > 3000).count();
        System.out.println("Total Salary with Salary more than 3000 " + outputCount);
    }

    // Different ways to create stream
        /*
        * 1. From Collections
        * 2. From Array
        * e.g: Integer [] salaryList = {3,5, 6, 8};
        * Stream<Integer> streamInteger = Arrays.stream(salaryList);
        *
        * 3. Static Method
        * e.g: Stream<Integer> streamFromIntegerArray = Stream.of(1, 4, 5, 6, 7);
        *
        * 4. Stream Builder
        * Stream.Builder<Integer> streamBuilder = Stream.builder();
        * streamBuilder.add(1000).add(8000).add(5000);
        *
        * 5. Stream Iterate
        * e.g: Stream<Integer> streamFromIterate = stream.iterate(1000, (Integer n) -> n + 5000).limit(5);
        * */
}
