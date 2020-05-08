package imsi.challenges.day14;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		int n = 6;
		int[] ti = {7, 10};
		
		long an = t.solution(n, ti);
		
		System.out.println(an);

	}
	
    public long solution(int n, int[] times) {
    	long answer = 0;
        int[] q = new int[times.length];
        int flag_cnt = 0;
        
    	while ( (n >= 0) && (flag_cnt < q.length) )  {
    		
    		//비어 있는 곳이 있는가?
    		int tmp_emp = emptyPoint(q, times);
    		if ( (tmp_emp >-1) && (n > 0) ) { // 대기자가 있을 경우만
    			q[tmp_emp] = times[tmp_emp]; // ref 값을 넣어 줌
    			n--;	
    		}
    		
    		// 0 아닌 곳은 모두 -1
    		flag_cnt = 0;
    		for (int i=0 ; i<q.length ; i++) {
    			if (q[i] > 0) {
    				q[i]--;
    			} else { // 0 인거 count
    				flag_cnt++;
    			}
    		}
    		
    		answer++; // 시간은 흐름
    		
    	}
    	
    	
        return answer;
    }

    public int emptyPoint( int[] q, int[] ref_ti) {
    	int rtn = -1; // index
    	int min = Integer.MAX_VALUE; 
    	boolean reserve = false;
    	
    	for (int i=0; i<q.length ; i++) {
    		if (q[i] == 0 ) { // 일단 비어 있는거 찾아
    			if (ref_ti[i]<min) { // ref 를 비교하여 작은 거 선택
    				rtn = i;
    				min = ref_ti[i]; 		
    				reserve = false;
    			}
    		} else { // 0 이 아닌 것 중에서 가장 짧은 것
    			if ( (q[i]+ref_ti[i]) <min ) { // ref 를 비교하여 작은 거 선택
    				rtn = -1;
    				min = q[i]+ref_ti[i];
    				reserve = true;
    			}
    		}
    	}
    	
    	if (reserve) {
    		rtn = -1; // 다음 기회에 
    	}
    	return rtn;
    }
} 
