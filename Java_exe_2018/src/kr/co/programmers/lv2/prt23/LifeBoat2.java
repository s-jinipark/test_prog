package kr.co.programmers.lv2.prt23;

import java.util.ArrayList;
import java.util.Collections;

public class LifeBoat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeBoat2 lb = new LifeBoat2();
		
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
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i =0; i< people.length; i++) {
			al.add(people[i]);
		}
		Collections.sort(al);
		
		int cnt = 0;
		
		// 최대 2명
		//for (int i =0 ; i< al.size() ; i++) {
		while ( ! al.isEmpty() ) {
			
			boolean used = false;
			
			//System.out.println(">" + i);
			for (int j= al.size() -1 ; j > 0 ; j--) {
				
				//System.out.println(" > " + i + " / " + j);
				System.out.println(" > " + al.get(0) + " / " + al.get(j) );
				// limit 보다 적으면 get
				if ( ( al.get(0) + al.get(j) ) <= limit ) {
					al.remove(0);
					al.remove(j);
					cnt++;
					used = true;
					break;
				} 
			}
			
			if (! used) {
				al.remove(0);
				cnt++;
			}
			
		}
		answer = cnt;
        return answer;
    }
    
}
