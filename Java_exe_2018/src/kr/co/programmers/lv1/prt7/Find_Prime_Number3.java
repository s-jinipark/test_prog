package kr.co.programmers.lv1.prt7;

public class Find_Prime_Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number3 fpn = new Find_Prime_Number3();
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
		boolean[] a = new boolean[n];
		
		for (int i=2 ; i < n; i++) {
			a[i] = true;
		}	
		
		//루트 처리
		int to = (int)Math.sqrt(n);
			
		for (int i=2 ; i <= to; i++) {
			if (a[i] == true) {
				for (int j= i; j*i <n ; j++) {
					a[i*j] = false;
				}
			}
		}
		
		// 출력
		for (int i = 2; i < n; i++ ) {
			if (a[i]) {
				System.out.print(" " + i);
				tot++;
			}	
		}
		System.out.println();	
		answer = tot;
		return answer;
	}
	// => [2] 값이 틀리게 나옴
}
