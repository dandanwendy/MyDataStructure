package my2021Test.huawei415;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            //获取输入
            String names = input.next();
            String[] name = names.split(",");
            //将票数放到map中
            Map<String, Integer> map = new TreeMap<String, Integer>();
            for (int i = 0; i < name.length; i++) {
                boolean flag = false;
                for (String s : map.keySet()) {
                    if (s.equals(name[i])) {
                        flag = true;
                    }
                }
                //如果map中有该名字，票数加1，没有的话，添加一票
                if (flag) {
                    map.put(name[i],map.get(name[i])+1);
                } else {
                    map.put(name[i],1);
                }
            }
           //票数排序

            //字母排序
            System.out.println( map.keySet());
            map.keySet();
        }
    }
}
