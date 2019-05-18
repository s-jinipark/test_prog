package kr.co.programmers.lv1.prt16;

import java.util.ArrayList;

public class Remove_Smallest_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Smallest_Number2 rsn = new Remove_Smallest_Number2();
		
		int[] n1 = { 4, 3, 2, 1 };
		int[] rtn1 = rsn.solution( n1  );
		System.out.println("[1] > " + rtn1);
		for (int i = 0 ; i<rtn1.length ; i++) {
			System.out.println("  > " + rtn1[i]);
		}	
		int[] n2 = { 10 };
		int[] rtn2 = rsn.solution( n2  );
		System.out.println("[2] > " + rtn2);
		for (int i = 0 ; i<rtn2.length ; i++) {
			System.out.println("  > " + rtn2[i]);
		}	
	}

	public int[] solution(int[] arr) {

		int[] answer = {};
		
		ArrayList<Integer> al = new  ArrayList<>();
		
		int small_no = arr[0]; // 초기값
		
		for (int i = 0 ; i<arr.length ; i++) {
			if ( small_no > arr[i] ) {
				small_no = arr[i];
			}
			al.add(arr[i]);
		}
		
		// 가장 작은 수 제거
		for(int j = 0; j < al.size(); j++) {

			if (small_no == al.get(j) )
				al.remove(j);
		}
		
		if (al.size() ==0 )
			al.add(-1);
		
		answer = new int[ al.size() ];
		
		for(int j = 0; j < al.size(); j++) {
			answer[j] = al.get(j);
		} 
	    return answer;
	}
	
}
