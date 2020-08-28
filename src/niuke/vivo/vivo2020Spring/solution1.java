package niuke.vivo.vivo2020Spring;

public class solution1 {

    public int solution (int m, int n) {
        //范围处理
        if(m > n){
            return 0;
        }
        if(n == 0){
            return 0;
        }
        // write code here
        res = 0;
        visited = new boolean[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                dfs(i, j, m, n, 1);
            }
        }
        return res;
    }
    static int res;
    static boolean[][] visited;
    int[][] pos = {
            {1, 0},{1, 1},{1, -1}, {-1, 0}, {-1, -1}, {-1, 1}, {0, 1}, {0, -1},
            {1, 2}, {2, 1}, {-1, 2}, {-1, -2}, {-2, -1}, {-2, 1}, {1, -2}, {2, -1}
    };
    private void dfs(int i, int j, int m, int n, int p){
        if(p >= m){
            res++;
        }
        //当访问个数大于等于 n 个，那么已经足够了，无需继续访问
        if(p >= n){
            return;
        }

        visited[i][j] = true;
        //8 个方向走一遍
        for(int[] po : pos){
            int x = i + po[0];
            int y = j + po[1];
            if(!isEvil(x, y)){
                if(!visited[x][y]){
                    dfs(x, y, m, n, p + 1);
                }else{
                    //越过同方向上的点
                    int xx = x + po[0];
                    int yy = y + po[1];
                    if(!isEvil(xx, yy) && !visited[xx][yy]){
                        //越过 (x, y) 点，访问下一个点
                        dfs(xx, yy, m, n, p + 1);
                    }
                }
            }
        }
        visited[i][j] = false;
    }
    private boolean isEvil(int i, int j){
        return i < 0 || i >= 3 || j < 0 || j >= 3;
    }
}
