package leetcode.shuaTi.wendyHot100.Hash;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
        System.out.println(grid.length);
    }
    public static int islandPerimeter(int[][] grid) {
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                sum +=perimeter(i,j,grid);
                System.out.println(sum);
            }
        }

        return sum;

    }

    public static int perimeter(int row, int column, int[][] grid){
        if(grid[row][column]==0) return 0;
        int p = 4;
        if(row>0 && grid[row-1][column]==1){
            p-=1;
        }
        if(row<grid.length-1 && grid[row+1][column]==1){
            p-=1;
        }
        if(column>0 && grid[row][column-1]==1){
            p-=1;
        }
        if(column<grid[0].length-1 && grid[row][column+1]==1){
            p-=1;
        }
        return p;
    }

    /*public int islandPerimeter(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    // 题目限制只有一个岛屿，计算一个即可
                    //从任何一个非0点都能深度遍历得到岛屿边长。
                    return dfs(grid, r, c);
                }
            }
        }
        return 0;
    }

    int dfs(int[][] grid, int r, int c) {
        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
            return 1;
        }
        if (grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;
        return dfs(grid, r - 1, c)
                + dfs(grid, r + 1, c)
                + dfs(grid, r, c - 1)
                + dfs(grid, r, c + 1);
    }*/
}
