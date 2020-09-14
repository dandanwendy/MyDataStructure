package leetcode.orderly.problem70_79;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists = combine(4,2);

        for(List<Integer> list:lists){
            list.forEach(item-> System.out.print(item+" "));
            System.out.println();
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(n,k,0,lists,path);
        return lists;
    }
    public static void dfs(int n,int k,int begin,List<List<Integer>> lists,List<Integer> path){
        if(path.size()==k){
            lists.add(new ArrayList<>(path));
        }
        for(int i=begin;i<n;i++){
            path.add(i+1);
            dfs(n,k,i+1,lists,path);
            path.remove(path.size()-1);
        }
    }
}
