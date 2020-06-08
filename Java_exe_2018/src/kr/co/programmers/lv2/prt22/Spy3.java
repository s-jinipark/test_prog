package kr.co.programmers.lv2.prt22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Spy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spy3 sp = new Spy3();
		
		String[][]  c1 = { 
				{"yellow_hat", "headgear"}, 
				{"blue_sunglasses", "eyewear"}, 
				{"green_turban", "headgear"}  };
		
		int rtn1 = sp.solution( c1 );
		System.out.println("[1] > " + rtn1);
		
		String[][]  c2 = { 
				{"crow_mask", "face"},
				{"blue_sunglasses", "face"},
				{"smoky_makeup", "face"}  };
		
		int rtn2 = sp.solution( c2 );
		System.out.println("[2] > " + rtn2);
	}

	public int solution(String[][] clothes) {
		int answer = 0;
		// ** 재연습
		// 결국 종류별로 count 하고
		// 종류별 곱하기.
		Map<String, Integer> hm = new HashMap<>();
        
		for (int i=0; i<clothes.length ; i++) {
			//System.out.println(">" + clothes[i][0] + " / "+ clothes[i][1]);
			if (hm.containsKey(clothes[i][1])) {
				hm.put(clothes[i][1], hm.get(clothes[i][1])+1);
			} else {
				hm.put(clothes[i][1], 1);
			}
		}
		//System.out.println("->" + hm);
		int sum = 1; 
		Iterator<Integer> it = hm.values().iterator();
		
		while(it.hasNext()) {
			//System.out.println(">" + it.next());
			sum *= it.next().intValue()+1;
		}
		//System.out.println("-->" + sum);
		answer = sum -1;
        return answer;
    }
    
}
