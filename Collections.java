import java.util.*;
public class Collections{
    public static void main(String[] args){
        List<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(1);

        System.out.println(values);
        Iterator<Integer> iterator=values.iterator();
        while(iterator.hasNext()){
            int val=iterator.next();
            if (val!=3){
                System.out.println(val);
            }else{
                iterator.remove();
            }
        }
        System.out.println("Next");
        for (int val:values){
            System.out.println(val);
        }
        System.out.println("next");
        values.forEach((Integer val) -> System.out.println(val));
        System.out.println("size :"+values.size());
        System.out.println("isempty :"+values.isEmpty());
        System.out.println("is velue there :"+values.contains(1));
        System.out.println("size :"+values.size());
        System.out.println("isempty :"+values.isEmpty());
        System.out.println("get index vise:"+values.get(0));
        System.out.println("get index of value:"+values.indexOf(1));
        System.out.println("get value of lastindex:"+values.lastIndexOf(1));
        values.stream().sorted().distinct().forEach(System.out::println);
        ArrayDeque<Integer> performDeque=new ArrayDeque<>(5);
        performDeque.addFirst(1);
        performDeque.addLast(2);
        performDeque.addLast(3);
        performDeque.addLast(4);
        performDeque.addLast(5);
        performDeque.addFirst(6);
        performDeque.addFirst(7);
        performDeque.addFirst(8);
        performDeque.offerFirst(5);
        performDeque.pollLast();
        System.out.println(performDeque);
        System.out.println(performDeque.contains(4));
        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(0, 1000);
        list2.add(1, 100);
        list2.add(2, 200);
        System.out.println(list2);
        Vector<Integer> obj =new Vector<>();
        obj.add(0, 200);
        System.out.println(obj.get(0));
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(30);
        System.out.println(st.pop());



    }
}