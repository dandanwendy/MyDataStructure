package niuke.huawei.problem51_60;

import java.util.Scanner;

public class Solution67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] numbers = new int[4];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }

            int[] used = new int[4];
            for (int i = 0; i < used.length; i++) {
                used[i] = 0;
            }
            double value = 0.0;

            boolean  a = isTwentyFour(numbers, used, value, numbers.length);
            System.out.println(a);
        }
    }

    public static boolean isTwentyFour ( int[] numbers, int[] used, double value, int len){
        if (len == 4) {
            if (value == 24.0) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            return isTwentyFour(numbers, used, value + numbers[i], len + 1) || isTwentyFour(numbers, used, value - numbers[i], len + 1) ||
                    isTwentyFour(numbers, used, value * numbers[i], len + 1) || isTwentyFour(numbers, used, value / numbers[i], len + 1);
        }
        return false;
    }
}

/*
public class Main {
    static boolean success = false;
    static int[] flag = new int[4];
    static int[] a = new int[4];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            success = false;
            for (int i = 0; i < 4; i++) {
                a[i] = cin.nextInt();
            }
            dfs(0);
            System.out.println(success);
            for (int i = 0; i < 4; i++) {
                flag[i] = 0;
            }

        }
    }

    public static void dfs(int current) {
        if (current == 24) {
            success = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (flag[i] == 0) {
                flag[i] = 1;
                dfs(current + a[i]);
                dfs(current - a[i]);
                dfs(current * a[i]);
                if (current % a[i]==0) {
                    dfs(current / a[i]);
                }
                flag[i] = 0;
            }
        }
        return;
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double result=0.0;
        int[] num=new int[4];
        while(input.hasNext()){
            int[] temp=new int[4];
            for(int i=0;i<4;i++){
                num[i]=input.nextInt();
            }
            System.out.println(check(num,temp,result));
        }
        input.close();
    }

    private static boolean check(int[] num,int[] temp,double result) {
        for(int i=0;i<num.length;i++){
            if(temp[i]==0){
                temp[i]=1;
                if(check(num,temp,result+num[i])
                        || check(num,temp,result-num[i])
                        || check(num,temp,result*num[i])
                        || check(num,temp,result/num[i])){
                    return true;
                }
                temp[i]=0;
            }
        }
        if(result==24){
            return true;
        }else{
            return false;
        }
    }
}
 */