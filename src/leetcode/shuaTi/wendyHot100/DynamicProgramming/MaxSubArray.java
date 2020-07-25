package leetcode.shuaTi.wendyHot100.DynamicProgramming;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            //如果数组都是负数，最大的元素为max;
            if(nums[i]>max) max = nums[i];
            sum = sum+nums[i];
            if(sum>0){
                if(sum>max){
                    max = sum;
                }
            }else{
                sum = 0;
            }
        }
     return max;
    }
}
