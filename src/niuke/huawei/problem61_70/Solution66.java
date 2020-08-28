package niuke.huawei.problem61_70;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            match(s);
        }
    }
    public static void match(String string){
        Map<String,String> map = new HashMap<>();
        map.put("reset","reset what");
        map.put("reset board","board fault");
        map.put("board add","where to add");
        map.put("board delete","no board at all");
        map.put("reboot backplane","impossible");
        map.put("backplane abort","install first");
        Set<String> set = map.keySet();
        String[] s = string.split(" ");

            for(String items : set){
                boolean flag = false;
                String[] s2 = items.split(" ");
                if(s2.length==s.length){
                    for(int i=0;i<s.length;i++){
                        if(s2[i].startsWith(s[i])){
                            flag = true;
                        }else{
                            flag = false;
                            break;
                        }
                      }
                    if(flag ==true){
                        System.out.println(map.get(items));
                        return ;
                    }
            }
        }
        System.out.println("unknown command");

    }
}
