package algorithm.sort;

import java.util.ArrayList;
public class BucketSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        BucketSort.bucketSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class BucketSort{
    public static void bucketSort(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //找到数组中的最大和最小值
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        //桶数
        int bucketNum = (max - min) + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        //将每个元素放入桶
        for(int i = 0; i < arr.length; i++){
            int num = (arr[i] - min);
            bucketArr.get(num).add(arr[i]);
        }

       int k =0;
       for(int i=0;i<arr.length;i++){
           //int num = (arr[i] - min) / (arr.length);
           for(int j=0;j<bucketArr.get(i).size();j++){
               if(bucketArr.get(i)!=null){
                   arr[k++] = bucketArr.get(i).get(j);
               }

           }
       }
    }
}
