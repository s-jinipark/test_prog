package kr.co.programmers.lv1.prt22;

public class Add_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Matrix am = new Add_Matrix();
		int[][] ar1 = {{1,2}, {2,3}};
		int[][] ar2 = {{3,4}, {5,6}};

		int[][] rtn1 = am.solution( ar1 , ar2  );
		System.out.println("[1] > " + rtn1);
		 for ( int i=0 ; i< rtn1.length ; i++) {
			 for (int j =0; j< rtn1[i].length ; j++) {				 
				 System.out.print( rtn1[i][j] + " " );
			 }
			 System.out.println();
		 }

		int[][] ar3 = {{1}, {2}};
		int[][] ar4 = {{3}, {4}};

		int[][] rtn2 = am.solution( ar3 , ar4  );
		System.out.println("[2] > " + rtn2);
		 for ( int i=0 ; i< rtn2.length ; i++) {
			 for (int j =0; j< rtn2[i].length ; j++) {				 
				 System.out.print( rtn2[i][j] + " " );
			 }
			 System.out.println();
		 }
			 
	}

	public int[][] solution(int[][] arr1, int[][] arr2) {
		 //int[][] answer = {};
		 int[][] answer = new int[arr1.length][arr1[0].length];
		 
		 for ( int i=0 ; i< arr1.length ; i++) {
			 for (int j =0; j< arr1[i].length ; j++) {
				 
				 answer[i][j] = arr1[i][j] + arr2[i][j];
			 }
		 }
		 return answer;
	}
}
