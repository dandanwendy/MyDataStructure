package niuke.huawei.problem51_60;

import java.util.Scanner;

public class Solution59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(firstChar(s));
        }
    }

    public static String firstChar(String s){
        char c;
        if(s.length()==1){
            System.out.println(s.charAt(0));
        }else{
            if(!s.substring(1).contains(s.charAt(0)+"")){
                return s.charAt(0)+"";
            }
        }

        for(int i=1;i<s.length()-1;i++){
            c=s.charAt(i);
            if(!s.substring(i+1).contains(c+"") && !s.substring(0,i).contains(c+"")){
                return c+"";
            }
        }
        if(!s.substring(0,s.length()-1).contains(s.charAt(s.length()-1)+"")){
            return s.charAt(s.length()-1)+"";
        }

        return "-1";
    }
}
