package kr.co.programmers.lv2.prt3;

public class TowerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerTest2 t = new TowerTest2();
		
		int[]  h1 = { 6,9,5,7,4 };
		int[] rtn1 = t.solution( h1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0; i<rtn1.length ; i++) {
			System.out.println(">" + rtn1[i]);
		}
		int[]  h2 = { 3,9,9,3,5,7,2 };
		int[] rtn2 = t.solution( h2 );
		System.out.println("[2] > " + rtn2);
	}

	public int[] solution(int[] heights) {
		//int[] answer = {};
		// 프로그래머스 다른 사람 풀이
		int[] answer = new int[heights.length];
		
		for (int i=0 ; i< heights.length ; i++ ) {
			for (int j=i+1; j<heights.length ; j++) {
				// 왼쪽으로 레이저 발사 ?
				if (heights[i] > heights[j]) { // i <- j 발사 방향
					answer[j] = i+1;
				}
				
			}
		}
        return answer;
    }
    
}
