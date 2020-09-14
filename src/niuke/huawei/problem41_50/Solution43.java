package niuke.huawei.problem41_50;

import java.util.*;

public class Solution43 {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] maze = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    maze[i][j] = sc.nextInt();
                }
            }

            List<Stack> list = new ArrayList<>();
            Stack<String> stack = new Stack<>();
            dfs(maze,0,0,stack,list);

            Collections.sort(list, new Comparator<Stack>() {
                @Override
                public int compare(Stack o1, Stack o2) {
                    return o1.size()-o2.size();
                }
            });
            Stack<String> stack1 = new Stack<>();
            stack1 = list.get(0);
            stack1.forEach(item-> System.out.println(item));
        }
    }
    public static void dfs(int[][] maze,int x, int y,Stack<String> stack,List<Stack> list){
        if(x<0 || y<0 || x>=maze.length || y>=maze[0].length || maze[x][y]==1){
            return ;
        }

        if(x==maze.length-1 && y==maze[0].length-1){
            stack.push("("+x+","+y+")");
            Stack<String> stack1 = new Stack<>();
            stack1 = (Stack)stack.clone();
            list.add(stack1);
            stack.pop();
            return ;
        }else{
            stack.push("("+x+","+y+")");
            maze[x][y] = 1;
            dfs(maze,x-1,y,stack,list);
            dfs(maze,x+1,y,stack,list);
            dfs(maze,x,y-1,stack,list);
            dfs(maze,x,y+1,stack,list);
            maze[x][y] = 0;
            stack.pop();
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] maze = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    maze[i][j] = sc.nextInt();
                }
            }
            Stack<String> stack = new Stack<>();
            dfs(maze,0,0,stack);
            stack.forEach(item-> System.out.println(item));
        }
    }
    public static boolean dfs(int[][] maze,int x, int y,Stack<String> stack){
        if(x<0 || y<0 || x>=maze.length || y>=maze[0].length || maze[x][y]==1){
            return false;
        }
        if(x==maze.length-1 && y==maze[0].length-1){
            stack.push("("+x+","+y+")");
            return true;
        }
        stack.push("("+x+","+y+")");
        maze[x][y] = 1;

        //验证是否需要控制x与y的方向
        if(dfs(maze,x-1,y,stack) || dfs(maze,x,y-1,stack) ||
                dfs(maze,x+1,y,stack) || dfs(maze,x,y+1,stack)){
            return true;
        }else{
            stack.pop();
            return false;
        }

        /*if(dfs(maze,x+1,y,stack) || dfs(maze,x,y+1,stack) ||
                dfs(maze,x-1,y,stack) || dfs(maze,x,y-1,stack)){
            return true;
        }else{
            stack.pop();
            return false;
        }*/
    }
}
