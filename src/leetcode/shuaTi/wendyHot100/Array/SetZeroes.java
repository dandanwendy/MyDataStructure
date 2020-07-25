package leetcode.shuaTi.wendyHot100.Array;

import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet();
        Set<Integer> column = new HashSet();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }

        //把行变为0
        for(Integer num:row){
            for(int i=0;i<matrix[0].length;i++){
                matrix[num][i]=0;
            }
        }
        //把列变为0
        for(Integer num:column){
            for(int i=0;i<matrix.length;i++){
                matrix[i][num]=0;
            }
        }
    }
}
