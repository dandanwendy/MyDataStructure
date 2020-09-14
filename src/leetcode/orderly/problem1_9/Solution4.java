package leetcode.orderly.problem1_9;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i=0;i<nums1.length;i++){
            queue.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            queue.add(nums2[i]);
        }
        double median = 0;
        int len = queue.size();
        if(len%2!=0){
            for(int i=0;i<len;i++){
                int a = queue.poll();
                if(i==len/2){
                    median =a;
                    break;
                }
            }
        }else{
            for(int i=0;i<len;i++){
                int a = queue.poll();
                if(i==len/2-1){
                    int b = queue.poll();
                    median = (a+b)/2.0;
                    break;
                }
            }
        }
       return median;
    }
}
