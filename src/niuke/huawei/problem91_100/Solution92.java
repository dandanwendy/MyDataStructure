package niuke.huawei.problem91_100;
import java.util.Scanner;

public class Solution92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            longestString(s);
        }
    }

    //双指针滑动窗口
   /* public static void longestString(String string){
        int left = 0;
        int right = 0;
        String s = "";
    }*/

   //动态规划
   public static void longestString(String s){
       int[] dp = new int[s.length()];
       int max = 0;
       if(Character.isDigit(s.charAt(0))){
           dp[0]=1;
       }else{
           dp[0]=0;
       }
       //动态规划推出以每个数字结尾的最长数字串
       for(int i=1;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))){
               dp[i]=dp[i-1]+1;
           }else{
               dp[i]=0;
           }
       }
       //找出最长数字串的长度
       for(int i=0;i<dp.length;i++){
           if(dp[i]>max){
               max= dp[i];
           }
       }
       //找出最长数字串的位置
       String string ="";
       for(int i=0;i<dp.length;i++){
           if(dp[i]==max){
               string = string + s.substring(i-max+1,i+1);
           }
       }
       System.out.println(string+","+max);
   }
}
