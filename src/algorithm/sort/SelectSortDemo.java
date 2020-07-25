package algorithm.sort;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        SelectSort.selectSort(list);

        for(int i:list){
            System.out.println(i);
        }

    }
}

class SelectSort {
    public static void selectSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }
    }
}
