package my2021Test.guangLianDa;

import java.util.Scanner;

/**
 * 有1个机器人可以做出n种动作，每种动作花费一定的电量可以做出某种动作并带来m愉悦感。在给定的电量下，如何使愉悦感最大？
 *输入：动作数，总电量
 *     每个动作耗费的电量，电量是小数，带来的愉悦感
 * 输出：最大的愉悦感
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int charge = sc.nextInt();
            double[][] robots = new double[num][2];
            for(int i=0;i<num;i++){
                robots[i][0] = sc.nextDouble();
                robots[i][1] = sc.nextDouble();
            }
            double[][] dp = new double[num+1][charge+1];
            for(int i=1;i<num+1;i++){
                for(int j=1;j<charge+1;j++){
                    if(j<robots[i-1][0]){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-(int)robots[i-1][0]]+robots[i-1][1]);
                    }
                }
            }
            System.out.println((int)dp[num][charge]);
        }
    }
}
