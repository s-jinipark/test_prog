package kr.co.programmers.lv1.prt10;

import java.util.Arrays;

public class String_Descending2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Descending2 sd = new String_Descending2();
		String s1 = "Zbcdefg";
		String rtn1 = "";
		rtn1 = sd.solution( s1  );
		System.out.println("[1] > " + rtn1);
	}

	public String solution(String s) {
	    String answer = "";

	    char[] test = s.toCharArray();
	    //for (int i=0; i<test.length; i++) {
	    //	System.out.println(">"+test[i]);
	    //}
	    
	    Arrays.sort(test);
	    
	    
	    for (int k=test.length-1; k>=0; k--) {
	    	answer += test[k];
	    }
	    return answer;
	}
}
