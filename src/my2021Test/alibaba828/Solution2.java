package my2021Test.alibaba828;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
        }

    }

    public static ArrayList<String> dfs(int len, int[] digit, int[] used,String s,ArrayList<String> list){
    if(s.length()==len && !list.contains(s)){
        list.add(s);
    }
    for(int i=0;i<digit.length;i++){
        if(used[i]!=1){
            s +=digit[i];
        }
    }
    return null;
}
}
