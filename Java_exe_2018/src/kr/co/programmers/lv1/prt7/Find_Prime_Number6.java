package kr.co.programmers.lv1.prt7;

public class Find_Prime_Number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number6 fpn = new Find_Prime_Number6();
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
		
		boolean[] marked = new boolean[n + 1];

		int nSqrt = (int) Math.sqrt(n);

		for (int i = 2; i <= nSqrt; i++) {
			if (!marked[i]) {

				for (int j = i*i ; j < n + 1; j += i) {
					marked[j] = true;
				}
			}
		}
        
		for (int i = 2; i < n + 1; i++) {
			if (!marked[i] ) {
				System.out.print(i + "  ");
				tot++;
			}
		}
		System.out.println( );
		answer = tot;
		return answer;
	}
	// => Ελ°ϊ
}
