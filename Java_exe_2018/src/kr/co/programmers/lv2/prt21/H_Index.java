package kr.co.programmers.lv2.prt21;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H_Index hi = new H_Index();
		
		int[]  c1 = { 3, 0, 6, 1, 5 };
		
		int rtn1 = hi.solution(c1 );
		System.out.println("[1] > " + rtn1);
	}

	public int solution(int[] citations) {
		int answer = 0;
        //Arrays.sort(citations);
        for (int i=citations.length; i>0 ; i--) {
        	System.out.println(i);
        	int cnt =0;
        	for (int j=0; j<citations.length ; j++) {
        	
        		if ( citations[j] >= i) {
        			cnt++;
        		}
        	}
        	if (cnt >= i) {
        		System.out.println(cnt + " / " + i );
        		answer = cnt;
        		break;
        	}
        }
        
        return answer;
    }
    
}
