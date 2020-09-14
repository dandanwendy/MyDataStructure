package leetcode.orderly.problem40_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution47 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution46 solution = new Solution46();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        dfs(nums,nums.length,0,used,lists,path);
        return lists;
    }
    public static void dfs(int[] nums,int len,int depth,int[] used,List<List<Integer>> lists,List<Integer> path){
        if(depth==len){
            lists.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){
            //此处剪枝真实神来之笔.比如以2为组合的首元素时，若它前面有未被使用的2，说明以之前的2开头的已经组合完毕，则一定会重复组合，直接剪去即可。
            if(i>0 && nums[i]==nums[i-1] && used[i-1]==0) continue;
            if(used[i]==0){
                used[i]=1;
                path.add(nums[i]);
                dfs(nums,len,path.size(),used,lists,path);
                used[i]=0;
                path.remove(path.size()-1);
            }
        }
    }
}
