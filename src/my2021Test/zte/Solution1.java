package my2021Test.zte;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] digits = new int[num];
            for(int i=0;i<num;i++){
                digits[i] = sc.nextInt();
            }
            System.out.println(digits.length-1);
        }
    }
}
