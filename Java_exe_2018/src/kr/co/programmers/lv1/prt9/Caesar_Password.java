package kr.co.programmers.lv1.prt9;

import kr.co.programmers.lv1.prt8.Sum_Of_Divisors2;

public class Caesar_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caesar_Password cp = new Caesar_Password();
		String s1 = "AB";
		int n1 = 1;
		String rtn1 = "";
		rtn1 = cp.solution( s1, n1 );
		System.out.println("[1] > " + rtn1);
		
		String s2 = "z";
		int n2 = 1;
		String rtn2 = "";
		rtn2 = cp.solution( s2, n2 );
		System.out.println("[2] > " + rtn2);

		String s3 = "a B z";
		int n3 = 4;
		String rtn3 = "";
		rtn3 = cp.solution( s3, n3 );
		System.out.println("[3] > " + rtn3);
		
	}

	public String solution(String s, int n) {
		String answer = "";
		StringBuffer sb  = new StringBuffer();
		
		for (int i = 0 ; i<s.length(); i ++) {
			//System.out.println(">" + s.charAt(i));
			char tmp_c = s.charAt(i);
			int tmp_i = (int)tmp_c;
			//System.out.println(">" + (int)tmp_c);
			
			if (tmp_i >= 65 && tmp_i <=90 ) { // 대문자
				tmp_i=tmp_i+n;
				if (tmp_i>90) {
					tmp_i = tmp_i%90 +64;
				}
			} else if (tmp_i >= 97 && tmp_i <=122 ) { // 소문자
				tmp_i=tmp_i+n;
				if (tmp_i>122) {
					tmp_i = tmp_i%122 +96;
				}
			} else if (tmp_i == 32 ) {
				tmp_i = 32;
			} 
			sb.append((char)tmp_i);
		}
		answer = sb.toString();
		/*
		 	A -> 65
			B -> 66
			Z -> 90
			a -> 97
			z -> 122
			공백> 32
		 */
	    return answer;
	}
	  
}
