package my2021Test.shenXinFu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个长数字n，长度小于9，一个小于9的自然数m，删除长数字n的第m个数字,再把剩余的数字排序输出
 * 比如87456，3   得到8765
 * 不符合输入规则，就输出 error
 * 这题我通过80%
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int position = sc.nextInt();
            String s = num+"";
            if(s.length()!=8 || position>8 || position<1){
                System.out.println("error");
            }else{
                System.out.println(getNum(num,position));
            }
        }
    }

    public static int getNum(int num,int postion){
        String s = num +"";
        int[] digits = new int[s.length()-1];
        int k=0;
        for(int i=0;i<s.length();i++){
            if(i!=(postion-1)){
                digits[k] = (int)s.charAt(i)-48;
                k++;
            }
        }
       Arrays.sort(digits);
        String s1 = "";
        for(int i=digits.length-1;i>=0;i--){
            s1 += digits[i];
        }
        return Integer.parseInt(s1);
    }
}

