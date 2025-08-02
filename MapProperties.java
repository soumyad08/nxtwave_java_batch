//Some basic methods available in Map interface:
/*
* size()
* isEmpty()
* containsKey(Object key)
* containsValue(Object value)
* get(Object key) => return the value to which key is mapped.
* put(K key, V value)
* putAll(Map<k,v> m)
* remove(Key)
* clear() => remove all the key value pair
* getOrDefault(key, defaultValue)
* Set<K>keySet()
* Collection<V>values()
* */

// HashMap

import java.util.*;

public class MapProperties {
    public static void main(String[] args) {
        Map<Integer , String > studentNameRollMap = new HashMap<>();
        studentNameRollMap.put(null, "Soumya");
        studentNameRollMap.put(8, null);
        studentNameRollMap.put(3, "Rajasekhar");
        studentNameRollMap.put(3, "Chaitanya");

//        System.out.println(studentNameRollMap);

        studentNameRollMap.putIfAbsent(null, "harsha");
        studentNameRollMap.putIfAbsent(0, "Mohan");

//        System.out.println(studentNameRollMap);

        if(studentNameRollMap.containsKey(3)){
//            System.out.println(studentNameRollMap.get(3));
        }

        if(studentNameRollMap.containsValue("Chaitanya")){
//            System.out.println(studentNameRollMap.get(3));
        }
//        if(studentNameRollMap != null) {
//            for (int rollOfStu : studentNameRollMap.keySet()) {
//                String roll = studentNameRollMap.get(rollOfStu);
//                System.out.println(roll);
//                if(roll != null){
//                System.out.println(roll);
//            }else{
//                    System.out.println(" No grade :" + rollOfStu);
//                }
//            }
//            }


//        for(Map.Entry<Integer , String> stuEntry : studentNameRollMap.entrySet()){
//            Integer key = stuEntry.getKey();
//            String value = stuEntry.getValue();
//
//            System.out.println(" KEY : " + key + " Value: " + value);
//        }

//        for(Integer key : studentNameRollMap.keySet()){
//            System.out.println(" KEY : " + key);
//        }
//
//        Collection<String> values = studentNameRollMap.values();
//        for(String value : values){
//            System.out.println("Values: " + value);
//        }

//        LinkedHashMap<String , Integer> scores = new LinkedHashMap<>();
//        scores.put("Soumya", 96);
//        scores.put(null, 55);
//        scores.put(null, null);
//        scores.put(null, 76);
//        scores.put("chaitanya", 76);
//
//        System.out.println(scores);
//
//        for(Map.Entry<String, Integer> entryScroes : scores.entrySet()){
//            System.out.println(entryScroes.getKey() + " => " + entryScroes.getValue());
//        }

        // Access order for LRU

//        LinkedHashMap<Integer , String> lruMap = new LinkedHashMap<>(16, 0.75f, true);
//        lruMap.put(1, "A");
//        lruMap.put(2, "B");
//        lruMap.put(3, "C");
//
//        lruMap.get(1);
//        lruMap.get(3);
//
//        System.out.println(lruMap);

        // TREE-MAP
        Map<Integer , String> map1 = new TreeMap<>((Integer key1, Integer key2) -> key2 - key1);
        map1.put(20, "SH");
        map1.put(30, "CH");
        map1.put(40, "RJ");
        map1.put(50, "AK");

        System.out.println(map1);
        // Decreasing
        map1.forEach((Integer key, String value) -> System.out.println(key + " => " + value));

        TreeMap<Integer , String> map2 = new TreeMap<>();
        map2.put(20, "SH");
        map2.put(30, "CH");
        map2.put(40, "RJ");
        map2.put(50, "AK");
        map2.put(5, "AK");

        System.out.println(map2.headMap(20));
        System.out.println(map2.tailMap(40));
        System.out.println(map2.firstKey());
        System.out.println(map2.lastKey());

    }
}