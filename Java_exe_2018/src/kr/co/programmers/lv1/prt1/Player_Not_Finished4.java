package kr.co.programmers.lv1.prt1;

import java.util.HashMap;
import java.util.Map;

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
		// ** 재연습
		String rtn_val = "";
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for (int i=0 ; i<participant.length ; i++) {
			int tmp_i = m.getOrDefault(participant[i], 0);
			//System.out.println(">" + tmp_i);
			m.put(participant[i], tmp_i+1);
		}
		//System.out.println(">" + m);
		// 완주
		for (int i=0 ; i<completion.length ; i++) {
			int tmp_i = m.get(completion[i]);
			if (tmp_i == 1) {
				m.remove(completion[i]);
			} else {
				m.put(completion[i], tmp_i-1);
			}
		}
		System.out.println("->" + m);
		return rtn_val;
	}
}
