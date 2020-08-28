package niuke.huawei.huawei2016;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int students = sc.nextInt();
            int orders = sc.nextInt();
            int[] marks = new int[students];
            for(int i=0;i<students;i++){
                marks[i] = sc.nextInt();
            }

            String[] order = new String[orders];
            int[] a = new int[orders];
            int[] b = new int[orders];
            for(int i=0;i<orders;i++){
                order[i] = sc.next();
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            for(int i=0;i<orders;i++){
                if(order[i].equals("Q")){
                    select(marks,a[i],b[i]);
                }else{
                    update(marks,a[i],b[i]);
                }
            }
        }

    }
    public static void select(int[] marks,int start,int end){
        if(start>end){
            int temp  =start;
            start = end;
            end =temp;
        }
        int[] a = new int[end-start+1];
        for(int i=0;i<a.length;i++){
            a[i] = marks[start+i-1];
        }
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }

    public static void update(int[] marks,int student,int mark){
        marks[student-1] = mark;
    }
}
