package niuke.huawei.problem61_70;

import java.util.Scanner;

/*
开始我以为是大于最小子序列长度，且CG率最高的子串，看测试案例原来是找等于最小子序列长度的
 */
public class Solution63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int length = sc.nextInt();
            String cg = s.substring(0,length);
            double rate = cgRate(s.substring(0,length));
            /*for(int i=0;i<s.length()-length;i++){
                for(int j=length;j<s.length()-i;j++){
                    if(cgRate(s.substring(i,i+j))>rate){
                        rate = cgRate(s.substring(i,i+j));
                        cg = s.substring(i,i+j);
                    }
                }
            }*/
            for(int i=0;i<s.length()-length;i++){
                    if(cgRate(s.substring(i,i+length))>rate){
                        rate = cgRate(s.substring(i,i+length));
                        cg = s.substring(i,i+length);
                }
            }
            System.out.println(cg);
        }
    }

    public static double cgRate(String s){
        int a = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='C' || s.charAt(i)=='G'){
                a += 1;
            }
        }
        return (double)a/s.length();
    }
}
