package practice;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个运算符");
        char c = input.next().charAt(0);
        int a=0;
        switch (c){
            case '+': a= 3+2;
                      break;
            case '-':
                a=3-2;
                break;
            default:System.exit(1);
        }
        System.out.println(a);
    }
}
