package niuke.huawei.problem1_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution10 {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(getResult(input));
    }

    public static int getResult(String input){
        Set set = new HashSet<>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(0<c &&c<127){
                set.add(c);
            }
        }
        return set.size();
    }
}
