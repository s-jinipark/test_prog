package kr.co.programmers.lv1.prt5;

public class Gym_Suit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gym_Suit gs = new Gym_Suit();

		int n1 = 5;
		int[] lost1 = {2, 4};
		int[] reserve1 = {1, 3, 5};
		int rtn1 = 0;
		
		rtn1 = gs.solution(n1, lost1, reserve1);
		System.out.println("[1] > " + rtn1);

		int n2 = 5;
		int[] lost2 = {2, 4};
		int[] reserve2 = {3};
		int rtn2 = 0;
		
		rtn2 = gs.solution(n2, lost2, reserve2);
		System.out.println("[2] > " + rtn2);

		int n3 = 3;
		int[] lost3 = {3};
		int[] reserve3 = {1};
		int rtn3 = 0;
		
		rtn3 = gs.solution(n3, lost3, reserve3);
		System.out.println("[3] > " + rtn3);
		
	}

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n;
        int tmp_resv = 0;	
    	for (int i=0; i<lost.length; i++) {
    		int tmp_pre = lost[i]-1;
    		int tmp_next = lost[i]+1;
    		  		
    		for (int j=0; j<reserve.length; j++) {
    			if (reserve[j] >0) {
    				
	    			if (lost[i] == reserve[j]) {
	    				reserve[j] = 0; // 한번 썼으므로 다음엔 못쓰게
	    				break; // 동일하면 다음 진행
	    			}
	    			if (tmp_pre == reserve[j]) {
	    				reserve[j] = 0;
	    				tmp_resv++;
	    				break; // 나보다 앞번호에게 빌릴 수 있으면 다움 진행
	    			}
	    			if (tmp_next == reserve[j]) {
	    				reserve[j] = 0;
	    				tmp_resv++;
	    				break; // 나보다 뒷번호에게 빌릴 수 있으면 다움 진행
	    			}
    			}
    		}
    	}
    	// 초기 인원 - 잃어버린 인원 + 빌린 인원
    	answer = answer - lost.length + tmp_resv;
        
        
        return answer;
	}
}
