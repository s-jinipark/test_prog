package imsi.challenges.day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//int[] arr = {6, 9, 5, 7, 4};
		int[] arr = {3, 9, 9, 3, 5, 7, 2};
		
		int[] an = t.solution(arr);
		
		System.out.println(an);
		for(int i=0 ; i<an.length; i++) {
			System.out.print(an[i] + " ");
		}
	}
	
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];

		for(int i=heights.length-1; i>=0; i--) {
			for (int j= i-1 ; j>=0 ; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j+1;
					break;
				}
			}
		}
		
 		return answer;
    }

	
}
