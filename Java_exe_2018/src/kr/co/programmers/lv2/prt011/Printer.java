package kr.co.programmers.lv2.prt011;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		
		int[] p1 = { 2, 1, 3, 2 };
		int lo1 = 2; // 세번째라는 말 (0 부터)

	    int rtn1 = p.solution( p1 , lo1);
	    System.out.println( "[1] > " + rtn1 );
	    
		int[] p2 = { 1, 1, 9, 1, 1, 1 };
		int lo2 = 0; // 첫번째라는 말 (0 부터)

	    int rtn2 = p.solution( p2 , lo2);
	    System.out.println( "[2] > " + rtn2 );
	    
	}

	public int solution(int[] priorities, int location) {

		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		
		int loca = location; // 현재 위치
		for (int i=0; i<priorities.length; i++) {
			q.offer(priorities[i]); // 큐에 적재
		}
		
		//Iterator<Integer> iterator = q.iterator();
		
		int tmp_i = 0;
		int cnt = 0;
		while ( ! q.isEmpty() ) {
			
			tmp_i = q.poll();
			System.out.println(">" + tmp_i + " / " + loca );
			Iterator<Integer> it = q.iterator();
			boolean chk = true; // 중요도 높음
			
			while (it.hasNext()) {
				int tmp_ii = it.next();
				
				if (tmp_i <  tmp_ii) {
					chk = false; // 큐에 중요도 높은게 있다면 false
					break;
				}
			}
			if ( chk ) { //큐에 중요도 높은게 없다는 ..
				// 여기서 인쇄가 된다는 
				//loca--;
				cnt++;
				if (loca == 0) {
					// 내 출력 순서
					break;
				}
				
				
			} else {
				q.offer(tmp_i);
				//System.out.println(">>");
				if (loca == 0) {
					// 내 출력 순서인데 밀렸을 경우
					loca = q.size();
				}
			}
			loca--;
		}
		answer = cnt;
        return answer;
	}
}
