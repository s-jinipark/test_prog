package kr.co.programmers.lv2.prt31;

import java.util.Arrays;

public class Max_and_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max_and_Min mam = new Max_and_Min();
		
		String s1 = "1 2 3 4";
		String rtn1 = mam.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "-1 2 -3 -4";
		String rtn2 = mam.solution( s2  );
		System.out.println("[2] > " + rtn2);
		
	}

	public String solution(String s) {
		String answer = "";
		
		String[] test = s.split(" " );
		int[] test_i = new int[test.length];
		//Arrays.sort(test);
		for (int i=0 ; i< test.length; i++) {
			//System.out.println(">" + test[i]);
			test_i[i] = Integer.valueOf(test[i]);
		}
		Arrays.sort(test_i);
		
		for (int i=0 ; i< test_i.length; i++) {
			System.out.println(">" + test_i[i]);
			
		}
		// min max ¸¸µé±â
		answer = test_i[0] + " " + test_i[test_i.length-1];
		return answer;

    } 
	// 
}
