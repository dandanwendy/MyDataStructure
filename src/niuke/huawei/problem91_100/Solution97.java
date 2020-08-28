package niuke.huawei.problem91_100;

import java.util.Scanner;

//该题记得把负数个数，整数个数放在循环内，否则测试第二组算例时会有非0初始值。
public class Solution97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num_minus = 0;
            int num_positive = 0;
            int sum_positive = 0;

            int num = sc.nextInt();
            for(int n=0;n<num;n++){
                int a = sc.nextInt();
                if(a>0){
                    num_positive +=1;
                    sum_positive += a;

                }else if(a<0){
                    num_minus += 1;
                }
            }
            System.out.println(sum_positive);
            System.out.println(num_minus+" "+String.format("%.1f",(double)sum_positive/num_positive));
            //System.out.println(num_minus);
            //System.out.println(String.format("%.1f",(double)sum_positive/num_positive));
        }
    }
}
