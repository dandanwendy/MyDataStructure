package niuke.huawei.problem1_10;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String s1 =num+"";
         LinkedHashSet set = new LinkedHashSet();
        for(int i=s1.length()-1;i>=0;i--){
            set.add(s1.charAt(i));
        }

        //System.out.println(set);

        String s2 = "";
        for (Object c: set) {
            s2=s2+c;
        }
        System.out.println(s2);
       /* for(int i=0;i<set.size();i++){
            set
        }*/
    }
}
