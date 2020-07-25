package leetcode.shuaTi.wendyHot100.DynamicProgramming;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    //我想用回溯，写不出来，不知道这个方法可行吗
    /*public int uniquePaths(int m, int n) {
         int[][] used = new int[m][n];
    }

    public int path(int m,int n,int[][] used,int posx,int posy){
        if(posx<m-1 && used[posx][posy]==0){
            posx +=1;
            used[posx][posy] = 1;
        }

        if(posy<m-1 && used[posx][posy]==0){
            posy +=1;
            used[posx][posy] = 1;
        }
    }*/
}
