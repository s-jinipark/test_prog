package kr.co.programmers.lv2.prt29;

public class Landing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Landing_Game lg = new Landing_Game();
		
		int[][] land1 = {
				{1,2,3,5},{5,6,7,8},{4,3,2,1}
				};
		int rtn1 = lg.solution( land1  );
		System.out.println("[1] > " + rtn1);


		
	}

	public int solution(int[][] land) {
		int answer = 0;
		int[] sum_t = new int[4];
		//System.out.println("1 : " + land.length);
		for (int i =0 ; i< 4 ; i++) {
			int priv = i;  // 4가지 중 초기 선택
			int sum = 0;
			for (int j = 0; j< land.length; j++) { // 행 만큼 반복 *
				
				System.out.println(">" + i + "/"+ j + " => " + land[j][i]);
				
				// 열을 다 chk , 가장 큰 수 선택
				int big_i = 0;
				for (int k=0; k<4; k++) {
					if (k == priv) continue;
					if ( big_i < land[j][priv] ) {
						big_i = land[j][priv] ;
						priv = k;
					}
				}
				sum += big_i;
			}
			sum_t[i] = sum;
		}
		int big_rtn = 0;
		for (int i=0; i<4 ; i++) {
			System.out.println("=>" + sum_t[i] );
			if (big_rtn < sum_t[i]) big_rtn = sum_t[i];
		}
		answer = big_rtn;
		return answer;

    } 
	// 
}
