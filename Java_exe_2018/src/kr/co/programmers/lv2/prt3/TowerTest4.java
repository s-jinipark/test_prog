package kr.co.programmers.lv2.prt3;

import java.util.Stack;

public class TowerTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerTest4 t = new TowerTest4();
		
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

		int[] answer = new int[heights.length];

		// 다시 풀어봄
		Stack<Tower> st = new Stack<>();
		
		for (int i=0 ; i<heights.length ; i++) {
			// 순서대로 수행 
			// 레이저는 왼쪽으로 발사
			// 기존에 있는게 작다 => 빼버림
			// 기존에 있느게 크다 -> 큰 idx 를 answer 에 저장, 스택에 push
			Tower tower = new Tower (i+1, heights[i]);  //  1부터 시작
			int prev_idx = 0;
			
			while (!st.isEmpty()) { // 큐가 비어있지 않을 때 까지
				Tower top = st.peek();
				
				if (top.height > tower.height) {
					prev_idx = top.idx;
					break;
				} else {
					st.pop(); //꺼냄
				}
				
			}
			
			st.push(tower);
			answer[i] = prev_idx;
		}
		
        return answer;
    }
    
}
