package niuke.huawei.problem71_80;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            splitString(s);
        }
    }
    public static void splitString(String string){
        List<Integer> list = new ArrayList<>();
        boolean flag =true;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='\"' && flag==true){
                flag =false;
            }else if(string.charAt(i)=='\"' && flag==false){
                flag =true;
            }
            if(string.charAt(i)==' ' && flag==true){
                list.add(i);
            }
        }
        System.out.println(list.size()+1);
        System.out.println(string.substring(0,list.get(0)));

        for(int i=0;i<list.size()-1;i++){
           // System.out.println(list.get(i));
            System.out.println(string.substring(list.get(i)+1,list.get(i+1)));
        }
        System.out.println(string.substring(list.get(list.size()-1)+1));
    }
}
