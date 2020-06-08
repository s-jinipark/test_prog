package kr.co.programmers.lv2.prt6;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Passing_Bridge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge2 tpb = new Truck_Passing_Bridge2();
		
//		int bl1 = 2;
//		int w1 = 10;
//		int[] tw1 = { 7,4,5,6 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10 };

		int bl1 = 100;
		int w1 = 100;
		int[] tw1 = { 10,10,10,10,10,10,10,10,10,10 };
		
		int rtn1 = tpb.solution( bl1,  w1,  tw1);
		System.out.println("[1] > " + rtn1);

		
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		// 인터넷 참조해서 진행
		int[] endTime = new int[truck_weights.length];
		
		Queue<Integer> onBridge = new LinkedList<Integer>(); // 
		int time = 0;
		int cur = 0;
		while (true) {
			// 도착한 트럭 제거
			if (!onBridge.isEmpty() && endTime[onBridge.peek()] == time) {
				weight += truck_weights[onBridge.poll()];
			}
			
			// 대기하는 트럭 추가
			if (cur < truck_weights.length && truck_weights[cur] <= weight) {
				onBridge.add(cur);
				endTime[cur] = time + bridge_length;
				weight -= truck_weights[cur] ;
				cur++;
			}
			
			time++;
			if (onBridge.isEmpty()) {
				break;
			}
		}
		answer = time;
		
		// 두번째  시도
		// 진행 중인 트럭을 저장할  queue 와 남은 len 을 계산할 배열로...
//		Queue<Integer> q1 = new LinkedList<>(); // 진행 중
//		Queue<Integer> q2 = new LinkedList<>(); // length 
//		
//		int[] remained_len = new int[truck_weights.length];
//		
//		boolean flag = true;
//		int cnt = 0; // 경과시간
//		int cur_idx = 0; // 현재 위치
//		int tmp_weight = 0; // 임시 무게 합
//		
//		while (flag) {
//			
//			// 현재 위치의 weight를 length 를 진행 중
//			while (tmp_weight <= weight) {
//				q1.offer( truck_weights[cur_idx] );
//				remained_len[cur_idx] = bridge_length;
//				tmp_weight += truck_weights[cur_idx];
//			}
//			
//			
//			cnt++;	// 경과시간
//			
//		}
		
		
		
//		boolean procs = true;
//		int time_cnt = 0;
//
//		int tmp_i = 0;
//		int idx = 0;
//		int proc_sum = 0;
//		
//		while (time_cnt <100) {
//			
//			while ( !al1.isEmpty() ) { // 대기열이 비워질 때 까지
//
//				// 다리를 건너는 트럭 유무 및 무게 함
//				for (int i=0; i<al2.size() ; i++) {
//					proc_sum += al2.get(i);
//				}
//				
//				if ( proc_sum < weight ) { // 한도를 넘지 않았을 경우 대기열에서 뽑아옴
//					tmp_i = al1.get(idx);
//					al2.add(tmp_i);
//				} else {
//					System.out.println(">>");
//
//					break;
//				}
//				
//			} 
//
//			System.out.println(">" + tmp_i );
//			time_cnt++;
//		}
        return answer;
    }
    // 
		
}
