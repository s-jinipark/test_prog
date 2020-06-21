package kr.co.programmers.lv2.prt6;

import java.util.LinkedList;
import java.util.Queue;
public class Truck_Passing_Bridge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge4 tpb = new Truck_Passing_Bridge4();
		
		int bl1 = 2;
		int w1 = 10;
		int[] tw1 = { 7,4,5,6 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10 };

//		int bl1 = 100;
//		int w1 = 100;
//		int[] tw1 = { 10,10,10,10,10,10,10,10,10,10 };
		
		int rtn1 = tpb.solution( bl1,  w1,  tw1);
		System.out.println("[1] > " + rtn1);

		
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		// 재차 시도
		// 큐 2개 생성 : 건너는 중, 대기하는 중 
		// Truck 은 이전 만들어 논 class 참조
		Queue<Truck> going_q = new LinkedList<Truck>();
		Queue<Truck> waiting_q = new LinkedList<Truck>();
		
		// waiting 에 적재
		for (int i=0 ; i<truck_weights.length ; i++ ) {
			waiting_q.offer(new Truck(truck_weights[i], 0) );
		}
		//System.out.println("->" + waiting_q);
		// 트럭의 총 수를 cnt 하기도 했으나
		// going_q 나 waiting_q 가 모두 비워질 때 까지
		int time =0;
		int totalWeight = 0;
		while (!going_q.isEmpty() || !waiting_q.isEmpty() ) {
			time++; // 시간이 흐름 (시작하자 마자 1초?)
			
			// 견딜 수 있는 무게 까지 넣어 준다
			// 여기서 while 은 쓰나 했으나
			// 1초에  1씩 움직이고 (문제에는 자세이 안 나왔으나 한대 씩) 
			if (!waiting_q.isEmpty() ) {
				//Truck tmp_truck = waiting_q.peek();
				if ( waiting_q.peek().weight + totalWeight <= weight ) {
					// 무게가 허용범위 이면 waiting 에서 빼고 going 에 넣어 준다
					Truck tmp_truck = waiting_q.poll();
					totalWeight += tmp_truck.weight;
					going_q.offer(new Truck(tmp_truck.weight, time));
				}
			}
			
			// going 에서 제거하는 프로세스도 ...
			if (!going_q.isEmpty() ) {
				// 현재 시간과 진입한 시간의  차이가 bridge_length 이면 큐에서 뺀다
				// 여기도 2대가 빠지지는 못함 (들어올 때도.. 하나씩이므로)
				if (time - going_q.peek().enterTime >= bridge_length) {
					// 큐에서 제거하고 총 무게에서 제거
					Truck tmp_truck = going_q.poll();
					totalWeight -= tmp_truck.weight;
					
					
				}
				
			}
			
			// 순서 바꾸니 결과 가 달라 짐 .. 헐
//			if (!waiting_q.isEmpty() ) {
//				//Truck tmp_truck = waiting_q.peek();
//				if ( waiting_q.peek().weight + totalWeight <= weight ) {
//					// 무게가 허용범위 이면 waiting 에서 빼고 going 에 넣어 준다
//					Truck tmp_truck = waiting_q.poll();
//					totalWeight += tmp_truck.weight;
//					going_q.offer(new Truck(tmp_truck.weight, time));
//				}
//			}
			
		}
		answer = time;
        return answer;
    }

}

