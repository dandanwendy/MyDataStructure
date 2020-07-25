package niuke.huawei.problem11_20;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numString= scanner.nextLine();
        char[] chars= numString.toCharArray();
        String str ="";
        for(int i =chars.length-1;i>=0;i--){
            str +=chars[i];
        }
        System.out.println(str);
    }
}
