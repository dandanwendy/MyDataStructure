package niuke.huawei.problem61_70;

import java.util.Scanner;
import java.util.Stack;

public class Solution70 {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int[][] matrix =
        }

    }
    public static int calculationTimes(int[][] matrix,String s){
        int times = 0;
        if(s.charAt(1)=='A'){
            times = matrix[1][1]*matrix[1][0]*matrix[2][1]+matrix[0][1]*matrix[0][0]*matrix[2][1];
        }else{
            times = matrix[0][1]*matrix[0][0]*matrix[1][1]+matrix[0][0]*matrix[1][1]*matrix[2][1];
        }
        return times;
    }*/

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            in.nextLine();
            String[] matrix=new String[n];
            for(int i=0;i<n;i++){
                matrix[i]=in.nextLine();
            }
            String rule=in.nextLine();
            Solution70.multiCount(n,matrix,rule);
        }
    }
    public static void multiCount(int n,String[] matrix,String rule){
        Stack<Character> sign=new Stack<Character>();
        Stack<String> letter=new Stack<String>();
        char[] ch=rule.toCharArray();
        int index=0;
        int result=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                sign.push(ch[i]);
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                letter.push(matrix[index++]);
            }else if(ch[i]==')'){
                if(!sign.isEmpty())
                    sign.pop();
                if(!letter.isEmpty()){
                    String[] up=letter.pop().split(" ");
                    if(letter.isEmpty())
                        break;
                    String[] down=letter.pop().split(" ");
                    result+=(Integer.parseInt(down[0]))*(Integer.parseInt(down[1]))*(Integer.parseInt(up[1]));
                    letter.push(down[0]+" "+up[1]);
                }
            }
        }
        System.out.println(result);
    }
}

