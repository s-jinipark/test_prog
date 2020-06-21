package kr.co.infopub.chapter.s107;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 정렬
		int [][] arr = {{2,6}, {1,8}, {1,2}};
		//Arrays.sort(arr);
		//->Exception in thread "main" java.lang.ClassCastException: 
		// [I cannot be cast to java.lang.Comparable
		// 오류 발생 함
		
		//Arrays.sort(arr, Comparator.comparingInt(ol->ol[0]));
		Arrays.sort(arr, Comparator.comparingInt(o1->o1[0]));
		// 의미?
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

		Arrays.sort(arr2, (o1,o2)->{
			if (o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		// 의미?
		for (int i=0; i<arr2.length ; i++) {
			System.out.println(">" + arr2[i][0] + " "+ arr2[i][1] );
		}
		System.out.println("---------------");
		System.out.println("---------------");
		
		int [][] arr3 = {{2,6}, {1,8}, {1,2}};

		Arrays.sort(arr3, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		for (int i=0; i<arr3.length ; i++) {
			System.out.println(">" + arr3[i][0] + " "+ arr3[i][1] );
		}
		
	}

}
