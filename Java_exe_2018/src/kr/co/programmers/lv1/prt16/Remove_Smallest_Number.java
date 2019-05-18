package kr.co.programmers.lv1.prt16;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Smallest_Number rsn = new Remove_Smallest_Number();
		
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
		
		// Á¤·Ä
		Arrays.sort(arr);
		
		for (int i = 0 ; i<arr.length ; i++) {
			if (i > 0)
				al.add(arr[i]);
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
