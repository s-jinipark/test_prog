package kr.co.infopub.chapter.s107;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 정렬
		int [][] arr = {{2,6}, {1,8}, {1,2}};

		Arrays.sort(arr, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0]; // 내림차순 정렬은 o2와 o1 의 위치를 바꾸어 줌
			}
		});

		for (int i=0; i<arr.length ; i++) {
			System.out.println(">" + arr[i][0] + " "+ arr[i][1] );
		}
		/*  출력이 1차원 기준으로 정렬
		 	>1 8
			>1 2
			>2 6
		 */
		System.out.println("---------------");
		int [][] arr2 = {{2,6}, {1,8}, {1,2}};

		Arrays.sort(arr2, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) { // 0번째가 같다면
					return o1[1]- o2[1]; // 1번째 인덱스를 비교
				} else {
					return o1[0]- o2[0];
				}
			}
		});
		
		for (int i=0; i<arr2.length ; i++) {
			System.out.println(">" + arr2[i][0] + " "+ arr2[i][1] );
		}

		
	}


}
