package kr.co.programmers.lv1.prt5;

import java.util.HashSet;
import java.util.Iterator;

public class Gym_Suit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gym_Suit3 gs = new Gym_Suit3();

		int n1 = 5;
		int[] lost1 = {2, 4};
		int[] reserve1 = {1, 3, 5};
		int rtn1 = 0;
		
		rtn1 = gs.solution(n1, lost1, reserve1);
		System.out.println("[1] > " + rtn1);

		int n2 = 5;
		int[] lost2 = {2, 4};
		int[] reserve2 = {3};
		int rtn2 = 0;
		
		rtn2 = gs.solution(n2, lost2, reserve2);
		System.out.println("[2] > " + rtn2);

		//int n3 = 3;
		//int[] lost3 = {3};
		//int[] reserve3 = {1};
		
		//int n3 = 24;
		//int[] lost3 = {12, 13, 16, 17, 19, 20, 21, 22};
		//int[] reserve3 = {1,22, 16, 18, 9, 10};	
		
		int n3 = 5;
		int[] lost3 = {2, 3};
		int[] reserve3 = {5, 3, 1};	// 3번은 빌려줄 수가 없음
		int rtn3 = 0;
		
		rtn3 = gs.solution(n3, lost3, reserve3);
		System.out.println("[3] > " + rtn3);
		
	}

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;
        //HashSet 이용
        HashSet<Integer> hs_lost = new HashSet<>();
        HashSet<Integer> hs_reserve = new HashSet<>();
    
        for (int i =0; i< lost.length; i++) {
        	hs_lost.add(lost[i]);
        }
        for (int j =0; j< reserve.length; j++) {
        	hs_reserve.add(reserve[j]);
        }
                
        Iterator<Integer> it_lost = hs_lost.iterator();
        int tmp_resv = 0;
        
        // 여벌의 옷을 가지고 있으나 , 도난 당했을 경우 => 빌려줄 수 없다
        // 먼저 처리해서 제외 시킴
        System.out.println(">" + hs_reserve.toString() );
        int tmp_org_cnt = hs_reserve.size();
        hs_reserve.removeAll(hs_lost);
        System.out.println(">>" + hs_reserve.toString() );
        int tmp_new_cnt = hs_reserve.size();
        // 갯수에 반영
        tmp_resv = tmp_resv  + (tmp_org_cnt - tmp_new_cnt);
        System.out.println("=" + tmp_resv);
        
        while (it_lost.hasNext()) {
        	int val = it_lost.next();
        	int tmp_pre = val - 1;
        	int tmp_nxt = val + 1;
        	//System.out.println(al_reserve.size() + "/" + tmp_resv);
        	
        	if (hs_reserve.contains(val)) {
        		hs_reserve.remove( (Integer)val ); // 여분을 사용함
        		tmp_resv++;
        		continue;
        	} 
        	
        	if (hs_reserve.contains(tmp_pre)) {
        		hs_reserve.remove( (Integer)tmp_pre ); // 여분을 사용함
        		tmp_resv++;
        		continue;
        	} 
        	if (hs_reserve.contains(tmp_nxt)) {
        		hs_reserve.remove( (Integer)tmp_nxt ); // 여분을 사용함
        		tmp_resv++;
        		continue;
        	} 
        	
        }
        // 초기 인원 - 잃어버린 인원 + 빌린 인원
    	answer = answer - lost.length + tmp_resv;	
        return answer;
	}
}
