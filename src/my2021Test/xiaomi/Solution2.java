package my2021Test.xiaomi;

import java.util.Scanner;

/**
 * 这题小米题目出的有问题，最后给了一个定网格
 * 1 从一个网格中查询有没有相邻的字符可以组成输入的字符串
 * 我的代码通过33%
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[][] net  = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
            int[][] used = new int[3][4];
            boolean flag = false;
            for(int i=0;i<net.length;i++){
                for(int j=0;j<net[0].length;j++){
                    if(isExist(net,s,used,0,s.charAt(1),i,j)){
                        flag = true;
                    }
                }
            }
            System.out.println(flag);
            //System.out.println(isExist(net,s,used,0,s.charAt(1),0,0));
        }

    }
    public static boolean isExist(char[][] net,String s,int[][] used,int cahrIndex,char a,int x,int y){
        if(cahrIndex+1==s.length() && net[x][y]==a){
            return true;
        }
        if(x<0 || y<0 || x>net.length || y>net[0].length || net[x][y]!=a){
            return false;
        }
        used[x][y]=1;
        /*if(s.charAt(cahrIndex)==net[x][y] && used[x][y]==0){
            used[x][y]=1;
            isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x-1,y);
            isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x+1,y);
            isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x,y-1);
            isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x,y+1);
            used[x][y]=0;
        }else{
            return false;
        }*/
        if(isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x-1,y) || isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x+1,y)
        || isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x,y-1) || isExist(net,s,used,cahrIndex,s.charAt(cahrIndex+1),x,y+1)){
            return true;
        }else{
            used[x][y]=0;
            return false;
        }
    }
}
