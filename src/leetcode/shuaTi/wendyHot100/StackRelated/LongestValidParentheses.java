package leetcode.shuaTi.wendyHot100.StackRelated;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("((()"));
    }

   /* public static int longestValidParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    int max=0;
    int num=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            stack.push('(');
        }else{
            if(!stack.isEmpty()){
                stack.pop();
                num +=2;
                max=(max>num)?max:num;
            }else{
                max=(max>num)?max:num;
                num=0;
            }
        }
    }
    return max;
}*/

    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
