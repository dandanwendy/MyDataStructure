package leetcode.shuaTi.wendyHot100.NumberOperation;

public class MyAtoi {

    public static int myAtoi(String str){

        String s = str.trim();
        if(s.length()==0){
            return 0;
        }
        boolean flag = false;
        int index = 0;
        if(s.charAt(0)=='-'){
            flag = true;
            index++;
        }else if(s.charAt(0)=='+'){
            flag = false;
            index++;
        }else if(!Character.isDigit(s.charAt(0))){
            return 0;
        }

        int ans = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index)) ){
            int digit = s.charAt(index) - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return flag? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            index++;
        }


        return flag?-ans:ans;
    }
}
