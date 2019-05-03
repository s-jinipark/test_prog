package kr.co.programmers.lv2.prt30;

public class Representation_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Representation_Numbers rn = new Representation_Numbers();
		
		int n1 = 15;
		int rtn1 = rn.solution( n1  );
		System.out.println("[1] > " + rtn1);


		
	}

	public int solution(int n) {
		int answer = 0;
		int tmp_sum = 0;
		
		for (int i=1 ; i<= n; i++) { // 1부터 n 까지
			for (int j=i; j<= n ; j++ ) {
				tmp_sum += j;
				if (tmp_sum == n) {
					answer++;
					tmp_sum = 0;
					break;
				} else if (tmp_sum > n){
					tmp_sum = 0;
					break;
				}
			}	
		}
		
		return answer;

    } 
	// 
}
