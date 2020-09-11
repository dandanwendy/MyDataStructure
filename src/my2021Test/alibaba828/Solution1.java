package my2021Test.alibaba828;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int left = 0;
            int right = 0;
            int a1 = 0;
            int b1 = 0;
            int sum = 0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==b.charAt(i)){
                    left +=1;
                }
                if(a.charAt(i)=='1'){
                    a1 +=1;
                }
                if(a.charAt(i)==b.charAt(len-i-1)){
                    right +=1;
                }
                if(b.charAt(i)=='1'){
                    b1 +=1;
                }
            }

            if((len-left)>(len-right)){
                sum +=1;
            }

            if(a1>b1){
                sum = sum+a1-b1;
                if(left>right){
                    sum += (len-left-(a1-b1))/2;
                }else{
                    sum += (len-right-(a1-b1))/2;
                }
            }else{
                sum = sum +b1-a1;
                if(left>right){
                    sum += (len-left-(b1-a1))/2;
                }else{
                    sum += (len-right-(b1-a1))/2;
                }
            }
            System.out.println(sum);
        }
    }
}
