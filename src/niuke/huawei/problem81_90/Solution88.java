package niuke.huawei.problem81_90;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            maxPoker(s);
        }

    }

    //注意 10 是一个字符串，所以最后分成字符串数组才能得到10
    public static void maxPoker(String string){
        String[] poker = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<poker.length;i++){
            map.put(poker[i],i);
        }
        String[] s = string.split("\\-");
        String[] left = s[0].split("\\s");
        String[] right = s[1].split("\\s");
        if(s[0].equals("joker JOKER") || s[1].equals("joker JOKER")){
            System.out.println("joker JOKER");
        }else if(left.length==4 || right.length==4){
            if(left.length==4 && right.length!=4){
                System.out.println(s[0]);
            }else if(left.length!=4 && right.length==7){
                System.out.println(s[1]);
              }else{
                if(map.get(left[0]) > map.get(right[0]) ){
                    System.out.println(s[0]);
                }else{
                    System.out.println(s[1]);
                }
            }
        }else if(left.length!=right.length){
            System.out.println("ERROR");
        }else{
            if(map.get(left[0]) > map.get(right[0]) ){
                System.out.println(s[0]);
            }else{
                System.out.println(s[1]);
            }
        }

    }
}
