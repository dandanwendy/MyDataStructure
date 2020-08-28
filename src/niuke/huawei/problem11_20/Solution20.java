package niuke.huawei.problem11_20;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            isValid(s);
        }
    }

    public static void isValid(String s){
        //长度不小于9
        if(s.length()<9){
            System.out.println("NG");
            return ;
        }


        //至少三种字符
        int upper = 0;
        int lower =0;
        int digit =0;
        int other = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                digit += 1;
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                lower += 1;
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upper += 1;
            }else{
                other += 1;
            }
        }
        int type = 0;
        if(upper==0){
            type += 1;
        }
        if(lower==0){
            type += 1;
        }
        if(digit==0){
            type += 1;
        }
        if(other==0){
            type += 1;
        }
        if(type>1){
            System.out.println("NG");
            return ;
        }

        // 3.不能有相同长度超2的子串重复

            for(int i=0 ;i<s.length()-2 ;i++){
                String substr1 =s.substring(i, i+3);
                if (s.substring(i+1).contains(substr1)){
                    System.out.println("NG");
                    return ;
                }
            }



        System.out.println("OK");
    }
}
