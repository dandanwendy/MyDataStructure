package leetcode.shuaTi.wendyHot100.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists = generate(5);
        for(List<Integer> list:lists){
            for( Integer i :list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);

        if(numRows==0) return lists;

        lists.add(list1);
        if(numRows==1) return lists;

        lists.add(list2);
        if(numRows==2) return lists;

        for(int i=2;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
            }
            list.add(1);
            lists.add(list);
        }
      return lists;
    }
}
