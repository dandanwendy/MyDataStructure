package niuke.huawei.problem1_10;

import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doubleNum = scanner.nextDouble();
        int intNum =(int) doubleNum;
        if(doubleNum - intNum >=0.5){
            intNum ++;
        }
        System.out.println(intNum);
    }
}
