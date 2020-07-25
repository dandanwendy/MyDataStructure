package leetcode.shuaTi.wendyHot100.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        int len = strs.length;
        if(len==0){
            return "";
        }
        if(len==1){
            return strs[0];
        }
        String publicStr = strs[0];
        for(int i=1;i<len;i++){
            String s = "";
            int k = 0;
            for(int j=0;j<Math.min(publicStr.length(),strs[i].length());j++){
                if(publicStr.charAt(j)==strs[i].charAt(j)){
                    k++;
                }else{
                    break;
                }
            }
            publicStr=publicStr.substring(0,k);
        }
        return ""+publicStr;
    }
}
