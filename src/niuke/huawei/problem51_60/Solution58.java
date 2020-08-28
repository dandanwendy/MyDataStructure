package niuke.huawei.problem51_60;

import java.util.Arrays;
import java.util.Scanner;

//该题就是排序后输出前n个数字即可
//先把前n个数字转换成字符串，再输出才符合牛客网结果
public class Solution58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int quantity = sc.nextInt();
            int n = sc.nextInt();
            int[] digit = new int[quantity];
            for(int i=0;i<quantity;i++){
                digit[i] = sc.nextInt();
            }

            Arrays.sort(digit);
            String s ="";
            for(int i=0;i<n;i++){
               s += digit[i]+" ";
            }
            System.out.println(s);
        }
    }

}
