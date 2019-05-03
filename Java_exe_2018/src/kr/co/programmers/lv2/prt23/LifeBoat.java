package kr.co.programmers.lv2.prt23;

import java.util.Arrays;

public class LifeBoat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeBoat lb = new LifeBoat();
		
		int[]  p1 = { 70, 50, 80, 50 };
		int l1 = 100;
		
		int rtn1 = lb.solution( p1 , l1);
		System.out.println("[1] > " + rtn1);
		
		int[]  p2 = { 70, 80, 50 };
		int l2 = 100;
		
		int rtn2 = lb.solution( p2 , l2);
		System.out.println("[2] > " + rtn2);
		
	}

	public int solution(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		int cnt = 0;
		
		// 최대 2명
		for (int i =0 ; i< people.length ; i++) {
			boolean used = false;
			if ( people[i] == 0) continue;
			//System.out.println(">" + i);
			for (int j= people.length -1 ; j > i ; j--) {
				if ( people[j] == 0) continue;
				//System.out.println(" > " + i + " / " + j);
				System.out.println(" > " + people[i] + " / " + people[j] );
				// limit 보다 적으면 get
				if ( ( people[i] + people[j]) <= limit ) {
					people[i] = 0;
					people[j] = 0;
					cnt++;
					used = true;
					break;
				} 
			}
			
			if (! used) {
				people[i] = 0;
				cnt++;
			}
			
		}
		answer = cnt;
        return answer;
    }
    // 시간 초과
}
