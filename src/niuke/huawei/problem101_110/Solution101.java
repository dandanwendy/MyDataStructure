package niuke.huawei.problem101_110;

import java.util.Scanner;

public class Solution101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] digit = new int[num];
            for(int i=0;i<num;i++){
                digit[i] = sc.nextInt();
            }
            int accend = sc.nextInt();
            sortArray(digit,accend);

            for(int i=0;i<digit.length;i++){
                System.out.print(digit[i]+" ");
            }
        }
    }

    public static void sortArray(int[] digit,int accend){
        if(accend==0){
            for(int i=0;i<digit.length;i++){
                for(int j=1;j<digit.length-i;j++){
                    if(digit[j-1]>digit[j]){
                        int temp = digit[j-1];
                        digit[j-1] = digit[j];
                        digit[j] = temp;
                    }
                }
            }
        }else{
            for(int i=0;i<digit.length;i++){
                for(int j=1;j<digit.length-i;j++){
                    if(digit[j-1]<digit[j]){
                        int temp = digit[j-1];
                        digit[j-1] = digit[j];
                        digit[j] = temp;
                    }
                }
            }
        }
    }
}
