package leetcode.shuaTi.wendyHot100.string;

import java.util.Scanner;

public class addBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1=input.nextLine();
        String s2 = input.nextLine();

        int a = Integer.parseInt(s1,2)+Integer.parseInt(s2,2);

      /*  if(a==0){
            return "0";
        }*/

        int r =0;
        int n = 0;
        StringBuffer res = new StringBuffer();
        while(a!=0){
            r=a%2;
            a=a/2;
            res = res.append(r);
            if(n==1){
                res=res.append(n);
                break;
            }
        }
        res.reverse().toString();
        //String aaa = res;
        System.out.println(res);

    }
}
