package kr.co.programmers.lv2.prt3;

public class TowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerTest t = new TowerTest();
		
		int[]  h1 = { 6,9,5,7,4 };
		int[] rtn1 = t.solution( h1 );
		System.out.println("[1] > " + rtn1);
		int[]  h2 = { 3,9,9,3,5,7,2 };
		int[] rtn2 = t.solution( h2 );
		System.out.println("[2] > " + rtn2);
	}

	public int[] solution(int[] heights) {
		//int[] answer = {};
		int[] answer = new int[heights.length];
		// 0 으로 setting
		//for (int i =0 ; i < answer.length ; i++) {
		//	answer[i] = 0;
		//}
		
		//왼쪽으로 동시에 레이저 신호를 발사
		for (int i =1 ; i < heights.length ; i++) {
			int tmep_high = heights[i];
			int Num = 0;
			for (int j=i-1 ; j >=0 ; j--) {
				
				if ( heights[j] > tmep_high ) {
					tmep_high = heights[j];
					Num = j + 1; // 몇 번째 탑인지 : 1부터 시작
					break;
				}
			}
			if (tmep_high == heights[i]) {
				answer[i] = 0;
			} else {
				//answer[i] = tmep_high;
				answer[i] = Num;
			}
		}
		for (int i =0 ; i < answer.length ; i++) {
			System.out.println("> " + answer[i] );
		}
        return answer;
    }
    
}
