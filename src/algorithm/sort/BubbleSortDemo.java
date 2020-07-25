package algorithm.sort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2};
        BubbleSort.bubbleSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class BubbleSort{
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;

        for(int k=1;k<list.length && needNextPass;k++){
            needNextPass = false;
            for(int i=0;i<list.length - k;i++){
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1]  = temp;
                    needNextPass=true;
                }
            }
        }
    }
}