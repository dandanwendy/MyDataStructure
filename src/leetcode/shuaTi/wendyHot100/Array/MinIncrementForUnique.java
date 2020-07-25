package leetcode.shuaTi.wendyHot100.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinIncrementForUnique {
    public static void main(String[] args) {
        int[] A = {1,2,2};
        System.out.println(minIncrementForUnique(A));
    }
    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        if(A.length==0) return 0;

        int times = 0;
        int tail = A[0]-1;

        for(int i=0;i<A.length;i++){
            if(A[i]>tail){
                tail = A[i];
            }else{
                    times=times+(tail-A[i]+1);
                    tail = tail+1;
                }
            }
        return times;
    }

    /*public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int times = 0;
        Set<Integer> B = new HashSet<>();
        int a = 0;
        int tail = 0;


        for(int i=0;i<A.length;i++){
            a= A[i];
            if(a>tail){
                B.add(a);
                tail = a;
            }else{
                while(B.contains(a)){
                    a++;
                    times++;
                    tail = a;
                }
                B.add(a);
            }
        }
      return times;
    }*/
}
