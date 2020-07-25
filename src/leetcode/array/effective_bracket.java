package leetcode.array;


import java.util.Stack;

public class effective_bracket {
    public static void main(String[] args) {
        Solution1 s =new Solution1();
        System.out.println(s.isValid("[]]{"));

    }
}
//左括号放入栈中，遇到右括号弹出比较
class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while (i < s.length()) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')'){
                if(stack.isEmpty() || stack.pop() != '(')
                return false;
            } else if (c == '}'){
                if(stack.isEmpty() || stack.pop() != '{')
                    return false;
            }else if (c == ']'){
                if(stack.isEmpty() || stack.pop() != '[')
                    return false;
            }
            i++;
        }
        /*if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }*/
       return stack.isEmpty();
    }
}


//开始想采用选择方法情况太多，我考虑不到多有情况；
//下面只能判断一个括号后面不会输入不匹配的字符
  /*class Solution1 {
    public static boolean isValid(String s) {
        int i = 0;
        boolean a =false;
        while(i<s.length()-1){
            if(s.charAt(i)=='('){
                if(s.charAt(i+1)==']' || s.charAt(i+1)=='}'){
                    //return false;
                }
            }
            else if(s.charAt(i)=='['){
                if(s.charAt(i+1)==')' || s.charAt(i+1)=='}'){
                    //return false;
                }
            }
            else if(s.charAt(i)=='{'){
                if(s.charAt(i+1)==')' || s.charAt(i+1)==']'){
                    //return false;
                }
            }else{
                a= true;
            }
            i++;
        }
       return  a;
    }
}*/