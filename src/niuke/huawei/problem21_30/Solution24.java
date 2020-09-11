package niuke.huawei.problem21_30;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] array = new int[num];
            for(int i=0;i<num;i++){
                array[i] = sc.nextInt();
            }

            int max = 0;
            int[] dp1 = maxAccsend(array);
            int[] dp2 = maxDescend(array);
            for(int i=0;i<array.length;i++){
                if(dp1[i]+dp2[i]>max){
                    max = dp1[i]+dp2[i];
                }
            }

            /*int max = Math.max(maxAccsend(array),maxDescend(array));
            for(int i=1;i<array.length-1;i++){
                int[] a1 = new int[i+1];
                int[] a2 = new int[array.length-i];
                for(int j=0;j<a1.length;j++){
                    a1[j] = array[j];
                }
                for(int j=0;j<a2.length;j++){
                    a2[j] = array[j+i];
                }
                int value = maxAccsend(a1)+maxDescend(a2)-1;
                max = Math.max(value,max);
            }*/
            System.out.println(array.length-max+1);
        }
    }
    public static int[] maxAccsend(int[] array){
        int[] dp = new int[array.length];
        dp[0] = 1;
        for(int i=1;i<array.length;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(array[j]<array[i] && dp[j]+1>dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        System.out.println(dp[array.length-1]);
        return dp;
    }

    public static int[] maxDescend(int[] array){
        int[] dp = new int[array.length];
        dp[array.length-1] = 1;
        for(int i=array.length-2;i>=0;i--){
            dp[i] = 1;
            for(int j=array.length-1;j>i;j--){
                if(array[j]<array[i] && dp[j]+1>dp[i]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        return dp;
    }
}
