package imsi.ipc.day01;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		int[] p = {93, 30, 55};
		int[] s = {1, 30, 5};
		
		int[] an = t.solution(p, s);
		
		System.out.println(an);
	}
	
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int size = progresses.length;
        int[] rtn = new int[size];
        int an_cnt = 1;
        List<Integer> list = new ArrayList<>();
        // setting
        for (int i=0; i< size ; i++) {
        	rtn[i] = progresses[i];
        }
        
        while (an_cnt <= size) {
        	// 증가
        	for (int i=0 ; i<size ; i++) {
        		if (rtn[i] > 0){
        		//	continue;
        		//} else {
        			rtn[i] +=  speeds[i];
        		}
        	}
        	
        	// count
        	int tmp_cnt = 0;
        	for (int j=an_cnt-1; j<size; j++) {
        		
        		if (rtn[j] > 0 ) { // 0 인 경우 pass
        			if (rtn[j] >= 100) {
        				System.out.println("- " + rtn[j]);
        				tmp_cnt++;
        				rtn[j] = -1; // 0으로 셋팅
        			} else {
        				break;
        			}
        		} 
        	}
        	
        	// 적립
        	if (tmp_cnt > 0) {
        		list.add(tmp_cnt);
        		an_cnt += tmp_cnt;
        	}
        }
        
        System.out.println(">" + list);
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
	

}
