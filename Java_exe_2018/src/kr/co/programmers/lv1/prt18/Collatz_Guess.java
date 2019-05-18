package kr.co.programmers.lv1.prt18;

public class Collatz_Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collatz_Guess cg = new Collatz_Guess();
		
		int n1 = 6;
		int rtn1 = cg.solution( n1  );
		System.out.println("[1] > " + rtn1);

		int n2 = 16;
		int rtn2 = cg.solution( n2  );
		System.out.println("[2] > " + rtn2);

		int n3 = 626331;
		int rtn3 = cg.solution( n3  );
		System.out.println("[3] > " + rtn3);
		
	}

	public int solution(int num) {
	    int answer = 0;
		int tmp = num;
		int cnt = 0;
		while (true) {
			if (tmp%2 == 0) {
				// Even
				tmp = tmp/2;
			} else {
				//Odd
				if (tmp == 1) {
					break;
				} else {
					tmp = tmp*3 + 1;
				}	
			}
			cnt ++;

			if (cnt  >= 500) {
				System.out.println(">" + cnt);
				cnt = -1;
				break;
			}
		}
		System.out.println(">>" + cnt);
		answer = cnt;
	    return answer;
	}
	// 3번째 케이스 : 기대값 -> -1, 실제 -> 488
	// 틀림
}
