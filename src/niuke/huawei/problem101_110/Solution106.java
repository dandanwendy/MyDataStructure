package niuke.huawei.problem101_110;

import java.util.Scanner;

public class Solution106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            StringBuilder s1 = new StringBuilder(s);
            System.out.println(s1.reverse().toString());
        }

    }

}
