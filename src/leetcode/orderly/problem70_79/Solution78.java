package leetcode.orderly.problem70_79;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] nums = {1,2,3};
        lists = subsets(nums);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
            System.out.println();
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> lists = new ArrayList<>();
       List<Integer> path = new ArrayList<>();
       lists.add(new ArrayList<>());
       for(int i=0;i<nums.length;i++){
           dfs(nums,i+1,0,lists,path);
       }
       return lists;
    }
    public static void dfs(int[] nums,int len,int begin,List<List<Integer>> lists,List<Integer> path){
        if(path.size()==len){
            lists.add(new ArrayList<>(path));
        }
        for(int i=begin;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums,len,i+1,lists,path);
            path.remove(path.size()-1);
        }
    }
}
