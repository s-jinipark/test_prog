package kr.co.programmers.lv2.prt6;

import java.util.LinkedList;
import java.util.Queue;

public class Truck_Passing_Bridge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge3 tpb = new Truck_Passing_Bridge3();
		
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
		
		// 인터넷 참조
		Queue<Truck> waiting = new LinkedList<>();
		Queue<Truck> bridge = new LinkedList<>();
		
		// 일단 waiting 에
		for (int i=0 ; i<truck_weights.length ; i++) {
			waiting.offer(new Truck(truck_weights[i], 0));
		}
		
		int time = 0;
		int totalWeight = 0;
		while(!waiting.isEmpty() || !bridge.isEmpty() ) {
			time++;
			if (!bridge.isEmpty()) {
				Truck t = bridge.peek();
				if (time - t.enterTime >= bridge_length) {
					totalWeight -= t.weight;
					bridge.poll();
				}
			}
			
			if (!waiting.isEmpty()) {
				if (totalWeight + waiting.peek().weight <= weight ) {
					Truck t = waiting.poll();
					totalWeight += t.weight;
					
					bridge.offer(new Truck(t.weight, time));
				}
			}
		}
		answer = time;
        return answer;
    }

}

class Truck {
	public int weight;
	public int enterTime;
	
	public Truck(int weight, int enterTime) {
		this.weight = weight;
		this.enterTime = enterTime;
	}
}