package kr.co.programmers.lv1.prt8;

public class Sum_Of_Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum_Of_Divisors sod = new Sum_Of_Divisors();
		int n1 = 12;
		int rtn1 = 0;
		rtn1 = sod.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = sod.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}

	
	public int solution(int n) {
		int answer = 0;
		int tot = 0;
		boolean[] div = new boolean[n+1];
		for (int i=0; i<n+1; i++) {
			div[i] = false; 	// false ·Î ¼ÂÆÃ
		}
		
		for (int i=1; i<=n/2; i++) {
			for (int j=2; j<=n; j++) {
				if (i*j == n) {
					//System.out.print(i + " " + j);
					div[i] = true;
					div[j] = true;
				}
			}
			//System.out.println();
		} 
		
		for (int i=0; i<n+1; i++) {
			if(div[i]) {
				//System.out.println(i);
				tot += i;
			} 
		}
		answer = tot;
		return answer;
	}
	  
}
