package my2021Test.shenXinFu;

import java.util.Scanner;

/**
 * 有一个4*4的格子，每个格子有一个数字，如何选择路线，使从左上角到右上角的经过的数字和最小。
 * 我选择动态规划求解问题
 * 通过80%，不知道哪里的问题
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int[][] digits = new int[4][4];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    digits[i][j] = sc.nextInt();
                }
            }
            System.out.println(money(digits));
        }
    }
    public static int money(int[][] digits){
        int[][] dp = new int[digits.length][digits[0].length];
        dp[0][0] = digits[0][0];
        for(int i=1;i<digits.length;i++){
            dp[i][0] = dp[i-1][0] + digits[i][0];
        }
        for(int i=1;i<digits[0].length;i++){
            dp[0][i] = dp[0][i-1] + digits[0][i-1];
        }
        for(int i=1;i<digits.length;i++){
            for(int j=1;j<digits[0].length;j++){
                dp[i][j] = Math.min(digits[i][j]+dp[i-1][j],digits[i][j]+dp[i][j-1]);
            }
        }
        return dp[digits.length-1][digits[0].length-1];
    }
}
