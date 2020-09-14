package leetcode.orderly.problem90_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] nums = {1,2,2};
        lists = subsetsWithDup(nums);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
            System.out.println();
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used= new int[nums.length];
        lists.add(new ArrayList<>());
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            dfs(nums,i+1,0,used,lists,path);
        }
        return lists;
    }
    public static void dfs(int[] nums,int len,int begin,int[] used,List<List<Integer>> lists,List<Integer> path){
        if(path.size()==len){
            lists.add(new ArrayList<>(path));
        }

        for(int i=begin;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && used[i-1]==0) continue;
            used[i]=1;
            path.add(nums[i]);
            dfs(nums,len,i+1,used,lists,path);
            used[i]=0;
            path.remove(path.size()-1);
        }
    }
}
