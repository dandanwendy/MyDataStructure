package algorithm.sort;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        InsertionSort.insertionSort(list);

        for(int i:list){
            System.out.println(i);
        }

    }
}

class InsertionSort{
    public static void insertionSort(int[] list){
        for(int i=1;i<list.length;i++){
            int currentElement = list[i];
            int k;
            for(k=i-1;k>=0 && list[k] > currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
}
