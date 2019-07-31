package kr.co.programmers.lv1.prt5;

import java.util.ArrayList;
import java.util.Collections;

public class Gym_Suit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gym_Suit4 gs = new Gym_Suit4();

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

		//int n3 = 3;
		//int[] lost3 = {3};
		//int[] reserve3 = {1};
		
		//int n3 = 24;
		//int[] lost3 = {12, 13, 16, 17, 19, 20, 21, 22};
		//int[] reserve3 = {1,22, 16, 18, 9, 10};	
		
		int n3 = 5;
		int[] lost3 = {2, 3};
		int[] reserve3 = {5, 3, 1};	// 3번은 빌려줄 수가 없음
		int rtn3 = 0;
		
		rtn3 = gs.solution(n3, lost3, reserve3);
		System.out.println("[3] > " + rtn3);

		int n4 = 5;
		int[] lost4 = {2, 4, 5};
		int[] reserve4 = {1, 4}; 
		int rtn4 = 0;
		
		rtn4 = gs.solution(n4, lost4, reserve4);
		System.out.println("[4] > " + rtn4);
		
	}

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;  // n 은 전체 학생 수
        int bollowed = 0;
        
        // 1. 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다        
        // 2. 도난 당한 번호 -> 여벌 앞 먼저 보고 , 뒷번호 확인
        

        ArrayList<Integer> a_lost = new ArrayList<>();
        ArrayList<Integer> a_resv = new ArrayList<>();
        
       	for(int i : lost) {
       		a_lost.add(i);
       	}
       	for(int j : reserve) {
       		a_resv.add(j);
       	}
       	

       	// 잃어버린 사람 중 여분의 옷을 가지고 있는 경우 먼저 처리
       	// 뒤에서 부터 loop 필요 **
       	for (int i=a_lost.size()-1 ; i>=0 ; i--) {
       		int tmp = a_lost.get(i);
       		
       		for (int j=a_resv.size()-1 ; j>=0 ; j--) {
       			if (tmp == a_resv.get(j)) {
	       			// 양쪽 쌍으로 지워준다
	       			a_lost.remove(i);
	       			a_resv.remove(j);
	       			bollowed++;
	       			break;
       			}
       		}
       	}
       	//System.out.println(a_lost);
       	//System.out.println(a_resv);
       	
       	// 앞번호 부터 검색 후 처리
       	Collections.sort(a_lost);
    	Collections.sort(a_resv);
    	
    	for (int i=0 ; i<a_lost.size() ; i++) {
    		int tmp = a_lost.get(i);
    		int prev = tmp-1;
    		int next = tmp+1;
    		
    		for (int j=0; j<a_resv.size() ; j++) {
    			int tmp2 = a_resv.get(i);
    			if ( tmp2 == prev ) {	// 앞번호 먼저
    				a_resv.remove(j);
    				bollowed++;
	       			break;
    			}
    			if ( tmp2 == next ) {
    				a_resv.remove(j);
    				bollowed++;
	       			break;
    			}
    		}
    	}
    	
    	answer = answer - lost.length + bollowed;
    	
        return answer;
	}
}
