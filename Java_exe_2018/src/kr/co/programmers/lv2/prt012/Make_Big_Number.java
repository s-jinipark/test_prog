package kr.co.programmers.lv2.prt012;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Make_Big_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Big_Number mbn = new Make_Big_Number();
		
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

		String answer = "";
		
		// k 개의 수 제거  => 적은 순으로 제거
		// 정렬 후 적은 수 제거
		char[] test = number.toCharArray();
		char tmp = ' ';
		
		for (int i=0 ; i< test.length-1 ; i++) {
			for (int j = i+1 ; j < test.length ; j++) {
				if (test[i] < test[j]) {
					tmp = test[i];
					test[i] = test[j];
					test[j] = tmp;
				}
			}
		}

		for (int i = 0 ; i< test.length-k ; i++) {
			System.out.println(">" + test[i]);
		
			answer += test[i];
			
		}
        return answer;
	}
}
