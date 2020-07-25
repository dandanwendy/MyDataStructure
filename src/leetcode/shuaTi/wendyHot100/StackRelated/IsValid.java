package leetcode.shuaTi.wendyHot100.StackRelated;
import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {

        System.out.println(isValid("[]]{"));

    }

    public static boolean isValid(String s) {
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

        return stack.isEmpty();
    }
}
