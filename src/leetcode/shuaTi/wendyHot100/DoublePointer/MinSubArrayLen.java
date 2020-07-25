package leetcode.shuaTi.wendyHot100.DoublePointer;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }

    //来源leetcode详细通俗的思路分析
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (right < n) {
            sum += nums[right];
            right++;
            while (sum >= s) {
                min = Math.min(min, right - left);
                sum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }


    //我的解法
    /*public static int minSubArrayLen(int s, int[] nums) {
        int leng = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=s){
                    if(i==0){
                        leng=j-i+1;
                    }
                    if(j-i+1<leng){
                        leng = j-i+1;
                    }
                    break;
                }
            }
        }
        return leng;
    }*/
}
