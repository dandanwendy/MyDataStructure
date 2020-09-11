package my2021Test.guangLianDa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 有一串数字，比如2，2，1，1，1.每次从最小重复数字开始操作，把最左的删除，下一个*2.直到该数组不再含重复数字为止
 * 输入：数组大小
 *       数组元素
 *  输出：操作后的结果
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
           // int[] digits = new int[num];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<num;i++){
               list.add(sc.nextInt());
            }
          while(getminIndex(list)>Integer.MIN_VALUE){
              fun(list);
          }
          for(int i=0;i<list.size();i++){
              System.out.print(list.get(i)+" ");
          }

        }

    }
    public static void fun(ArrayList<Integer> list){
        int minIndex = getminIndex(list);
        int min = list.remove(minIndex);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==min){
                int b = list.remove(i);
                list.add(i,b*2);
            }
        }

    }
    public static int getminIndex(ArrayList<Integer> list){
        int[] nums = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);
        int min = Integer.MIN_VALUE;
        int minIndex = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                min = nums[i];
                minIndex = i-1;
                break;
            }
        }
        return minIndex;
    }
}
