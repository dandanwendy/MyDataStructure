package leetcode.shuaTi.wendyHot100.DoublePointer;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] a = {-3,-2,-5,3,-4};
        System.out.println(threeSumClosest(a,-1));
    }

    public static int threeSumClosest(int[] nums, int target) {
       // int sum = 0;
       // int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];

                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result = sum;
                }

                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else{
                    return sum;
                }
            }
        }
        return result;
    }
}
