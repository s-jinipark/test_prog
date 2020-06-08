package kr.co.programmers.lv1.prt1;

import java.util.Arrays;

public class Player_Not_Finished2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player_Not_Finished2 pnf = new Player_Not_Finished2();
		
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

		String rtn_val = "";
		
		// 각각 소트 -> 비교 ->> 어긋나는 경우 당첨
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		// completion 이 하나 적음 (-1)
		// 완주자가 1 적다고 하니 -> 완주자 기준
		for (int i = 0; i<participant.length -1 ; i++) {
			//System.out.println(">" + participant[i] + "/" + completion[i]);
			// 비교하여 다를 경우 : participant 이 정답
			// 모두 동일하면 : 마지막 participant 이 정답
			if ( !(participant[i].equals(completion[i])) ) {
				rtn_val = participant[i];
				break;
			}
		}
        // 모두 동일한 경우
		if ( "".equals(rtn_val))  { // 아직도 발견이 안 됐다면
			rtn_val = participant[participant.length-1]; // 마지막 value
		}
		
		return rtn_val;
	}
}
