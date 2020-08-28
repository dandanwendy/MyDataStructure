package niuke.vivo.vivo2020Spring;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution (int n) {
       int num = 0;
       int sum = 0;
       int day_product = 0;

        for(int i=1;i<n;i++){
            if(sum+i<n){
                sum +=i;
            }else{
                day_product = i;
                break;
            }
        }
        System.out.println(day_product);

        for(int i=1;i<day_product;i++){
            num +=i*i;
            n = n-i;
        }
        num = num+day_product*n;
        return num;
    }
}
