package niuke.huawei.problem91_100;

import java.util.Scanner;

public class Solution99 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }

    //我们的程序没能计算到自守数0，所以要在最后返回时加上0，
    public static int CalcAutomorphicNumbers( int n) {
        int num = 0;
        for(int i=0;i<n;i++){
            int a = i*i;
            int b = 1;
            while(a/b>0){
                b*=10;
                if((a%b) == i){
                    num += 1;
                    System.out.println(i);
                    break;
                }
            }
        }
        return num+1;
    }
}
