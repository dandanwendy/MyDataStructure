package my2021Test.huanJv;

import java.util.Scanner;

/**
 * 这题好像是求第一个比输入数字n大的水仙花数
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println();

        }
    }
    public long nextNarcissisticNumber (int n) {
           for(int i=n+1;;i++){
               if(isticNumber(i)){
                   return i;
               }
           }
    }
    public static boolean isticNumber(int n){
        int sum = 0;
        int b = n;
        int len = 0;
        len = (n+"").length();
        while(b>0){
            int k = b%10;
            int power = 1;
            for(int i=0;i<len;i++){
                power = power*k;
            }
            sum += power;
            b = b/10;
        }
        return sum==n?true:false;
    }

}
