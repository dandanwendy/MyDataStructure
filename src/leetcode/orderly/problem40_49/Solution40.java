package leetcode.orderly.problem40_49;

import java.util.ArrayList;
import java.util.List;

public class Solution40 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> lists = new ArrayList<>();
        lists = combinationSum2(candidates,target);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[candidates.length];
        dfs(list,path,candidates,target,used);
        return list;
    }

    public static void dfs(List<List<Integer>> list, List<Integer> path, int[] candidates,int target,
                           int[] used){
       /* int sum  =0;
        for(int i:path){
            sum += i;
        }*/
        /*System.out.println(sum);
        if(sum==target){
            list.add(new ArrayList<>(path));
            path.remove(path.size()-1);
        }else if(sum>target){
            path.remove(path.size()-1);
            return;
        }*/
        if(target==0){
            list.add(new ArrayList<>(path));
            path.remove(path.size()-1);
        }else if(0>target){
            path.remove(path.size()-1);
            return;
        }

        for(int i=0;i<candidates.length;i++){
            if(used[i]==0){
                path.add(candidates[i]);
                used[i] = 1;
                dfs(list,  path, candidates,target-candidates[i], used);
                used[i]=0;
            }
        }

    }
}
