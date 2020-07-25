package algorithm.search;

public class SequentialSearch {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,9,0,2,4,6,8};
        int index = sequentialSearch(list,3);
        System.out.println(index);
    }

    public static int sequentialSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }
}
