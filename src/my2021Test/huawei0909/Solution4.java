package my2021Test.huawei0909;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个数字串，每次删除第一个，再把剩下的第一个放到最后，如此重复，求所有数字删除的顺序
 * 1 我用队列解决的此问题，把数字按顺序加入队列，弹出一个数字，把它放到结果集list中
 * 2 弹出一个数字，再把它放到队列末尾，直到队列为空
 * 面试时我通过此题测试
 */
public class Solution4 {
    public static void main(String[] args) {
        String s = "631758924";
        System.out.println(fun(s));
    }
    public static String fun(String s){
        Queue<Character> queue = new LinkedList<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            queue.add(s.charAt(i));
        }
        int i=0;
        while(!queue.isEmpty()){
            char  c = queue.remove();
       if(i%2==0){
                list.add(c);
            }else{
                queue.add(c);
            }
            i++;
        }
        String s1= "";
        for(Character item:list){
            s1+=item;
        }
        return s1;
    }
}
