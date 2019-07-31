package kr.co.programmers.lv1.prt26;

import java.util.Arrays;

public class String_To_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_To_Integer sti = new String_To_Integer();

		String s = "1234";
	    int rtn1 = sti.solution( s );
	    System.out.println("[1] > " + rtn1);

		String s2 = "-1234";
	    int rtn2 = sti.solution( s2 );
	    System.out.println("[2] > " + rtn2);  
	}

	public int solution(String s) {
		int answer = 0;

		char tmp = s.charAt(0);
		
		if (tmp == '-') {
			int tmp_i = Integer.parseInt(s.substring(1) );
			//answer = tmp_i - (tmp_i *2);
			// [2] * -1 해도 될 듯
			answer = tmp_i * -1;
		} else { // (+ 이거나 숫자)
			if (tmp == '+') {
				answer = Integer.parseInt(s.substring(1) );
			} else {
				answer = Integer.parseInt(s);
			}
		}
	    return answer;
	}
}
