package kr.co.programmers.lv2.prt7;

import java.util.PriorityQueue;
import java.util.Queue;

public class More_Spicy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		More_Spicy3 ms = new More_Spicy3();
		
		int[] s1 = { 1, 2, 3, 9, 10, 12	};
		int k1 = 7;

		int rtn1 = ms.solution( s1,  k1);
		System.out.println("[1] > " + rtn1);

	}

	public int solution(int[] scoville, int K) {
        int answer = -1;
        
        int s1 =0;
        int s2 = 0;
        int temp =0;
        int times = 0;
        
        Queue<Integer> pq = new PriorityQueue<>(scoville.length);

        for (int i =0; i< scoville.length; i++ ) {

        	pq.offer( scoville[i] ); 
        
    	}
        
        //int cnt = 0;
        while ( pq.size() > 1 ) {

        	if ( pq.peek() >= K ) {
        		answer = times;
        		break;
        	} 

        	s1 = pq.poll();
        	s2 = pq.peek();
        	temp = s1 + (s2*2);
        	pq.offer(temp);
        	times++;
            
        	// 마지막 큐에 하나 남은 값이 K 가 넘는지 확인
            if (pq.poll() >= K)
            	answer = times;
        }
        
        return answer;
    }
    // 
}
