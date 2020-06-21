package kr.co.infopub.chapter.s107;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 정렬
		int [] arr = {21, 4, 19, 31, 16};
		Arrays.sort(arr);
		for (int i=0; i<arr.length ; i++) {
			System.out.println(">" + arr[i]);
		}
		
		System.out.println("---------------");
		int [] arr2 = {21, 4, 19, 31, 16};
		Arrays.sort(arr2, 1, arr2.length);
		for (int i=0; i<arr2.length ; i++) {
			System.out.println(">" + arr2[i]);
		} //-> 첫번째 21 값을 건드리지 않고 
		// index 값이 1인 두번째 값부터 마지막 값 까지만 정렬을 시킴
		//=> 근데 쓸 일이 있는지 ...
		
		System.out.println("---------------");
		//int [] arr3 = {4, 2, 1, 5, 3};
		//Arrays.sort(arr3, Collections.reverseOrder());
		//-> 오류남
		Integer [] arr3 = {4, 2, 1, 5, 3};
		Arrays.sort(arr3, Collections.reverseOrder());	
		for (int i=0; i<arr3.length ; i++) {
			System.out.println(">" + arr3[i]);
		}
		
		System.out.println("---------------");

		Integer [] arr4 = {4, 2, 1, 5, 3};
		Arrays.sort(arr4, Comparator.reverseOrder()); // 이것도 됨
		for (int i=0; i<arr4.length ; i++) {
			System.out.println(">" + arr4[i]);
		}
	}

}
