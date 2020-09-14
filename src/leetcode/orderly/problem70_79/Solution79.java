package leetcode.orderly.problem70_79;

public class Solution79 {
    public static void main(String[] args) {
        char[][] board  = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCESEEDASFC";
        boolean flag = exist(board,word);
        System.out.println(flag);
    }
    public static boolean exist(char[][] board, String word) {
        int[][] used = new int[3][4];
        boolean flag = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,used,0,word.charAt(0),i,j)){
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean dfs(char[][] net,String s,int[][] used,int charIndex,char a,int x,int y){
        if(x<0 || y<0 || x>=net.length || y>=net[0].length || net[x][y]!=a || used[x][y]==1){
            return false;
        }
        if(charIndex+1==s.length()){
            return true;
        }
        used[x][y]=1;
        if(dfs(net,s,used,charIndex+1,s.charAt(charIndex+1),x-1,y) || dfs(net,s,used,charIndex+1,s.charAt(charIndex+1),x+1,y)
                   || dfs(net,s,used,charIndex+1,s.charAt(charIndex+1),x,y-1) || dfs(net,s,used,charIndex+1,s.charAt(charIndex+1),x,y+1)){
               return true;
        }else{
            used[x][y]=0;
            return false;
        }
    }
}
