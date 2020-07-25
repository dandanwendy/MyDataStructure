package leetcode.shuaTi.wendyHot100.NumberOperation;

public class AddDigits {


    public int addDigits(int num) {

        int sum = num;
        while(sum/10!=0){
            int quotient = sum;
             sum=0;
            while(quotient!=0){
                sum += quotient%10;
                quotient /=10;
            }
        }
       return sum;
    }
}
