package dataStructure.javaCollectionMap;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        //testHashMap();
        //testLinkedHashMap();
        testTreeMap();

    }

    public static void testHashMap(){
        Map<String,Integer> map = new HashMap<>();
        String[] persons = {"丹丹","马小迪","李策","丹丹"};

        for(String s:persons){
            /*if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }*/

            map.put(s,!map.containsKey(s)?1:map.get(s)+1);
        }
         //map.putIfAbsent("丹丹",1);
        //通过键集合keyset遍历
        for(String s:map.keySet()){
            System.out.println(s+": "+map.get(s));
        }

        map.put("李策",2);

        System.out.println("map.entrySet()遍历");
        for(Map.Entry<String,Integer> items:map.entrySet()){
            System.out.println(items.getKey()+": "+items.getValue());
        }
        map.remove("李策");

        System.out.println("iterator迭代器遍历");
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> items = it.next();
            System.out.println(items.getKey()+": "+items.getValue());
        }

        System.out.println("lambda遍历1");
        map.forEach( (k,v)->{System.out.println(k+" "+v);} );
    }

    public static void testLinkedHashMap(){
        Map<String,Integer> map = new LinkedHashMap<>();
        String[] persons = {"丹丹","马小迪","李策","丹丹"};

        for(String s:persons){
            /*if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }*/
            map.put(s,!map.containsKey(s)?1:map.get(s)+1);
        }
        //map.putIfAbsent("丹丹",1);
        //通过键集合keyset遍历
        for(String s:map.keySet()){
            System.out.println(s+": "+map.get(s));
        }

        map.put("李策",2);

        System.out.println("map.entrySet()遍历");
        for(Map.Entry<String,Integer> items:map.entrySet()){
            System.out.println(items.getKey()+": "+items.getValue());
        }
        map.remove("李策");

        System.out.println("iterator迭代器遍历");
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> items = it.next();
            System.out.println(items.getKey()+": "+items.getValue());
        }

        System.out.println("lambda遍历1");
        map.forEach( (k,v)->{System.out.println(k+" "+v);} );
    }

    public static void testTreeMap(){
        Map<String,Integer> map = new TreeMap<>();
        String[] persons = {"丹丹","马小迪","李策","丹丹"};

        for(String s:persons){
            /*if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }*/
            map.put(s,!map.containsKey(s)?1:map.get(s)+1);
        }
        //map.putIfAbsent("丹丹",1);
        //通过键集合keyset遍历
        for(String s:map.keySet()){
            System.out.println(s+": "+map.get(s));
        }

        map.put("李策",2);

        System.out.println("map.entrySet()遍历");
        for(Map.Entry<String,Integer> items:map.entrySet()){
            System.out.println(items.getKey()+": "+items.getValue());
        }
        map.remove("李策");

        System.out.println("iterator迭代器遍历");
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> items = it.next();
            System.out.println(items.getKey()+": "+items.getValue());
        }

        System.out.println("lambda遍历1");
        map.forEach( (k,v)->{System.out.println(k+" "+v);} );
    }
}
