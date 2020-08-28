package niuke.huawei.problem91_100;

public class Solution95 {
    char[] c1 = {'壹','贰','叁','肆','伍','陆','柒','捌','玖'};
    char[] c2 = {'拾','佰','仟'};
    char[] c3 = {'万','亿'};
    char[] c4 = {'元','角','分','零','整'};
    public static void main(String[] args) {

    }
    public static String rmb(double d){
        String[] num = (d+"").split(".");
        int yi = Integer.parseInt(num[0])/100000000;
        int wan = Integer.parseInt(num[0])%100000000/10000;
        int yuan = Integer.parseInt(num[0])%10000;

        return "";
    }
}
