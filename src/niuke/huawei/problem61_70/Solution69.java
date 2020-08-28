package niuke.huawei.problem61_70;

import java.util.Scanner;

public class Solution69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int[][] A = new int[x][y];
            int[][] B = new int[y][z];
            int[][] C = new int[x][z];

            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    A[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<y;i++){
                for(int j=0;j<z;j++){
                    B[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<x;i++){
                for(int j=0;j<z;j++){
                    for(int k=0;k<y;k++){
                        C[i][j] += A[i][k]*B[k][j];
                    }
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
