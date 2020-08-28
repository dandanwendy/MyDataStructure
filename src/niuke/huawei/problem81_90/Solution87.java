package niuke.huawei.problem81_90;

import java.util.Scanner;

public class Solution87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            codeStrength(s);
        }

    }
    public static int codeStrength(String code){
        int score =0;
        int len = code.length();
        int num_lowerchar = 0;
        int num_upperchar = 0;
        int num_digit = 0;
        int num_symbol = 0;

        for(int i=0;i<len;i++){
            if(Character.isDigit(code.charAt(i))){
                num_digit += 1;
            }else if(code.charAt(i)>='A' && code.charAt(i)<='Z'){
                num_upperchar += 1;
            }else if(code.charAt(i)>='a' && code.charAt(i)<='z'){
                num_lowerchar += 1;
            }else{
                num_symbol += 1;
            }
        }

        if(len<=4){
            score += 5;
        }else if(len>=5 && len<=7){
            score += 10;
        }else{
            score += 25;
        }

        if(num_lowerchar==0 && num_upperchar==0){
            score += 0;
        }else if(num_lowerchar==0 || num_upperchar==0){
            score += 10;
        }else{
            score += 20;
        }

        if(num_digit==0){
            score += 0;
        }else if(num_digit==1){
            score += 10;
        }else{
            score += 20;
        }

        if(num_symbol==0){
            score += 0;
        }else if(num_symbol==1){
            score += 10;
        }else{
            score += 25;
        }

        //注意奖励分，条件越严分越高，应该从条件严往简单判断

        if(num_lowerchar>0 && num_upperchar>0 && num_digit>0 && num_symbol>0){
            score += 5;
        }else if((num_lowerchar>0 || num_upperchar>0) && num_digit>0 && num_symbol>0){
            score += 3;
        }else if((num_lowerchar>0 || num_upperchar>0) && num_digit>0){
            score += 2;
        }


        if(score>=90){
            System.out.println("VERY_SECURE");
        }else if(score>=80){
            System.out.println("SECURE");
        }else if(score>=70){
            System.out.println("VERY_STRONG");
        }else if(score>=60){
            System.out.println("STRONG");
        }else if(score>=50){
            System.out.println("AVERAGE");
        }else if(score>=25){
            System.out.println("WEAK");
        }else if(score>=0){
            System.out.println("VERY_WEAK");
        }
      return score;
    }
}
