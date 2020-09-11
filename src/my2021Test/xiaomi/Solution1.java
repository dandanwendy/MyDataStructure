package my2021Test.xiaomi;

import java.util.Scanner;

/**
 * 判断密码是否合格，合格输出0
 *  长度不合格输出1，类型种类不符合输出2
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(isValid(s));
        }
    }
    public static int isValid(String s){
        int len = s.length();
        if(len<8 || len>120){
            return 1;
        }
        int[] type = new int[4];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                type[0]++;
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                type[1]++;
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                type[2]++;
            }else{
                type[3]++;
            }
        }
        for(int i=0;i<4;i++){
            if(type[i]==0){
                return 2;
            }
        }
        return 0;
    }
}
