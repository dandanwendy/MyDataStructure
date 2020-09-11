package my2021Test.huawei0909;

import java.util.Scanner;
import java.util.Stack;
//马文迪

/**
 * 给定一个后缀表达式，求解
 * 1 遇到数字放入栈
 * 2 遇到第一个运算符，弹出栈中两个数，根据运算符的形式，对这两个数字运算
 * 3 再遇到运算符，弹出一个数，与之前保留的结果运算
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = {"2","1","+","3","*"};
        System.out.println(calculation(c));
    }
    public static int calculation(String[] c){
        int sum = 0;
        int k=0;
        Stack<String> stack = new Stack<>();
        for(int i=0;i<c.length;i++){
            if(!c[i].equals("*") && !c[i].equals("/") && !c[i].equals("+") && !c[i].equals("-")){
                stack.push(c[i]);
            }else{
                int b = 0;
                if(k==0){
                     sum = Integer.parseInt(stack.pop());
                     b = Integer.parseInt(stack.pop());
                     k++;
                }else{
                     b = Integer.parseInt(stack.pop());
                }
                if(c[i].equals("+")){
                    sum += b;
                }else if(c[i].equals("-")){
                    sum -= b;
                }else if(c[i].equals("*")){
                    sum *= b;
                }else if(c[i].equals("/")){
                    sum /= b;
                }
            }
        }
        return sum;
    }
}
