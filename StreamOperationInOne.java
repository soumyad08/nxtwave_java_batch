import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamOperationInOne {
    public static void main(String[] args) {
        // Intermediate Operation
        // 1. Filter
         List <String> friednsName = List.of("Chaitanya" , "Soumyadeep", "Cohan", "Raja");
        friednsName.stream().filter(name -> name.startsWith("C")).peek(System.out::println).collect(Collectors.toList());

        // 2. Map
        //friednsName.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

        // 3. Flatmap & Distinct
//        List<List<Integer>> numbers = List.of(
//                List.of(10, 5, 2),
//                List.of(2, 7, 15, 6)
//        );
//        Integer [] result = numbers.stream().flatMap(num -> num.stream()).distinct().sorted().toArray(Integer[]::new);
//
//        for(Integer n : result){
//            System.out.println(n);
//        }

        // 4. Peek

//        List<Integer> nums = Arrays.asList(2,1,5,7,6);
//        List<Integer> numOfStream = nums.stream()
//                                .filter((Integer val) -> val > 2)
//                                .peek((Integer val) -> System.out.println(val))
//                                .map((Integer val) -> -1 * val)
//                                .collect(Collectors.toList());
//
//        System.out.println("Final List: " + numOfStream);

    }
}