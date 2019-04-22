package kr.co.programmers.lv2.prt7;

import java.util.ArrayList;
import java.util.Collections;

public class More_Spicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		More_Spicy ms = new More_Spicy();
		
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
    		al.add( scoville[i] );
    	}
        
        int cnt = 0;
        while ( test_b ) {
        	// sort
            Collections.sort(al);
            int tmp1 = al.get(0);
            int tmp2 = al.get(1);
            int tmp_new = 0;
            
            
        	for (int i =0; i< scoville.length; i++ ) {
        		System.out.println(">" + scoville[i]);	
        	}
            
            if ( tmp1 < K && tmp2 < K ) {
            	//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
            	tmp_new = tmp1 + (tmp2 * 2);
            	al.add(tmp_new);
            	al.remove(0);
            	al.remove(1);	
            	cnt++;

            } else {
            	test_b = false;
            }
            
        }
        
        answer = cnt;
        return answer;
    }
    // 실행 시간 초과
	// msg : 실행 시간이 10.0초를 초과하여 실행이 중단되었습니다. 실행 시간이 더 짧은 다른 방법을 찾아보세요.
}
