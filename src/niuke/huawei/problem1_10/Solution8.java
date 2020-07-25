package niuke.huawei.problem1_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("the number of key-value");
        int num = input.nextInt();

        //ArrayList<String> list = new ArrayList<String>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<num;i++){
          /*  String s = input.nextLine();
            int index = s.indexOf(" ");
            String key = s.substring(0,index-1);
            int value = Integer.parseInt(s.substring(index));*/
          int key = input.nextInt();
          int value = input.nextInt();

            if (map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }else {
                map.put(key,value);
            }
        }


        for (Map.Entry<Integer, Integer> entryset : map.entrySet()) {
            System.out.println(entryset.getKey()+" "+entryset.getValue());
        }
    }
}
