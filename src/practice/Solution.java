package practice;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            if(sum1*2==sum){
                System.out.println(i);
                return i;
            }
        }
        return -1;

    }
}
