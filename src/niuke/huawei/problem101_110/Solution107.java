package niuke.huawei.problem101_110;

import java.util.Scanner;

public class Solution107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double a = sc.nextDouble();
            System.out.println(getCubeRoot(a));
        }
    }
    /**
     * 二分法求解
     * @param num
     * @return
     */
    public static double getCubeRoot(double num){
        //为确保计算准确性，计算时的精度多保留几位
        double diff=0.000001;
        double start=0;
        double end=num;
        double mid=0;
        while(end-start>diff){
            mid=start+(end-start)/2;
            if(mid*mid*mid>num){
                end=mid;
            }else if(mid*mid*mid<num){
                start=mid;
            }else {
                return mid;
            }

        }
        //精度处理，保留一位小数
        return (double) Math.round(end*10.0)/10.0;


    }
}
