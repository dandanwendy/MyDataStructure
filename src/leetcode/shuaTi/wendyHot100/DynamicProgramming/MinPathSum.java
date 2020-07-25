package leetcode.shuaTi.wendyHot100.DynamicProgramming;

public class MinPathSum {
    public static void main(String[] args) {
        //int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] grid = {{1,2},{3,1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int[][] pathSum = new int[grid.length][grid[0].length];
        pathSum[0][0] = grid[0][0];

            for(int i=1;i<grid[0].length;i++){
                pathSum[0][i] = pathSum[0][i-1]+grid[0][i];
            }


            for(int i=1;i<grid.length;i++){
                pathSum[i][0] = pathSum[i-1][0]+grid[i][0];
            }

        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                pathSum[i][j] = Math.min(pathSum[i-1][j]+grid[i][j],pathSum[i][j-1]+grid[i][j]);
            }
        }
        return pathSum[grid.length-1][grid[0].length-1];
    }



    //递归做法应该是对的，就是会超时
   /* public static int minPathSum(int[][] grid) {
        int start = 0;
        int endx = grid.length;
        int endy = grid[0].length;
        int sum = 0;

        if(endx>1 && endy>1){
            int[][] x = new int[endx-1][endy];
            int[][] y = new int[endx][endy-1];
            for(int i=0;i<endx-1;i++){
                for(int j =0;j<endy;j++){
                    x[i][j] = grid[i][j];
                }
            }
            for(int i=0;i<endx;i++){
                for(int j =0;j<endy-1;j++){
                    y[i][j] = grid[i][j];
                }
            }
            return Math.min(minPathSum(x)+grid[endx-1][endy-1],minPathSum(y)+grid[endx-1][endy-1]);

        }else if(endx==1){
            for(int i=0;i<endy;i++){
                sum +=grid[endx-1][i];
            }
            return sum;
        }else if(endy==1){
            for(int i=0;i<endx;i++){
                sum +=grid[i][endy-1];
            }
            return sum;
        }
       return sum;

    }*/

}
