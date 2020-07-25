package leetcode.shuaTi.wendyHot100.HeapRelated;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,4};
         int[] res = topKFrequent(nums,2);
         for(int i=0;i<res.length;i++){
             System.out.println(res[i]);
         }

    }
    /*public static int[] topKFrequent(int[] nums, int k) {
        // build hash map : character and how often it appears
        HashMap<Integer, Integer> count = new HashMap();
        for (int n: nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

        // keep k top frequent elements in the heap
        for (int n: count.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        // build output list
        int[] top_k = new int[heap.size()];
        int i=0;
        while (!heap.isEmpty())
            top_k[i++] = heap.poll();
           // Arrays.reverse(top_k);
        return top_k;
    }*/


    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                int value = map.get(key);
                value++;
                map.put(key,value);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer,Integer> o1,
                               Map.Entry<Integer,Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //List<Integer> res = new ArrayList();
        int[] res = new int[k];
        int j=0;
        for(int i=list.size()-k;i<list.size();i++){
            res[j++]=list.get(i).getKey();
        }

        for(Map.Entry<Integer,Integer> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }

        return res;
    }
}
