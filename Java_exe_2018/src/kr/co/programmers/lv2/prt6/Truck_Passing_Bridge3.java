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
		
		int time = 0;
		Queue<Truck> bridge = new LinkedList<>();
		int lastEnterTruckIndex = 0;
		int currentBridgeWeight = 0;
		int truckNumber = truck_weights.length;  // Æ®·° ¼ö
		
		while (lastEnterTruckIndex < truckNumber) {
			time++; 
			
			
		}
		
		
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