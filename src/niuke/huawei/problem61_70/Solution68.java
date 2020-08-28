package niuke.huawei.problem61_70;

import java.util.Scanner;

public class Solution68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int accsend = sc.nextInt();
            String[] names = new String[num];
            int[] marks = new int[num];

            for(int i=0;i<num;i++){
                names[i] = sc.next();
                marks[i] = sc.nextInt();
            }
            sortMark(marks,names,accsend,num);
            for(int i=0;i<num;i++){
                System.out.println(names[i]+" "+marks[i]);
            }
        }
    }

    public static void sortMark(int[] marks,String[] names, int accsend,int len){
        for(int i=0;i<len;i++){
            for(int j=1;j<len-i;j++){
                if(accsend==0){
                    if(marks[j-1]<marks[j]){
                        int temp1 = marks[j];
                        marks[j] = marks[j-1];
                        marks[j-1] = temp1;

                        String temp2 = names[j];
                        names[j] = names[j-1];
                        names[j-1] = temp2;
                    }
                }else{
                    if(marks[j-1]>marks[j]){
                        int temp1 = marks[j];
                        marks[j] = marks[j-1];
                        marks[j-1] = temp1;

                        String temp2 = names[j];
                        names[j] = names[j-1];
                        names[j-1] = temp2;
                    }
                }
            }
        }

    }
}
