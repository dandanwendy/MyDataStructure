package leetcode.shuaTi.wendyHot100.NumberOperation;

import java.math.BigInteger;

public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

    //0的个数与出现的5的个数相关，通过数学归纳出现的5的个数
   /* public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }*/


    //先算出阶乘再判断末尾0的个数，这种方法会超时
    public static int trailingZeroes(int n) {
        int numOfzero = 0;
        BigInteger res = jiecheng(n);
        while(res.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            numOfzero++;
            res = res.divide(BigInteger.TEN);
        }
     return numOfzero;
    }

    public static BigInteger jiecheng(int n){
        if(n==0 || n==1){
            return BigInteger.ONE;
        }else{
            return jiecheng(n-1).multiply(BigInteger.valueOf(n));
        }
    }
}
