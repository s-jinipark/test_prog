package kr.co.programmers.lv2.prt23;

import java.util.Arrays;

public class LifeBoat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeBoat4 lb = new LifeBoat4();
		
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
		
		int i = 0, j = people.length - 1;
		for (; i < j; --j) {
			if (people[i] + people[j] <= limit)
				++i;
		}
		return people.length - i;

    }
    // 
}
