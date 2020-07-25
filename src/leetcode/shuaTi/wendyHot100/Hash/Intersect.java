package leetcode.shuaTi.wendyHot100.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersect {

    //我的解法只能统计集合中不重复的元素
    /*public int[] intersect(int[] nums1, int[] nums2) {
        Set set = new HashSet();
        for(int i=0;i< nums1.length;i++){
            for(int j=0;j< nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                    continue;
                }
            }
        }
        int[] res = new int[set.size()];
        int i =0;
        Iterator it = set.iterator();
        while(it.hasNext()){
            res[i] = (int)it.next();
        }
        return res;
    }*/
}
