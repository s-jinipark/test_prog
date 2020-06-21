package kr.co.programmers.lv2.prt5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Func_Develop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func_Develop3 fd = new Func_Develop3();
		
		int[] prog1 = { 93, 30, 55 };
		int[] sped1 = { 1, 30, 5 };
		int[] rtn1 = fd.solution( prog1,  sped1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0; i< rtn1.length; i++) {
			System.out.println(">>" + rtn1[i]);
		}
		
	}

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		
		Queue<Func> q = new LinkedList<Func>();
		List<Integer> rtn = new ArrayList<>();
		// 적재
		for (int i=0; i<progresses.length ; i++) {
			q.offer(new Func(progresses[i], speeds[i]) );
		}
	
		int day =0;
		int fun_cnt = progresses.length;
		int tot = 0;
		
		// 종료조건
		while (tot < fun_cnt) {
			day++;	// 일자는 지나고 있음
			int sub_tot = 0;
			while (!q.isEmpty()) {
				
				// 100 % 되었는지 chek
				Func tmp_f = q.peek();
				System.out.println(">" +( tmp_f.prog + (tmp_f.speed * day) ) );
			
				if ((tmp_f.prog + (tmp_f.speed * day)) >= 100 ) {
					q.poll();
					sub_tot++;
				} else {
					// 미 완료이면 
					break;
				}
				
			}
			tot += sub_tot;
			System.out.println("-> " + sub_tot);
			if (sub_tot > 0) {
				rtn.add(sub_tot);
			}
		}
		
		answer = new int[rtn.size()];
		for (int i=0; i<rtn.size() ; i++) {
			answer[i] = rtn.get(i);
		}
        return answer;
    }
    
}

class Func {
	int prog;
	int speed;
	
	public Func(int prog, int speed) {
		this.prog = prog;
		this.speed = speed;
	}
}
