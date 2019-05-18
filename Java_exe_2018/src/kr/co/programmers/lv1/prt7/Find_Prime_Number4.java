package kr.co.programmers.lv1.prt7;

import java.util.ArrayList;

public class Find_Prime_Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number4 fpn = new Find_Prime_Number4();
		int n1 = 10;
		int rtn1 = 0;
		rtn1 = fpn.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = fpn.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}
	
	public int solution(int n) {
		int answer = 0;
		int tot = 0;
		// ArrayList 로 구현
		ArrayList<Boolean> primeList = new ArrayList<>(n+1);
		
		//0 번 째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		
		// 2 ~ n 까지 소수로 설정
		for (int i=2 ; i <= n; i++) {
			primeList.add(i, true);
		}	
		
		// 2 부터 ~ i*i <=n
		// 각각의 배수들을 지워간다
		for (int i=2 ; (i*i) <= n; i++) {
			if (primeList.get(i) ) {
				for (int j= i*i; j <= n ; j+=i) {
					primeList.set(j,false);
				}
			}
		}
		
		// 출력
		for (int i = 2; i <=n; i++ ) {
			if(primeList.get(i) == true){
				System.out.print(" " + i);
				tot++;
			}	
		}
		System.out.println();	
		answer = tot;
		return answer;
	}
	// => 값은 맞음. 시간 초과
}
