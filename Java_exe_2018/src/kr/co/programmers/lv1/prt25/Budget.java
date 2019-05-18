package kr.co.programmers.lv1.prt25;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Budget b = new Budget();

		int[] d = {1,3,2,4,5};	//부서별 신청 금액
		int budget = 9;  //예산
	    int rtn1 = b.solution( d , budget );
	    System.out.println("[1] > " + rtn1);
		int[] d2 = {2,2,3,3};	//부서별 신청 금액
		int budget2 = 10;  //예산
	    int rtn2 = b.solution( d2 , budget2 );
	    System.out.println("[2] > " + rtn2);
	    
	}

	public int solution(int[] d, int budget) {
		int answer = 0;
		int test = 0;
		int cnt = 0;
		Arrays.sort(d);
		for (int i = 0; i< d.length ; i++) {
			test += d[i];
			if (budget < test) {
				break;
			} else {
				cnt++;
			}
		}
		answer = cnt;
	    return answer;
	}
}
