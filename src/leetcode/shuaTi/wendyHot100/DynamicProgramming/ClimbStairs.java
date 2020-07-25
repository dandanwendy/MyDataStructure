package leetcode.shuaTi.wendyHot100.DynamicProgramming;

public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int[] clim = new int[n];
        clim[0] = 1;
        clim[1] = 2;

        for(int i=2;i<n;i++){
            clim[i] = clim[i-1]+clim[i-2];
        }
        return clim[n-1];
    }
}
