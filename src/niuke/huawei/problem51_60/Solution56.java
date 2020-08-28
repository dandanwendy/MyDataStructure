package niuke.huawei.problem51_60;

import java.util.Scanner;

/*
先判断一个数字是不是完全数，再判断区间内的完全数个数
 */
public class Solution56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int c = 0;
            for(int i=1;i<=a;i++){
               if(isPerfectNumber(i)){
                  c++;
              }
            }
            System.out.println(c);
        }
    }

    public static boolean isPerfectNumber(int n){
        int b=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                b += i;
            }
        }
       return b==n?true:false;
    }
}
