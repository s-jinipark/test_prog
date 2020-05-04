package imsi.challenges.day08;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
				
		//int[] prior = {2, 1, 3, 2};
		//int loc = 2;
		int[] prior = {1, 1, 9, 1, 1, 1};
		int loc = 0;
		
		int an = t.solution(prior, loc);
		
		System.out.println(an);

	}
	
	public int solution(int[] priorites,  int location) {
		int answer = 0;
		int print_order=0;
		// 큐 선언
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> que_idx = new LinkedList<Integer>();  // 순서
		
		// 적재
		for (int i=0; i<priorites.length ; i++) {
			que.add(priorites[i]);
			que_idx.add(i);  // 순서
		}
		
        while(!que.isEmpty()) {
        	//꺼낸다
        	int tmp = que.poll();
        	int tmp_idx = que_idx.poll();
            //System.out.println(">" + tmp );
            
            // 우선 순위 높은 거 검사
//    		for(int i = 0; i<que.size(); i++) {
//    			System.out.println(que.peek());
//    		}
            // --> X , 나머지를 loop 돌면서 검사하고 싶었으나
            // 다음 값 밖에 안 나옴
            
            // 그래서 priorites 배열을 이용
            boolean print = true;
    		for(int i = 0; i<priorites.length; i++) {
    			if ( tmp < priorites[i] ) {
    				// 다시 넣는다
    				que.offer(tmp);
    				que_idx.offer(tmp_idx);
    				print = false;
    				break;
    			} 
    		}
            
    		if (print) {
    			//System.out.println(">>" + tmp);
    			priorites[tmp_idx] = -1;
    			print_order++;
    			// 시작 시 지정한 location 과 일치 하는지 ?
    			if (location == tmp_idx) {
    				answer = print_order;
    			}
    		}
        }
        
		return answer;
    }


	
}
