package leetcode.orderly.problem30_39;

import java.util.*;

public class  Solution39{
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = new ArrayList<>();
        lists = combinationSum(candidates,target);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        Arrays.sort(candidates);

        dfs(candidates,len,target,0,new ArrayDeque<>(),res);
        return res;
    }

    private static void dfs(int[] candidates, int len, int residue, int begin, Deque<Integer> path, List<List<Integer>> res){
        if(residue==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=begin;i<len;i++){
            if(residue-candidates[i]<0){
                break;
            }
            path.addLast(candidates[i]);

            dfs(candidates,len,residue-candidates[i],i,path,res);
            path.removeLast();
        }
    }
}