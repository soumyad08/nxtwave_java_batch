import java.util.*;
public class Iterable {
    public static void main(String[] args){
        List<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        System.out.println(values);
        Iterator<Integer>valueInArrays=values.iterator();
        while (valueInArrays.hasNext()){
            int val=valueInArrays.next();
            System.out.println(val);
            if (val==3){
                valueInArrays.remove();
            }
        }
        System.out.println(" Iterating the values using for each loop ");
        for(int val:values){
            System.out.println(val);
        }
        System.out.println("Inbuilt for each with arrows chu chu");
        values.forEach((Integer val) -> System.out.println(val));
        System.out.println(values);
        CollectionExamples a=new CollectionExamples();
    }
}
class CollectionExamples{
    CollectionExamples(){
        List<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        System.out.println(values.size());
        System.out.println(values.isEmpty());
        System.out.println(values.contains(4));
        System.out.println(values.contains(2));
        System.out.println(values.contains(2));
        System.out.println(values.remove((Integer) 2));
        System.out.println(values);
        Stack
    }
}