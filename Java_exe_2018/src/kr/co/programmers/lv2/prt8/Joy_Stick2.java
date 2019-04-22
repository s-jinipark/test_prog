package kr.co.programmers.lv2.prt8;

import java.util.Arrays;

public class Joy_Stick2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joy_Stick2 js = new Joy_Stick2();
		
		String s1 = "JEROEN";
		int rtn1 = js.solution( s1 );
		System.out.println("[1] > " + rtn1);

		String s2 = "JAN";
		int rtn2 = js.solution( s2 );
		System.out.println("[2] > " + rtn2);
	}

	public int solution(String name) {
        int answer = 0;
        /*
		▲ - 다음 알파벳
		▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
		◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
		▶ - 커서를 오른쪽으로 이동
        */
        int lcnt = 0, rcnt = 0, idx = 0;
        char[] larr = new char[name.length()]; // left
        char[] rarr = new char[name.length()]; // right
        Arrays.fill(larr, 'A'); 
        Arrays.fill(rarr, 'A');
        
        if(name.charAt(0) != 'A') {
        	int cnt = (name.charAt(0) - 'A' <= 13? name.charAt(0) - 'A' : 91 - name.charAt(0));
        	
        	rarr[0] = name.charAt(0); larr[0] = name.charAt(0);
        	rcnt = lcnt = cnt;
        	idx = 1;
        }
        
        for(int i = idx, j = name.length() - 1; i < name.length(); i++, j--) {	
        	if(!String.copyValueOf(rarr).equals(name)) {
        		rcnt++;
            		if(name.charAt(i) - 'A' <= 13) rcnt += name.charAt(i) - 'A';
            		else rcnt += 91 - name.charAt(i);
            		rarr[i] = name.charAt(i);
        	}
        	
        	if(!String.copyValueOf(larr).equals(name) && j > 0) {
            		lcnt++;
            		if(name.charAt(j) - 'A' <= 13) lcnt += name.charAt(j) - 'A';
            		else lcnt += 91 - name.charAt(j);        	        	
            		larr[j] = name.charAt(j);
        	}
        }     
        return Math.min(lcnt, rcnt);  
    
        
        //return answer;
    }

}
