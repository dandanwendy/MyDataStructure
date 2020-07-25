package algorithm.search;

public class InterPolationSearch {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,9,0,2,4,6,8};
        int index = interpolationSearch(list,8);
        System.out.println(index);
    }

    public static int interpolationSearch(int[] a, int key) {
        int low, mid, high;
        low = 0;// 最小下标
        high = a.length - 1;// 最大小标
        while (low < high) {
            mid = low + (high - low) * (key - a[low]) / (a[high] - a[low]);
            // mid = (high + low) / 2;// 折半下标
            if (key > a[mid]) {
                low = mid + 1; // 关键字比 折半值 大，则最小下标 调成 折半下标的下一位
            } else if (key < a[mid]) {
                high = mid - 1;// 关键字比 折半值 小，则最大下标 调成 折半下标的前一位
            } else {
                return mid; // 当 key == a[mid] 返回 折半下标
            }
        }
        return -1;
    }
}
