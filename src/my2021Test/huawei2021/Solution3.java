package my2021Test.huawei2021;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int space = sc.nextInt();
            int num = sc.nextInt();
            int[] size = new int[num];
            for(int i=0;i<num;i++){
                size[i] = sc.nextInt();
            }
            int[] value = new int[num];
            for(int i=0;i<num;i++){
                value[i] = sc.nextInt();
            }
            System.out.println(maxValue(size,value,space,num));
        }
    }
    public static int maxValue(int[] size, int[] value, int space, int num){
        int[][] dp = new int[num+1][space+1];
        for(int i=0;i<num+1;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<space+1;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<num+1;i++){
            for(int j=1;j<space+1;j++){
                if(j-size[i-1]>=0){
                    int a = Math.max(dp[i][j-1],dp[i-1][j]);
                    dp[i][j] = Math.max(dp[i][j-size[i-1]]+value[i-1],a);
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[num][space];
    }
}