package kr.co.programmers.lv2.prt01;

public class Country_123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country_123 c123 = new Country_123();
		
		int n1 = 19;

	    String rtn1 = c123.solution( n1 );
	    System.out.println( "[1] > " + rtn1 );
	    
	}

	public String solution(int n) {

		String answer = "";
		int tmp_n = n;
		int tmp1 = 0;
		int tmp2 = 0;
		String test = "";
		while (tmp_n < 3) {
			tmp1 = tmp_n/3;
			tmp2 = tmp_n%3;
			System.out.println(">" + tmp1 + " / " + tmp2 + "//" + test);
			tmp_n = tmp1;
		}
		
		
		/*
		for (int i=0; i< n ; i++) {
			int tmp1 = 0;
			int tmp2 = 0;
			String test = "";
			while (tmp2 < 3) {
				tmp1 = i/3;
				tmp2 = i%3;
				test = tmp2 + tmp1 + test;
			}
			System.out.println(">" + tmp1 + " / " + tmp2 + "//" + test);
		}
		*/
		return answer;
	}
}
