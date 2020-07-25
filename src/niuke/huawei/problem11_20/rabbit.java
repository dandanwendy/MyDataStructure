package niuke.huawei.problem11_20;

import java.util.Scanner;

public class rabbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int month = input.nextInt();

            int a = 1;//1
            int b = 0;//2
            int c = 0;//3个月大的兔子

            // month=month-1;
            while (--month > 0) {
                c = b + c;
                b = a;
                a = c;
                // month--;
            }
            System.out.println(a + b + c);
        }
    }
}
