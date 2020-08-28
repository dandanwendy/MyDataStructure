package niuke.huawei.problem91_100;

import java.util.Scanner;

public class Solution91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(go(n,m));
        }

    }

    public static int go(int a,int b){
        if(a==0 || b==0) return 0;
        int n = a+1;
        int m = b+1;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<m;i++){
            dp[0][i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j] = dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }
}
