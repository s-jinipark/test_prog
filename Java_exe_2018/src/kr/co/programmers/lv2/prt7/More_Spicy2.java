package kr.co.programmers.lv2.prt7;

import java.util.ArrayList;
import java.util.Collections;

public class More_Spicy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		More_Spicy2 ms = new More_Spicy2();
		
		int[] s1 = { 1, 2, 3, 9, 10, 12	};
		int k1 = 7;

		int rtn1 = ms.solution( s1,  k1);
		System.out.println("[1] > " + rtn1);

	}

	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        boolean test_b = true;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0; i< scoville.length; i++ ) {
    		//System.out.println(">" + scoville[i]);	
        	if ( scoville[i] < K) { // 대상만 고른다
        		al.add( scoville[i] ); 
        	}
    	}
        
        int cnt = 0;
        while ( test_b ) {
            int tmp1 = 0;
            int tmp2 = 0;
            int tmp_new = 0;
         	// sort
            Collections.sort(al);
        	if (al.size() < 2) {
        		break;
        	} else {
        		tmp1 = al.get(0);
        		tmp2 = al.get(1);
        	}
            System.out.println(">>" + al.size());
            
            if ( tmp1 < K && tmp2 < K ) {
            	//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
            	tmp_new = tmp1 + (tmp2 * 2);
            	//al.add(tmp_new);
            	// 다시 넣을 필요가 없음
            	// 아니 K 보다 작으면 다시 넣어 준다
            	if (tmp_new < K ) al.add(tmp_new);
            	al.remove(1);
            	al.remove(0);	// 0 -> 1 순서로 지우니 오류남 
            	cnt++;

            } else if (tmp1 < K || tmp2 > K){
            	// 하나만 남은 경우
            	cnt = -1;
            	test_b = false;
            	
            } else {
            	test_b = false;
            }
            
        }
        
        answer = cnt;
        return answer;
    }
    // 실행 시간 초과
}
