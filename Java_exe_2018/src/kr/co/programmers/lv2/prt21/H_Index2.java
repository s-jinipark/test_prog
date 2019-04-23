package kr.co.programmers.lv2.prt21;

import java.util.Arrays;

public class H_Index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_Index2 hi = new H_Index2();
		
		int[]  c1 = { 3, 0, 6, 1, 5 };
		
		int rtn1 = hi.solution(c1 );
		System.out.println("[1] > " + rtn1);
	}

	public int solution(int[] citations) {
		int answer = 0;
        
		Arrays.sort(citations);
		
		
		for (int i=0; i <citations.length ; i++) {

			int smaller = Math.min(citations[i] , citations.length-i);
			answer = Math.max(answer, smaller);
		}
		
        
        return answer;
    }
    
}
