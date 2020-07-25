package leetcode.shuaTi.wendyHot100.DoublePointer;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maxarea = 0,area = 0;
        while(i!=j){
            area = Math.min(height[i],height[j])*(j-i);
            if(area>maxarea){
                maxarea=area;
            }
            if(height[i]>height[j])
                j--;
            else
                i++;
        }
       return maxarea;
    }
}
