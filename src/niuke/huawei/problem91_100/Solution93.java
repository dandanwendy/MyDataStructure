package niuke.huawei.problem91_100;

import java.util.Scanner;

public class Solution93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum1 = 0, sum2 = 0;
            int[] a = new int[n];
            int count = 0;
            for(int i =0;i<n;i++){
                int tmp = sc.nextInt();
                if(tmp%5==0){
                    sum1+=tmp;
                }
                else if(tmp%3==0)
                    sum2 += tmp;
                else{
                    a[count++] = tmp;
                }
            }
            int sum = Math.abs(sum1-sum2);//这里只考虑绝对值就可以了
            System.out.println(f(0,count,a,0,sum));
        }
    }

    public static boolean f(int i ,int n,int[] a,int result,int sum){
        if(i==n){
            return Math.abs(result) == sum;//绝对值相等就可以
        }
        else{
            return (f(i+1,n,a,result+a[i],sum)||f(i+1,n,a,result-a[i],sum));
        }
    }
}
