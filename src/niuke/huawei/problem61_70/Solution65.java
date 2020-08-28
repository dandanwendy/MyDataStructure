package niuke.huawei.problem61_70;

import java.util.Scanner;

/*
1 先判断哪个字符串短
2 暴力查找短的字符串中所有子串，是否被长串包含
3 找出最长的那个
 */
public class Solution65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int len = 0;
            String res = "";
            if(s1.length()<s2.length()){
                for(int i=0;i<s1.length();i++){
                    for(int j=1;j<=s1.length()-i;j++){
                        String s = s1.substring(i,i+j);
                        //System.out.println(s);
                        if(s2.contains(s) && s.length()>len){
                            len=s.length();
                             res = s;
                        }
                    }
                }
            }else{
                for(int i=0;i<s2.length();i++){
                    for(int j=1;j<=s2.length()-i;j++){
                        String s = s2.substring(i,i+j);
                        if(s1.contains(s) && s.length()>len){
                            len=s.length();
                            res = s;
                        }
                    }
                }
            }
            System.out.println(res);

        }
    }
}
