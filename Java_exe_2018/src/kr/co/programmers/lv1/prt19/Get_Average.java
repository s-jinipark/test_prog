package kr.co.programmers.lv1.prt19;

public class Get_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Get_Average ga = new Get_Average();
		int[] n1 = { 1,2,3,4};
		double rtn1 = ga.solution( n1  );
		System.out.println("[1] > " + rtn1);
		int[] n2 = { 5, 5 };
		double rtn2 = ga.solution( n2  );
		System.out.println("[2] > " + rtn2);
	}

	public double solution(int[] arr) {
		 double answer = 0;
		 double sum = 0;
		 for (int i=0; i< arr.length ; i++) {
			 sum += arr[i];
		 }
		 answer = sum/arr.length;
		 return answer;
	}
}
