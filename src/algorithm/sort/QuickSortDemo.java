package algorithm.sort;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        QuickSort.quickSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class QuickSort{
    public static void quickSort(int[] list){
        quickSort(list,0,list.length-1);
    }

    public static void quickSort(int[] list, int first, int last){
        if(last>first){
            int pivotIndex = partition(list,first,last);
            quickSort(list,first,pivotIndex-1);
            quickSort(list,pivotIndex+1,last);
        }
    }

    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first+1;
        int high = last;

        //该循环可以实现把元素分为大于基准或小于等于基准元素这两部分的操作
        while(high>low){
            //从左侧查找第一个大于基准元素的元素
            while(low<=high && list[low]<=pivot)
                low++;
           //从右侧开始查找第一个小于或等于基准元素的元素
            while(high>low && list[high]>pivot)
                high--;

            //交换上面查找到的两个元素的位置
            if(high>low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
            //下一轮循环继续交换下一对元素
        }
       //从右向左，寻找划分后的数组中第一个小于基准元素的元素
        while(high>first && list[high]>=pivot)
            high--;

        //交换基准元素与上一步查找得到的元素
        if(pivot>list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;//返回基准元素当前的位置
        }else{
            return first;//基准元素恰巧是第一个
        }
    }
}
