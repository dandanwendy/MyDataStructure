package leetcode.array;


public class duiJiaoXianBianLi {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        findDiagonalOrder(matrix);

    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        int[] result = new int[matrix.length*matrix[0].length];

        int i =0;
        int k=0;
        int l=0;
        int q=0;
        int count=0;
        while(i<=matrix.length+(matrix[0].length)-2){

            if(i>=matrix.length-1){
                q=matrix.length-1;
            }else{
                q=i;
            }

            if(i%2==0){
                for(k=q; k<matrix.length || l<matrix.length;){
                    l=i-k;
                    result[count]=matrix[k][l];
                    count++;
                        System.out.println(matrix[k][l]);
                    k--;
                    if(k<0 || l>=matrix.length-1){
                        k++;
                        break;
                    }
                }
            }else{
                for(l=q;k<matrix.length || l<matrix.length;){
                    k=i-l;

                    result[count]=matrix[k][l];
                    count++;
                        System.out.println(matrix[k][l]);
                    l--;
                    if(l<0 || k>=matrix.length-1){
                        l++;
                        break;
                    }
                }
            }
            i++;

        }
                return result;
    }
}
