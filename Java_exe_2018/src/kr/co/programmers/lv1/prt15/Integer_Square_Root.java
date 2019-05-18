package kr.co.programmers.lv1.prt15;

public class Integer_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer_Square_Root isr = new Integer_Square_Root();
		long n1 = 121;
		long rtn1 = isr.solution( n1  );
		System.out.println("[1] > " + rtn1);
		long n2 = 3;
		long rtn2 = isr.solution( n2  );
		System.out.println("[2] > " + rtn2);		
	}

	public long solution(long n) {

		long answer = -1;
		
	    for (int i = 0 ; i<n; i++) {
	    	
	    	if ( i*i == n ) {
	    		answer = (i+1)*(i+1);
	    		break;
	    	}
	    }

	    return answer;
	}
	
}
