package kr.co.programmers.lv1.prt15;

public class Integer_Square_Root2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer_Square_Root2 isr = new Integer_Square_Root2();
		long n1 = 121;
		long rtn1 = isr.solution( n1  );
		System.out.println("[1] > " + rtn1);
		long n2 = 3;
		long rtn2 = isr.solution( n2  );
		System.out.println("[2] > " + rtn2);		
	}

	public long solution(long n) {

		long answer = -1;
		
		long sqrt = (long)Math.sqrt(n);
		System.out.println(">" + sqrt);
		if (Math.pow(sqrt,  2) == n)
			answer = (long) Math.pow( (sqrt + 1), 2);


	    return answer;
	}
	
}
