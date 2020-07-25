package algorithm.sort;

public class RadixSortDemo {
    public static void main(String[] args) {
        int[] list = {9,8,7,6,5,4,3,2,1};
        RadixSort.radixSort(list);

        for(int i:list){
            System.out.println(i);
        }
    }
}

class RadixSort{
    public static void radixSort(int[] list){
        //找出数组中最大元素的长度，这关系着给数字补到多长
        int max = list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>max)
                max=list[i];
        }
        int maxLength=(max+"").length();

        //定义一个二位数组，其中每个一维数组是一个桶
        // 总共有10个桶。每个桶容量是要排序数组的大小
        int[][] bucket = new int[10][list.length];

        //该数组记录每个桶中实际存放多少数据
        int[] bucketElementCounts = new int[10];

        for(int i=0,n=1;i<list.length;i++,n*=10){
            //这段代码实现把数据装入桶
            for(int j=0;j<list.length;j++){
                //求数组元素的对应位的值
                int digitOfElement = list[j]/n%10;
                //根据对应位的值，把元素放入对应桶
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = list[j];
                //哪个桶添加了元素，桶存放的数据量就加1
                bucketElementCounts[digitOfElement]++;
            }

            //这段代码把数据从桶中取出，已实现一定的排序
            int index = 0;
            for(int k=0;k<bucketElementCounts.length;k++){
                //桶非空，就从桶中取数据
                if(bucketElementCounts[k]!=0){
                    for(int l=0;l<bucketElementCounts[k];l++){
                        //按桶编号的从小到大，取数据放到原数组
                        list[index++]=bucket[k][l];
                    }
                }
                //清空桶，为下一位装桶做准备
                bucketElementCounts[k] = 0;
            }
        }
    }
}
