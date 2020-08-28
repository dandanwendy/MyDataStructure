package niuke.huawei.problem71_80;

import java.util.Scanner;

public class Solution73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            int[] months1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] months2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int num_day = 0;
            if ((year % 4 == 0 && year%100 !=0) || (year % 400 == 0 )) {
                for (int i = 0; i < month - 1; i++) {
                    num_day += months2[i];
                }
            } else {
                for (int i = 0; i < month - 1; i++) {
                    num_day += months1[i];
                }
            }
            num_day += day;
            System.out.println(num_day);
        }
    }
}
