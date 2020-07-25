package algorithm.sort;
//归并排序
public class MergeSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        MergeSort.mergeSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class MergeSort{
    //递归地进行归并排序
    public static void mergeSort(int[] list){
        if(list.length>1){
            int[] firstHalf = new int[list.length/2];
            //复制list的前半部分到firstHalf中
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length/2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf,secondHalf,list);
        }
    }
    //把两个数组中的元素按大小顺序合并到临时数组temp中
    public static void merge(int[] list1,int[] list2,int[] temp){
        //这三个整数用于获得三个数组的当前元素
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while(current1<list1.length && current2<list2.length){
            //重复比较list1、list2中的当前元素，将较小的添加到temp中
            if(list1[current1] < list2[current2]){
                temp[current3++] = list1[current1++];
            }else{
                temp[current3++] = list2[current2++];
            }

            //哪个数组中有为移动到temp中的元素，就移动
            while(current1<list1.length)
                temp[current3++] = list1[current1++];

            while(current2<list2.length)
                temp[current3++] = list2[current2++];
        }
    }
}
