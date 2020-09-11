package niuke.huawei.problem41_50;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int head = sc.nextInt();
            Integer[][] insert = new Integer[num-1][2];
            for(int i=0;i<num-1;i++){
                insert[i][0] = sc.nextInt();
                insert[i][1] = sc.nextInt();
            }
            int deleteNode = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            list.add(head);
            for(int i=0;i<num-1;i++){
                if(list.contains(insert[i][0])){
                    list.remove((Object)insert[i][0]);
                }
                //list.add(list.indexOf(insert[i][1])+1,insert[i][0]);
                //System.out.println(insert[i][0]+" "+insert[i][1]);
                for(int j=0;j<list.size();j++){
                    if(insert[i][1].equals(list.get(j))){
                        list.add(j+1,insert[i][0]);
                        break;
                    }
                }
            }

            list.remove((Object)deleteNode);
            //list.r
            for(Integer item:list){
                System.out.print(item+" ");
            }
        }
        sc.close();
    }

}
