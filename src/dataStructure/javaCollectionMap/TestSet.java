package dataStructure.javaCollectionMap;

import java.util.*;
import java.util.concurrent.TimeoutException;

public class TestSet {
    public static void main(String[] args) {
        //testHashSet();
        //testLinkedHashSet();
        testTreeSet();

    }

    public static void testHashSet(){
        Set<String> set  =new HashSet<>();
        set.add("dandan");
        set.add("dandan");
        set.add("wendy");
        set.add("cece");

        System.out.println("增强for遍历");
        for(String s:set){
            System.out.println(s);
        }
        set.remove("wendy");

        System.out.println("iterator迭代器遍历");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.add("wendy");

        System.out.println("lambda遍历1");
        set.forEach(items->{
            System.out.println(items);
        });

        //HashSet好像没有直接修改元素的方法

        System.out.println("lambda遍历2");
        set.forEach(System.out::println);
    }

    public static void testLinkedHashSet(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("dandan");
        linkedHashSet.add("wendy");
        linkedHashSet.add("wendy");
        linkedHashSet.add("cece");


        System.out.println("增强for遍历");
        for(String s:linkedHashSet){
            System.out.println(s);
        }
        linkedHashSet.remove("wendy");

        System.out.println("iterator迭代器遍历");
        Iterator<String> it = linkedHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        linkedHashSet.add("wendy");

        System.out.println("lambda遍历1");
        linkedHashSet.forEach(items->{
            System.out.println(items);
        });

        //HashSet好像没有直接修改元素的方法

        System.out.println("lambda遍历2");
        linkedHashSet.forEach(System.out::println);
    }

    static Comparator<String> cmp = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.length()-s2.length();
        }
    };

    public static void testTreeSet(){
        TreeSet<String> treeSet = new TreeSet<>(cmp);
        treeSet.add("dandan");
        treeSet.add("wendy");
        treeSet.add("cece");

        System.out.println("增强for遍历");
        for(String s : treeSet){
            System.out.println(s);
        }
        treeSet.remove("wendy");

        System.out.println("iterator迭代器遍历");
        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        treeSet.add("wendy");

        System.out.println("lambda遍历1");
        treeSet.forEach(items->{
            System.out.println(items);
        });

        //HashSet好像没有直接修改元素的方法

        System.out.println("lambda遍历2");
        treeSet.forEach(System.out::println);
    }
}
