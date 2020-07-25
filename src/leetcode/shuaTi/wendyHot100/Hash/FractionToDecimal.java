package leetcode.shuaTi.wendyHot100.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FractionToDecimal {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1,2));
    }
    //我的解法想当然的以为结果循环小数则把所有小数位都加“（）
   //实际只有循环位需要加括号，因此需要用Map来记录余数出现的小数位
    public static String fractionToDecimal(int numerator, int denominator) {
        int a = numerator/denominator;
        int b = numerator%denominator;
        if(b==0) return a+"";

        String s1 = a+".";
        String s2 = "";
        Set<Integer> set = new HashSet<>();
         while(true){
              b *=10;
              a = b/denominator;
              b = b%denominator;
             if(!set.contains(b) && b!=0){
                 s2 = s2+a;
                 set.add(b);
             }else if(b==0){
                 s2 = s2+a;
                 break;
             }else{
                 break;
             }
         }
         if(set.contains(b)){
             return s1+"("+s2+")";
         }else{
             return s1+s2;
         }


    }
}
