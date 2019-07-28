package imsi.suji.test2018.A2.q4;

import java.util.Arrays;

public class Sum {
	/**
	 * 배열을 정렬하는 기능
	 *
    * @param		inputData		int[][]		입력데이터(이차원배열)
    * @return						int[][]		정렬된 배열
	 */
	public int[][] getSortedArray(int[][] inputData) {
		int[][] sortedArray = null;
		int size = inputData.length;
		sortedArray = new int[size][size];
		////////////////////////여기부터 구현 (1) ---------------->

		// 10 으로 나머지 연산 수행
		for (int i=0 ; i< inputData.length ; i++) {
			for (int j=0 ; j< inputData[i].length ; j++) {
				sortedArray[i][j] = inputData[i][j]%10;
			}
		}
		
		// 각 행을 오름차순으로 정렬
		for (int i=0 ; i< sortedArray.length ; i++) {
			Arrays.sort( sortedArray[i] );
		}
		
		// 각 열을  오름차순으로 정렬
		
		for (int i=0 ; i< sortedArray.length ; i++) {
			int[] tmp = new int[sortedArray.length];
			for (int j=0 ; j< sortedArray[i].length ; j++) {
				tmp[j] = sortedArray[j][i] ;
			}
			Arrays.sort( tmp );
			for (int j=0 ; j< tmp.length ; j++) {
				sortedArray[j][i] = tmp[j] ;
			}
			
		}	
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return sortedArray;
	}
	
	/**
	 * 배열합을 계산하는 기능
	 *
    * @param		sortedArray		int[][]		정렬된 배열
    * @return						int			배열합
	 */
	public int getArrSum(int[][] sortedArray) {
		int arrSum = 0;
		int size = sortedArray.length;
		int [][] temp = new int[size][size];
		for(int i=0; i<size; i++) {
			System.arraycopy( sortedArray[i], 0, temp[i], 0, size );
		}
		
		////////////////////////여기부터 구현 (2) ---------------->

		for (int i=0 ; i< sortedArray.length ; i++) {
			for (int j=0 ; j< sortedArray[i].length ; j++) {
				
				// 전 후 좌 우 비교
				if (i-1 >= 0) {
					if (sortedArray[i][j] == sortedArray[i-1][j] ) {
						temp[i][j] = 0;
						temp[i-1][j] = 0;
					}
				}
				if (i+1 < size) {
					if (sortedArray[i][j] == sortedArray[i+1][j] ) {
						temp[i][j] = 0;
						temp[i+1][j] = 0;
					}
				}
				if (j-1 >= 0) {
					if (sortedArray[i][j] == sortedArray[i][j-1] ) {
						temp[i][j] = 0;
						temp[i][j-1] = 0;
					}
				}
				if (j+1 < size) {
					if (sortedArray[i][j] == sortedArray[i][j+1] ) {
						temp[i][j] = 0;
						temp[i][j+1] = 0;
					}
				}				
			}
		}
		
		// 모든 칸의 합 계산
		for (int i=0 ; i< temp.length ; i++) {
			for (int j=0 ; j< temp[i].length ; j++) {
				
				arrSum += temp[i][j];
			}
		}
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return arrSum;
	}
}
