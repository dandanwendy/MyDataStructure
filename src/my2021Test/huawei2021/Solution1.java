package my2021Test.huawei2021;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String mn = sc.nextLine();
            String[] matrix = mn.split(",");
            int m = Integer.parseInt(matrix[0]);
            int n = Integer.parseInt(matrix[1]);
            if(m==0 || n==0){
                System.out.println(0);
            }

            String[] s = new String[m];
            for(int i=0;i<m;i++){
                s[i] = sc.nextLine();
            }
            System.out.println(lake(s));
        }
    }

    public static int lake(String[] s){
        int[][] dp = new int[s.length][s[0].length()];
        if(s[0].charAt(0)=='S'){
            dp[0][0] = 1;
        }else{
            dp[0][0] = 0;
        }
        for(int i=1;i<s[0].length();i++){
            if(s[0].charAt(i)=='S' && s[0].charAt(i-1)!='S'){
                dp[0][i] = dp[0][i-1] +1;
            }else{
                dp[0][i] = dp[0][i-1];
            }
        }

        for(int i=1;i<s.length;i++){
            if(s[i].charAt(0)=='S' && s[i-1].charAt(0)!='S'){
                dp[i][0] = dp[i-1][0] +1;
            }else{
                dp[i][0] = dp[i-1][0];
            }
        }

        for(int i=1;i<s.length;i++){
            for(int j=1;j<s[0].length();j++){
                if(s[i].charAt(j)=='S' && s[i-1].charAt(j)=='H' && s[i].charAt(j-1)=='H'){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s.length-1][s[0].length()-1];
    }
}
