package my2021Test.huawei415;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        while(input.hasNext()){
            address(s);
        }
    }

    public static void address(String s){
        int index = s.indexOf(" ");
        //获取关键字
        String keyName = s.substring(0,index);

        //获取待匹配的字符串
        String s_address = s.substring(index+1);

       // 得到每一个条目
        String[] s1 = s_address.split("],");

        for(int i=0;i<s1.length;i++){
            int index1 = s1[i].indexOf("[");
            if(s1[i].substring(0,index1).equals(keyName)){

            }
        }

    }
}
