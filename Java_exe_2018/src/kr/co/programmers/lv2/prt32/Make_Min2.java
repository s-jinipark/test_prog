package kr.co.programmers.lv2.prt32;

import java.util.Arrays;

public class Make_Min2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Min2 mn = new Make_Min2();
		
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
		Arrays.sort(A);
		Arrays.sort(B);
		

		int sum = 0;
		for (int i= 0; i< A.length ; i++) {
			System.out.println(">" + A[i] + " / " + B[A.length-1-i] );
			
			sum = sum + A[i] * B[A.length-1-i] ;
		}
		answer = sum;
		return answer;

    } 
}
