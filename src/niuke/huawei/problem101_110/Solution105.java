package niuke.huawei.problem101_110;

import java.util.Scanner;

public class Solution105 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        int value = 0;
        int num_positive = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            value = sc.nextInt();
            if(value<0){
                num += 1;
            }else{
                sum += value;
                num_positive += 1;
            }
        }
        System.out.println(num);
        if(num_positive>1){
            System.out.println(String.format("%.1f",(double)sum/num_positive));
        }else{
            System.out.println(0.0);
        }
    }
}
