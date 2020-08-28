package niuke.huawei.problem91_100;

import java.util.Scanner;

public class Solution96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.charAt(0)>='0' && s.charAt(0)<='9'){
                s = "*" + s;
            }
            if(s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9'){
                s = s + "*";
            }
            int len = s.length();
            for(int i=1;i<len-1;i++){
                if((s.charAt(i)>='0' && s.charAt(i)<='9') && (!Character.isDigit(s.charAt(i-1))) && s.charAt(i-1)!='*'){
                    s = s.substring(0,i)+"*"+s.substring(i);
                }
                if((s.charAt(i)>='0' && s.charAt(i)<='9') && (!Character.isDigit(s.charAt(i+1))) && s.charAt(i+1)!='*'){
                    s = s.substring(0,i+1)+"*"+s.substring(i+1);
                }
                len = s.length();
            }
            System.out.println(s);
        }
    }
}
