package niuke.huawei.problem71_80;

import java.util.Scanner;

public class Solution72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            for(int a=0;a<15;a++){
                for(int b =0;b<=25;b++){
                    if((14*a+8*b)==200){
                        System.out.println(a+" "+b+" "+(100-a-b));
                    }
                }
            }
        }
    }
}
