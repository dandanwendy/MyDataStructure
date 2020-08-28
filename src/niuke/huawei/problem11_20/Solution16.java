package niuke.huawei.problem11_20;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int money = sc.nextInt();
            int quantity = sc.nextInt();
            int[] price = new int[quantity];
            int[] importance = new int[quantity];
            int[] accessory = new int[quantity];
            for(int i=0;i<quantity;i++){
                price[i] = sc.nextInt();
                importance[i] = sc.nextInt();
                accessory[i] = sc.nextInt();
            }
            maxValue(price,importance,accessory,money,quantity);
        }
    }

    public static void maxValue(int[] price, int[] importance, int[] accessory, int money, int quantity){
        int[][] dp = new int[quantity][money+1];

        for(int i=0;i<quantity;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<money+1;i+=10){
            dp[0][i]=0;
        }

        for(int j=1;j<quantity;j++){
            for(int i=0;i<money+1;i+=10){
                if(accessory[j]==0){
                    if(i-price[j]>=0){
                        dp[j][i]=Math.max(dp[j-1][i],dp[j-1][i-price[j]]+price[j]*importance[j]);
                    }else{
                        dp[j][i]=dp[j-1][i];
                    }

                }else{
                    if(i>price[j]+price[accessory[j]]){
                        dp[j][i]=Math.max(dp[j-1][i],dp[j-1][i-price[j]-price[accessory[j]]]+price[j]*importance[j]+price[accessory[j]]*importance[accessory[j]]);
                    }else{
                        dp[j][i]=dp[j-1][i];
                    }
                }
            }
        }
        System.out.println(dp[quantity-1][money]);
    }
}
