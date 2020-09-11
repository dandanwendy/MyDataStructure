package my2021Test.huawei2021;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int person = sc.nextInt();
            int[] candy = new int[person];
            int[] color = new int[person];
            for(int i=0;i<person;i++){
                candy[i] = sc.nextInt();
                color[i] = sc.nextInt();
            }
        }
    }
}
