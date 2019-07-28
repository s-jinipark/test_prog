package kr.co.programmers.lv1.prt1;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class Player_Not_Finished4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_Not_Finished4 pnf = new Player_Not_Finished4();
		
		String [] participant1 = new String [] { "leo", "kiki", "eden" };	
		String [] completion1 = new String [] { "eden", "kiki" };	
		String rtn1 = "";
		//----------
		String [] participant2 = new String [] { "marina", "josipa", "nikola", "vinko", "filipa" };	
		String [] completion2 = new String [] { "josipa", "filipa", "marina", "nikola" };	
		String rtn2 = "";
		//----------
		String [] participant3 = new String [] { "mislav", "stanko", "mislav", "ana" };	
		String [] completion3 = new String [] { "stanko", "ana", "mislav" };	
		String rtn3 = "";
		//----------
		rtn1 = pnf.solution(participant1, completion1);
		System.out.println("[1] : " + rtn1);
		//----------
		rtn2 = pnf.solution(participant2, completion2);
		System.out.println("[2] : " + rtn2);
		//----------
		rtn3 = pnf.solution(participant3, completion3);
		System.out.println("[3] : " + rtn3);	
	}

	public String solution(String[] participant, String[] completion) {
		// TODO Auto-generated method stub

	    String rtn_val = "";

	    // 각각 소트 -> 비교 ->> 어긋나는 경우 당첨
	    Arrays.sort(participant);
	    Arrays.sort(completion);
	    
	    boolean find = false;
	    
	    // 완주자가 1 적다고 하니 -> 완주자 기준
	    for (int i=0 ; i< completion.length ; i++) {
	    	
	    	if ( !( participant[i].equals(completion[i]) ) ){ // 같지 않다
	    		rtn_val = participant[i];
	    		find = true;
	    		break;
	    	}
	    }
	    
	    if (!(find)) {
	    	rtn_val = participant[participant.length-1]; // 마지막
	    }
	   
		return rtn_val;
	}
}
