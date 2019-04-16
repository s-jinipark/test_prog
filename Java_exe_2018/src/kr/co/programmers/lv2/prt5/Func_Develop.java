package kr.co.programmers.lv2.prt5;

import java.util.ArrayList;

public class Func_Develop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func_Develop fd = new Func_Develop();
		
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
		ArrayList<Integer> al = new ArrayList<>();
		
		int[] test = new int[progresses.length];
		
		//100 을 넘게 되는 일수
		for (int i=0; i< progresses.length; i++) {
			
			int tmp_p = progresses[i];
			int tmp_s = speeds[i];
			int cnt = 0;
			while (tmp_p <=  100) {
				tmp_p += tmp_s;
				cnt++;
			} 
			test[i] = cnt;
		}
		// 종료일자를 맞추어줌
		for (int i=0; i< test.length-1 ; i++) {
			//System.out.println("0>" + test[i]);
			
			if ( test[i] > test[i+1] ) {
				 test[i+1] = test[i] ;
			}
		}
		
		int tmp = test[0] ; //초기값
		int cnt = 0;

		for (int i=0; i< test.length; i++) {
			System.out.println(">" + test[i] + " /  " + tmp);
			
			if (tmp != test[i] ) {
				tmp =  test[i];
				al.add(cnt);
				cnt = 0;
				if (i == test.length-1) { // 마지막일 경우 처리
					al.add(1);
				}
			} else {
				cnt++;
				if (i == test.length-1) { // 마지막일 경우 처리
					al.add(cnt);
				}
			}
		}
		

		int[] answer = new int[al.size()];
		
		for (int i=0 ; i< al.size(); i++) {
			answer[i] = al.get(i);
		}
		
        return answer;
    }
    
}
