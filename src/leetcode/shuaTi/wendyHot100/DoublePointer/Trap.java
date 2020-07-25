package leetcode.shuaTi.wendyHot100.DoublePointer;

//接雨水
public class Trap {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int left = 0;
        int right =height.length-1;
        int volume = 0;

        int maxIndex = 0;
        for(int i=1;i<height.length;i++){
            if(height[i]>=height[maxIndex]){
                maxIndex = i;
            }
        }

        for(int i=1;i<=maxIndex;i++){
            if(height[i]>=height[left]){
                left = i;
            }else{
                volume =volume+(height[left]-height[i]);
            }
        }
        for(int i=right;i>=maxIndex;i--){
            if(height[i]>=height[right]){
                right= i;
            }else{
                volume =volume+(height[right]-height[i]);
            }
        }
        return volume;
    }
}
