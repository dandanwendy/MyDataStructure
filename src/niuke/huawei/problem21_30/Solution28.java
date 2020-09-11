package niuke.huawei.problem21_30;

public class Solution28 {
    public static void main(String[] args) {

    }
    public static boolean isPrimer(int a){
        if(a ==1 || a==2) return false;
        boolean flag = true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
