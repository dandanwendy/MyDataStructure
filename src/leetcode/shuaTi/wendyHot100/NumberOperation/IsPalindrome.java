package leetcode.shuaTi.wendyHot100.NumberOperation;

public class IsPalindrome {

    //我通过StringBuffer反转字符串取巧了，但实际速度很慢
    public boolean isPalindrome(int x) {
        String a = x + "";
        StringBuffer b = new StringBuffer(a);

        if(a.equals(b.reverse().toString())){
            return true;
        }else{
            return false;
        }

    }
}
