package leetcode.orderly.problem40_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        //int[] candidates = {1,2,3};
        int target = 8;
        List<List<Integer>> lists = new ArrayList<>();
        lists = combinationSum2(candidates,target);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[candidates.length];
        Arrays.sort(candidates);
        dfs(lists,path,0,candidates,target,used);
        return lists;
    }

    public static void dfs(List<List<Integer>> lists, List<Integer> path, int begin,int[] candidates,int target, int[] used){
        if(target==0){
            lists.add(new ArrayList<>(path));
            return;
        }else if(target<0){
            return;
        }

        for(int i=begin;i<candidates.length;i++){
            if(i>0 && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]<=target){
                path.add(candidates[i]);
                dfs(lists,  path, i+1,candidates,target-candidates[i], used);
                path.remove(path.size()-1);
            }
        }

    }
}
