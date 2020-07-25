package leetcode.shuaTi.wendyHot100.string;

public class strStr {
    public static void main(String[] args) {
        String s1 = "arqewtqrt";
        String s2 ="qrt";

        System.out.println(strSTR(s1,s2));
    }

    public static int strSTR(String haystack,String needle){
        int index=0;

        int len_hay = haystack.length();
        int len_nee = needle.length();

        if(haystack.equals("") && needle.equals((""))){
            return 0;
        }

        if(len_hay<len_nee){
            return -1;
        }

        for(int i=0;i<=len_hay-len_nee;i++){
            int k =i;
            int len_count=0;
            for(int j =0;j<len_nee;j++){
                if(haystack.charAt(k)==needle.charAt(j)){
                    k++;
                    len_count++;

                }
            }
            if(len_count==len_nee){
                return i;
            }
        }

        return -1;

    }
}
