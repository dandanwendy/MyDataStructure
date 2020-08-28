package niuke.huawei.problem71_80;

import java.util.Scanner;
public class Solution76 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int a = n*n - n +1;
            String res ="";
            for(int i=0;i<n-1;i++){
                res = res+(a+i*2)+"+";
            }
            res = res+(a+(n-1)*2);
            System.out.println(res);
        }
    }
}
