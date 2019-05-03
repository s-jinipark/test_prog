package kr.co.programmers.lv2.prt32;

import java.util.ArrayList;
import java.util.Collections;

public class Make_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Min mn = new Make_Min();
		
		int[] A1 = { 1, 4, 2 };
		int[] B1 = { 5, 4, 4 };
		
		int rtn1 = mn.solution( A1 , B1  );
		System.out.println("[1] > " + rtn1);


		int[] A2 = { 1, 2 };
		int[] B2 = { 3, 4 };
		
		int rtn2 = mn.solution( A2 , B2  );
		System.out.println("[2] > " + rtn2);
	}

	public int solution(int []A, int []B) {
		int answer = 0;
	    // 큰수끼리 곱해지는 것 방지
		ArrayList<Integer> aA = new ArrayList<>();
		ArrayList<Integer> aB = new ArrayList<>();

		
		for (int i=0; i< A.length; i++) {
			aA.add(A[i]);
			aB.add(B[i]);
		}
		
		Collections.sort(aA);
		Collections.reverse(aB);


		int sum = 0;
		for (int i= 0; i< A.length ; i++) {
			System.out.println(">" + aA.get(i) + " / " + aB.get(i));
			//System.out.println(">" + aA.get(i) + " / " + aB.get(A.length-1-i));
			sum = sum + aA.get(i) * aB.get(i);
		}
		answer = sum;
		return answer;

    } 
	// 정렬이 잘 안되어 -> 값이 다르게 나옴
}
