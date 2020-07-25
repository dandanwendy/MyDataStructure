package algorithm.sort;

public class ShellSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        ShellSort.shellSort(list);
        for(int i:list){
            System.out.println(i);
        }
    }
}

class ShellSort {
    public static void shellSort(int[] arr) {
        // 空数组 或 只有一个元素的数组，则什么都不做。
        if (arr == null || arr.length <= 1) return;
        // 定义希尔增量。
        int gap = arr.length / 2;
        // gap缩小到0的时候就退出循环。
        while (gap != 0) {
            // 每组进行直接插入排序。
            for (int i = gap; i < arr.length; i++) {    // i 代表待插入元素的索引。
                int value = arr[i];
                int j = i - gap;    // j 代表i的上一个元素，相差一个增量gap。
                // j < 0 时退出循环，说明 j 是最小的元素的索引值。
                // 或者 arr[j] <= value 时退出循环，说明 j 是比value小的元素的索引值。
                for (; j >= 0 && arr[j] > value; j -= gap) {
                    arr[j + gap] = arr[j];  // 把元素往后挪。
                }
                arr[j + gap] = value;
            }
            // 缩小增量。
            gap /= 2;
        }
    }
}
