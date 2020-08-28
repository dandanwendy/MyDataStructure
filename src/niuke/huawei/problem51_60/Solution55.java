package niuke.huawei.problem51_60;

import java.util.Scanner;
/*
能整除或含7的都是解，注意两者有重复的
 */
public class Solution55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int n = 0;
            for(int i =1;i<=a;i++){
                if(i%7==0){
                   n += 1;
                }else if((i+"").contains("7")){
                  n+=1;
                }
            }
            System.out.println(n);
        }
    }
}
