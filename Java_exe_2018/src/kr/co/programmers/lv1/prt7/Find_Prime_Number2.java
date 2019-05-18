package kr.co.programmers.lv1.prt7;

public class Find_Prime_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number2 fpn = new Find_Prime_Number2();
		int n1 = 10;
		int rtn1 = 0;
		rtn1 = fpn.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = fpn.solution( n2 );
		System.out.println("[1] > " + rtn2);
		
	}
	
	public int solution(int n) {
		int answer = 0;
		int cnt = 0;
		int tot = 0;
		for (int i=2 ; i <= n; i++) {
			cnt = 0;
			// 제곱근 까지 루프 => ??? 결과 값이 다름
			for (int j=2 ; j < (int)Math.sqrt(i); j++) {

				if (i%j == 0) {
					//System.out.println(i + " / " + j);
					cnt++;
					if (cnt > 1) break;
				}
			}
			if (cnt == 1) {
				tot++;
			}
		}
		answer = tot;	
		return answer;
	}
	// => 값이 틀리게 나옴
}
