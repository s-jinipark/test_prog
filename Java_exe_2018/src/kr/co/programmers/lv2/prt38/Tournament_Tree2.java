package kr.co.programmers.lv2.prt38;

public class Tournament_Tree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tournament_Tree2 tt = new Tournament_Tree2();
		
		int n1 = 8;
		int a1 = 4;
		int b1 = 7;
		
		int rtn1 = tt.solution(  n1 , a1 , b1 );
		System.out.println("[1] > " + rtn1 );
		
		
	}

	public int solution(int n, int a, int b) {
		int answer = 0; 
		
		int tmp_cnt = 0;
		int tmp_a = a;
		int tmp_b = b;
		
		while (tmp_a != tmp_b) {
			
			if ( tmp_a %2 == 0 ) { 	// ¦
				tmp_a = tmp_a /2;
			}else {					// Ȧ
				tmp_a = tmp_a /2;
				tmp_a++;
			}
			System.out.println(">" + tmp_a);
			if ( tmp_b %2 == 0 ) {
				tmp_b = tmp_b /2;
			}else {
				tmp_b = tmp_b /2;
				tmp_b++;
			}
			System.out.println(">>" + tmp_b);
			
			tmp_cnt++;			

		}
		answer = tmp_cnt;
		return answer;

    } 
	// 
}
