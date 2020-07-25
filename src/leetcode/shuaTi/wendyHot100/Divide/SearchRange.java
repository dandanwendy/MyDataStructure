package leetcode.shuaTi.wendyHot100.Divide;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] res = searchRange(nums,8);
        for(int i:res){
            System.out.println(i);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums.length==0) return res;
        int startl = 0;
        int endl = nums.length-1;
        int startr = 0;
        int endr = nums.length-1;
        int mid =0;



        //找最小下标
        while(startl<=endl){
            mid = (startl+endl)/2;
            if(nums[mid]>target){
                endl = mid-1;
            }else if(nums[mid] == target){
                if(mid==0){
                    res[0]=0;
                    break;
                }else{
                    res[0] = mid;
                    endl = mid-1;
                }
            }else{
                startl = mid+1;
            }
        }
        //找最大下标
        while(startr<=endr){
            mid = (startr+endr)/2;
            if(nums[mid]>target){
                endr = mid-1;
            }else if(nums[mid] == target){
                if(mid==nums.length-1){
                    res[1]=mid;
                    break;
                }else{
                    res[1] = mid;
                    startr = mid+1;
                }

            }else{
                startr = mid+1;
            }
        }

        //想把两个while合并是行不通的，以为需要的mid值不一样
        /*while(startl<=endl){
            mid = (startl+endl)/2;
            if(nums[mid]>target){
                endl = mid-1;
                endr = mid-1;
            }else if(nums[mid] == target){
                if(mid==0){
                    res[0]=0;
                    break;
                }else{
                    res[0] = mid;
                    endl = mid-1;
                }

                if(mid==nums.length-1){
                    res[1]=mid;
                    break;
                }else{
                    res[1] = mid;
                    startr = mid+1;
                }
            }else{
                startl = mid+1;
                startr = mid+1;
            }
        }*/
        return res;
    }
}
