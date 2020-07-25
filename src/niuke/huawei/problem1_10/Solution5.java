package niuke.huawei.problem1_10;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String hexString = input.nextLine();
            BigInteger bint = new BigInteger(hexString.substring(2), 16);
            String s = bint + "";
            System.out.println(s);
        }
    }
}
