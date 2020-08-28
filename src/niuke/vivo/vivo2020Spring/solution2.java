package niuke.vivo.vivo2020Spring;

public class solution2 {
    public static void main(String[] args) {
        System.out.println(solution(36));
    }

    public static int solution (int n) {
        int quotient=n;
        StringBuilder s = new StringBuilder();
        int i =9;
        while(quotient>9){

            if(quotient % i ==0){
                quotient = quotient/i;
                s.append(i);
            }else{
                i--;
            }
            if(i==2){
                break;
            }
        }

        if(quotient<=9){
            s.append(quotient);
            return Integer.parseInt(s.reverse().toString());
        }else{
            return -1;
        }
    }
}
