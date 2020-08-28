package niuke.huawei.problem91_100;

import java.util.Scanner;

public class Solution100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int a =(3*num+1)*num/2;
            System.out.println(a);
        }
    }
}
