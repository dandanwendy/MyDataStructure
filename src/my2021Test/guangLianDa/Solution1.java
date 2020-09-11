package my2021Test.guangLianDa;

import java.util.Arrays;
import java.util.Scanner;

/**输入n棵小草，m瓶魔法药。每瓶魔法药可使小草生长item长度，n棵小草的长度
 * 每次把一瓶魔法药用到高度最低的小草，求最后最低的小草高度
 *该题我通过73%，因为超出运行时间限制，
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGrass = sc.nextInt();
        int numMagic = sc.nextInt();
        int item = sc.nextInt();
        int[] a = new int[numGrass];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        while(numMagic>0){
            int minIndex = 0;
            int min = a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]<min){
                    min = a[i];
                    minIndex = i;
                }
            }
            a[minIndex] +=item;
            numMagic--;
        }
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
