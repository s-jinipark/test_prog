package kr.co.programmers.lv2.prt012;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Make_Big_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Big_Number2 mbn = new Make_Big_Number2();
		
		String n1 = "1924";
		int k1 = 2;
		
	    String rtn1 = mbn.solution( n1 , k1);
	    System.out.println( "[1] > " + rtn1 );
	    
		String n2 = "1231234";
		int k2 = 3;
		
	    String rtn2 = mbn.solution( n2 , k2);
	    System.out.println( "[2] > " + rtn2 );   
	    
		String n3 = "4177252841";
		int k3 = 4;
		
	    String rtn3 = mbn.solution( n3 , k3);
	    System.out.println( "[3] > " + rtn3 );   
	    
	}

	public String solution(String number, int k) {

        int idx = 0;
        char max;
		StringBuilder answer = new StringBuilder();
	
		if(number.charAt(0) == '0') return "0";
		for(int i = 0; i < number.length() - k; i++) {
			max = '0';
			for(int j = idx; j <= k + i; j++) {
		        	if(max < number.charAt(j)) {
		        		max = number.charAt(j); idx = j + 1;
		        	}
			}			
			answer.append(max);
		}
        return answer.toString();
	}
}
