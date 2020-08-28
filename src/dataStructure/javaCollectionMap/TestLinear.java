package dataStructure.javaCollectionMap;

import java.util.*;

public class TestLinear {
    public static void main(String[] args) {
        //testArraylist();

        //testLinkedlist();

        //testPriorityQueue();
        testStack();

    }

    public static void testArraylist(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //for循环遍历Arraylist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------------------------");
        //增强for遍历
        for(Integer i: list){
            System.out.println(i);
        }
        //改变元素
        list.set(1,4);
        // Lambda 表达式遍历（JDK 1.8）
        System.out.println("\n第三种遍历方式：Lambda 表达式遍历 List 集合");
        list.forEach(item->{
            System.out.println(item);
        });
        //删除元素
        list.remove(0);

        // Lambda 表达式遍历（JDK 1.8）
        System.out.println("\n第四种遍历方式：Lambda 表达式遍历 List 集合");
        list.forEach(System.out::println);
    }

    public static void testLinkedlist(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("lidan");
        linkedList.add("wendy");
        linkedList.add("baby");

        //for循环遍历
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("--------------------");
        //增强for
        for(String s:linkedList){
            System.out.println(s);
        }
        linkedList.set(1,"baobei");

        //lambda表达式遍历1
        System.out.println("lambda表达式遍历");
        linkedList.forEach(items->{
            System.out.println(items);
        });

        linkedList.remove(2);
        //lambda表达式遍历1
        linkedList.forEach(System.out::println);
    }


    static Comparator<String> cmp = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.length()-s2.length();
        }
    };

    public static void testPriorityQueue(){
        //默认创建一字母大小排序
        //Queue<String> priorityQueue = new PriorityQueue();

        //自定义比较器以字符串长度排序
        Queue<String> priorityQueue = new PriorityQueue<>(cmp);
        priorityQueue.add("dandan");
        priorityQueue.add("wendy");
        priorityQueue.add("cece");

        //迭代器遍历
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------");

        //lambda遍历1
        priorityQueue.forEach(items->{
            System.out.println(items);
        });
        //lambda遍历2
        priorityQueue.forEach(System.out::println);

        System.out.println("----------------");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        System.out.println("----------------");

    }

    public static void testStack(){
        Stack<String> stack = new Stack<>();
        stack.add("dandan");
        stack.add("wendy");
        stack.push("cece");

        System.out.println("for循环遍历");
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i));
        }
        System.out.println("增强for循环遍历");
        for(String s:stack){
            System.out.println(s);
        }

        System.out.println("iterator迭代器遍历");
        Iterator<String> it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        stack.set(1,"baby");

        System.out.println("lambda遍历1");
        stack.forEach(items->{
            System.out.println(items);
        });
        stack.remove(1);

        System.out.println("lambda遍历2");
        stack.forEach(System.out::println);

        System.out.println("弹出元素遍历");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
