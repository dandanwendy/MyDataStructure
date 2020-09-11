package my2021Test.zte;/*
package my2021Test.zte;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //System.out.println(calmx(4,2));

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            BigInteger value = 0;
            int a = Math.max(k-n,2);
            for(int i=a;i<=Math.min(k-3,m);i++){
                value += calmx(m,i)*calmx(n,k-i);
                System.out.println(value);
            }
            System.out.println(value%1000000007);
        }
    }

    public static BigInteger calmx(int m,int x){
        int num = 0;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        for(int i=0;i<x;i++){
            a = a.multiply(m-i);
            a *=(m-i);
            b *=(x-i);
        }
        return a/b;
    }
}
*/
