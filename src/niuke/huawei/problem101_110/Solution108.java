package niuke.huawei.problem101_110;

import java.util.Scanner;
/*
找两个数的最小公倍数，直接以其中一个数为初始值，
判断当前值是否为另一个数的倍数，若是，则找到最小公倍数，停止循环
     若不是，每次增量为初始数数的大小，循环判断
 */
public class Solution108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(minPublicTimes(a,b));
    }
    public static int minPublicTimes(int a,int b){
        int min = a;
        for(int i=a;i<=a*b;i+=a){
            if(i%b==0){
                min=i;
                break;
            }
        }
        return min;
    }
}
