package algorithm.sort.heap;

public class HeapSortDemo {
    public static void main(String[] args) {
        Integer[] list = {9,8,7,6,5,4,3,2,1};
        HeapSort.heapSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class HeapSort{
    public static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap = new Heap<E>();

        for(int i =0;i<list.length;i++){
            heap.add(list[i]);
        }
        for(int i =list.length-1;i>=0;i--){
            list[i] = heap.remove();
        }
    }
}
