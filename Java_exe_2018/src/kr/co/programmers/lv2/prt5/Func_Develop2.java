package kr.co.programmers.lv2.prt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Func_Develop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func_Develop2 fd = new Func_Develop2();
		
		int[] prog1 = { 93, 30, 55 };
		int[] sped1 = { 1, 30, 5 };
		int[] rtn1 = fd.solution( prog1,  sped1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0; i< rtn1.length; i++) {
			System.out.println(">>" + rtn1[i]);
		}
		
	}

	public int[] solution(int[] progresses, int[] speeds) {
		//int[] answer = {};
		
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
		
        for(int i = 0; i < progresses.length; i++) {
            q.add((100-progresses[i])%speeds[i] == 0? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1);
        	/*
        	// 100 일 경우 +1개 초과 계산 
			int tmp_p = progresses[i];
			int tmp_s = speeds[i];
			int cnt = 0;
			while (tmp_p <=  100) {
				tmp_p += tmp_s;
				cnt++;
			} 
			q.add( cnt );
			*/
        }
        
		//while ( ! q.isEmpty() ) {
		//	System.out.println(">" + q.poll() );
		//}
		
        List<Integer> result = new ArrayList<Integer>();
        int standard = q.poll();
        int cnt = 1;
        while(!q.isEmpty()) {
            int num = q.poll();
            if(standard >= num) {
                cnt++;
            }else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }
        

        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
		
        return answer;
    }
    
}
