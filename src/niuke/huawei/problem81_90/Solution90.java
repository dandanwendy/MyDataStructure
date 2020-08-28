package niuke.huawei.problem81_90;

import java.util.Scanner;
//本题注意以转义字符  \\.  分隔字符串
public class Solution90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            isValid(s);
        }
    }

    public static void isValid(String s){
        String[] ip = s.split("\\.");
        boolean flag = true;
        for(int i=0;i<ip.length;i++){
            if(Integer.parseInt(ip[i])<0 || Integer.parseInt(ip[i])>255 ){

                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
