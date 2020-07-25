package leetcode.shuaTi.wendyHot100.DoublePointer;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "hello worlda";
        int a = lengthOfLongestSubstring(s);
        System.out.println(a);
    }

    public static int lengthOfLongestSubstring(String s) {
        String subs = "";
        int max = 0;
        boolean flag = false;
        int start = 0;
        for(int i=0;i<s.length();i++){
            //判断子串中是否有i字符
            for(int j=0;j<subs.length();j++){
                if(s.charAt(i)==subs.charAt(j)){
                    flag = true;
                    //如果有，下一次从start位置寻找子串
                    start = start+j+1;
                    break;
                }
            }

            if(flag==false){
                subs = subs+s.charAt(i);
            }else{
                max  = (subs.length()>max)?subs.length():max;
                i = start;
                subs = ""+s.charAt(i);
                flag = false;
            }
        }
        max  = (subs.length()>max)?subs.length():max;
       return max;
    }
}
