package leetcode.shuaTi.wendyHot100.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    //我的想法没能实现
    /*public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        String s = new String("(");
        list.add(s);
        for(int i=1;i<list.size();i++){
            list.get(i-1);
        }
        return list;
    }

   public boolean ParenthesisIsvalid(String s,int num){
        int m = 0;
        int n = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                m++;
            }else{
                n++;
            }
        }
        return (m>n && m<=num)?true:false;
    }*/

}
