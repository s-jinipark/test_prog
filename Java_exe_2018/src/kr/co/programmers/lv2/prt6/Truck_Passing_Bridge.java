package kr.co.programmers.lv2.prt6;

import java.util.ArrayList;

public class Truck_Passing_Bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck_Passing_Bridge tpb = new Truck_Passing_Bridge();
		
		int bl1 = 2;
		int w1 = 10;
		int[] tw1 = { 7,4,5,6 };

		int rtn1 = tpb.solution( bl1,  w1,  tw1);
		System.out.println("[1] > " + rtn1);

		
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		//Queue<Integer> q1 = new LinkedList<>();
		//Queue<Integer> q2 = new LinkedList<>();
		//Queue<Integer> q3 = new LinkedList<>();
		
		// al1 -> al2 -> al3
		//  q1 ->  q2 ->  q3
		for (int i=0; i< truck_weights.length; i++) {
			al1.add(truck_weights[i]);
			//q1.offer(truck_weights[i]);
		}
		
		boolean procs = true;
		int time_cnt = 0;

		int tmp_i = 0;
		int idx = 0;
		int proc_sum = 0;
		
		while (time_cnt <100) {
			
			while ( !al1.isEmpty() ) { // 대기열이 비워질 때 까지

				// 다리를 건너는 트럭 유무 및 무게 함
				for (int i=0; i<al2.size() ; i++) {
					proc_sum += al2.get(i);
				}
				
				if ( proc_sum < weight ) { // 한도를 넘지 않았을 경우 대기열에서 뽑아옴
					tmp_i = al1.get(idx);
					al2.add(tmp_i);
				} else {
					System.out.println(">>");

					break;
				}
				
			} 

			System.out.println(">" + tmp_i );
			time_cnt++;
		}
        return answer;
    }
    // 안됨.
}
