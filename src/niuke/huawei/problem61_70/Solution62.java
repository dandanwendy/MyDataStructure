package niuke.huawei.problem61_70;

import java.util.Scanner;

public class Solution62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            numOne(n);
        }

    }
    public static void numOne(int n){
        int num = 0;
        String s = Integer.toString(n,2);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                num += 1;
            }
        }
        System.out.println(num);
    }
}
