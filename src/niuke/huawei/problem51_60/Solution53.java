package niuke.huawei.problem51_60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
按照递推关系推出变异杨辉三角，再查找偶数位置
 */
public class Solution53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<List<Integer>> list = new ArrayList<>();
            list = triangle(n);
            List<Integer> listn = new ArrayList();
            listn = list.get(n-1);
            for(int i=0;i<listn.size();i++){
                if(listn.get(i)%2==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }

    public static List<List<Integer>> triangle(int n){
        List<List<Integer>> res = new ArrayList<>();
        List list1 = new ArrayList();
        list1.add(1);

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(1);
        list2.add(1);

        res.add(list1);
        res.add(list2);

        for(int i=2;i<n;i++){
            ArrayList list = new ArrayList();
            list.add(1);
            list.add(1+res.get(i-1).get(1));
            for(int j=2;j<2*i-1;j++){
                list.add(res.get(i-1).get(j-2)+res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            list.add(res.get(i-1).get(2*i-3)+res.get(i-1).get(2*i-2));
            list.add(res.get(i-1).get(2*i-2));
            res.add(list);
        }
        /*for(List items: res){
            System.out.println(items);
        }*/
        return res;
    }
}
