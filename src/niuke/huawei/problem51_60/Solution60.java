package niuke.huawei.problem51_60;

import java.util.Scanner;

public class Solution60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            for(int i=num/2;i>2;i--){
                if(isSushu(i) && isSushu(num-i)){
                    System.out.println(i);
                    System.out.println(num-i);
                    break;
                }
            }
        }
    }

    public static boolean isSushu(int a){
        if(a == 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if((a%i)==0){
                return false;
            }
        }
        return true;
    }
}
