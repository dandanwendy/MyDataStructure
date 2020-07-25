package dataStructure.xianXingBiao.sparsearray;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chessArr1 = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][4]= 2;
		int sum =0;
		//遍历数组
		for(int[] row : chessArr1) {
			for(int column : row) {
				//一个制表符 \t 间隔太大
				System.out.print(column+" ");
				if(column != 0) {
					sum+=1;
				}
			}
			System.out.println("");
		}
		System.out.println("稀疏数组中共有非0元素"+sum+"个");
		//压缩稀疏数组到Arr1,但我们先要知道稀疏数组中非0元素有多少
		//遍历数组的同时完成对非0元素的统计
		int[][] arr1 = new int[sum+1][3];

		//获取压缩数组的第一行
		arr1[0][0] = chessArr1.length;
		arr1[0][1] = chessArr1[0].length;
		arr1[0][2] = sum;

		//下面写代码时发现需要一个计数器，判断遍历到了第几个非0元素
		int count = 0;
		//获取压缩数组的其它行
		for(int i =0;i<chessArr1.length;i++) {
			for(int j=0;j<chessArr1[0].length;j++) {
				if(chessArr1[i][j] != 0) {
					count++;
					arr1[count][0] = i;
					arr1[count][1] = j;
					arr1[count][2] = chessArr1[i][j];
				}
			}
		}

		//遍历压缩数组
		for(int[] row : arr1) {
			for(int column : row) {
				System.out.print(column+" ");
			}
			System.out.println("");
		}


		//还原稀疏数组
		System.out.println("---------------原稀疏数组是---------------------");
		int[][] sparseArr = getSparseArr(arr1);
		for(int[] row : sparseArr) {
			for(int column : row) {
				System.out.print(column+" ");
			}
			System.out.println("");
		}

	}

	//下面我们写一个方法，用于将压缩数组还原为稀疏数组
	public static int[][] getSparseArr(int[][] compressedArr) {
		int[][] sparseArr = new int[compressedArr[0][0]][compressedArr[0][1]];
		for(int i =1;i<compressedArr.length;i++) {
			sparseArr[compressedArr[i][0]][compressedArr[i][1]] = compressedArr[i][2];
		}
		return sparseArr;
	}

}
