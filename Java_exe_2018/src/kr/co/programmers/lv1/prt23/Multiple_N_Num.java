package kr.co.programmers.lv1.prt23;

public class Multiple_N_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_N_Num mnn = new Multiple_N_Num();

		int x = 2;
		int n = 5;
		long[] rtn1 = mnn.solution( x , n );
		System.out.println("[1] > " + rtn1);
		 for ( int i=0 ; i< rtn1.length ; i++) {
			System.out.print( rtn1[i] + " " );
		 }	 
		 System.out.println();
		 
		int x2 = -4;
		int n2 = 2;
		long[] rtn2 = mnn.solution( x2 , n2 );
		System.out.println("[2] > " + rtn2);
		 for ( int i=0 ; i< rtn2.length ; i++) {
			System.out.print( rtn2[i] + " " );
		 }
	}

	public long[] solution(int x, int n) {
		 //long[] answer = {};
		 long[] answer =  new long[n];
		 
		 long test = x;
		 
		 answer[0] = (long)x;
		 for (int i = 1 ; i < n ; i++) {
			 answer[i] = answer[i-1] + test;
		 }
		 return answer;
	}
}
