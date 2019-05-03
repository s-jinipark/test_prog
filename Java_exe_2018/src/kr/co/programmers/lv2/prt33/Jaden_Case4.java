package kr.co.programmers.lv2.prt33;

import java.util.ArrayList;
import java.util.Collections;

public class Jaden_Case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaden_Case4 jc = new Jaden_Case4();
		
		String s1 = "3people unFollowed  me  ";
		
		String rtn1 = jc.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "for the last week";
		
		String rtn2 = jc.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public String solution(String s) {
		String answer = "";

		boolean isNextUpper = true;
		StringBuffer sb = new StringBuffer();
		
		for ( int inx=0; inx<s.length(); inx++ ) {
			char c = s.charAt(inx);
			if ( inx == 0 || isNextUpper ) {
				sb.append(Character.toUpperCase(c));
		        isNextUpper = false;
		    } else {
		        sb.append(Character.toLowerCase(c));
		    }
		 
		    if ( c == ' ') {
		        isNextUpper = true;
		    }
		}
		
		answer = sb.toString();
		
		return answer;

    } 
	// Jaden_Case3 과 같이 String -> 순서대로 Char 처리(대문자 변환 등.) 하면 몇몇 Test Case 오류 남
}
