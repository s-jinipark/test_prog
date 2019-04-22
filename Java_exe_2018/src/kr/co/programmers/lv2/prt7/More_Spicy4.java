package kr.co.programmers.lv2.prt7;

import java.util.PriorityQueue;

public class More_Spicy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		More_Spicy4 ms = new More_Spicy4();
		
		int[] s1 = { 1, 2, 3, 9, 10, 12	};
		int k1 = 7;

		int rtn1 = ms.solution( s1,  k1);
		System.out.println("[1] > " + rtn1);

	}

	public int solution(int[] scoville, int K) {
        int answer = 0;
        

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        //우선순위 큐에 음식 담아주기
        for (int i : scoville) {
            priorityQueue.add(i);
        }
        
        //가장 덜 매운 음식의 스코빌 지수가 K보다 작다면 반복한다.
        while (!priorityQueue.isEmpty() && priorityQueue.peek() < K){
            Integer lessSpicy = priorityQueue.poll();
            if (!priorityQueue.isEmpty()) {
                Integer secondLessSpicy = priorityQueue.poll();
                //가장 덜 매운 음식 2가지를 섞고, 다시 큐에 넣는다.
                priorityQueue.add(lessSpicy + secondLessSpicy * 2);
                answer++;
            } else {
                return -1;
            }
        }
        
        return answer;
    }
    // 
}
