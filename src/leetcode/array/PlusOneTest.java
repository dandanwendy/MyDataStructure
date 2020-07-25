package leetcode.array;


public class PlusOneTest {
    public static void main(String[] args) {
       // int[] a = new int[1];
        int[] a ={9,8,7,6,5,4,3,2,1,0};
        Solution s = new Solution();

        int[] b =s.plusOne(a);
        for(int i:b){
            System.out.print(i);
        }
    }

}
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
