package kr.co.programmers.lv2.prt38;

public class Tournament_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tournament_Tree tt = new Tournament_Tree();
		
		int n1 = 8;
		int a1 = 4;
		int b1 = 7;
		
		int rtn1 = tt.solution(  n1 , a1 , b1 );
		System.out.println("[1] > " + rtn1 );
		
		
	}

	public int solution(int n, int a, int b) {
		int answer = 1; // 2 번째 부터 while 탐
		
		int tmp_i = n;
		int tmp_a = a;
		int tmp_b = b;
		
		while (true) {
			tmp_i = tmp_i/2;
			tmp_a = tmp_a%tmp_i;
			tmp_b = tmp_b%tmp_i;
			answer++;
			System.out.println(">" + tmp_i + "/" + tmp_a + "/" + tmp_b);
			if (tmp_i == 2) break;
			if (tmp_a+1 == tmp_b) break;
		}
		
		return answer;

    } 
	// 채점 시 -> 오류 발생
}
