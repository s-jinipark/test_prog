package kr.co.programmers.lv2.prt26;

public class Carpet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carpet2 cr = new Carpet2();
		
		int b1 = 10;
		int r1 = 2;
		int[] rtn1 = cr.solution( b1 , r1 );
		System.out.println("[1] > " + rtn1);
		for (int j= 0 ; j < rtn1.length; j++) {
			System.out.println(">" + rtn1[j] );
		}

		int b2 = 8;
		int r2 = 1;
		int[] rtn2 = cr.solution( b2 , r2 );
		System.out.println("[2] > " + rtn2);
		for (int j= 0 ; j < rtn2.length; j++) {
			System.out.println(">" + rtn2[j] );
		}	
		
		int b3 = 24;
		int r3 = 24;
		int[] rtn3 = cr.solution( b3 , r3 );
		System.out.println("[3] > " + rtn3);
		for (int j= 0 ; j < rtn2.length; j++) {
			System.out.println(">" + rtn3[j] );
		}
	}

	public int[] solution(int brown, int red) {
		int[] answer = {0, 0};
		int tmp_s = brown + red;
		//가로, 세로 크기를 순서대로 배열에 담아 return 
		//boolean tmp_b = false;
		int def = tmp_s;
		for (int i = tmp_s ; i > 1; i--) {	//
			for (int j= 1 ; j < tmp_s; j++) {	// 
				if (tmp_s == (i*j) ) {
					System.out.println(">>" + i + " / " + j + " // " + def);
					
					if ( def > (i-j) && (i>=j) ) {
						//
						answer[0] = i;
						answer[1] = j;
						def = i-j;	 // 차이가 적을 경우
						//tmp_b = true;
						//break;
					}
				}
			}
			//if (tmp_b) break;
		}
        return answer;
    }

}
