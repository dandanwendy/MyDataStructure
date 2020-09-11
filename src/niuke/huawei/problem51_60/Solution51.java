package niuke.huawei.problem51_60;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            List<Integer> list = new LinkedList<>();
            int num = sc.nextInt();
            for(int i=0;i<num;i++){
                list.add(sc.nextInt());
            }
            int pos = sc.nextInt();
            if(pos==0){
                System.out.println(0);
            }else{
                System.out.println(list.get(num-pos));
            }

        }
    }

}

class ListNode {
    int  m_nKey;
    ListNode next;

}
