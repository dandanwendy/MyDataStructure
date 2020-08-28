package niuke.huawei.problem61_70;

import java.util.Scanner;

public class Solution61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(f(a,b));
        }
    }

    public static int f(int apple, int dish){
        if(apple<0){
            return 0;
        }else if(dish==1 || apple==1){
            return 1;
        }
        return f(apple,dish-1)+f(apple-dish,dish);
    }
}
