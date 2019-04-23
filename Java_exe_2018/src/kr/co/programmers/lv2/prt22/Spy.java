package kr.co.programmers.lv2.prt22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spy sp = new Spy();
		
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
        
        HashMap<String, Integer> hm = new HashMap<>(); 
        
        for (int i=0 ; i< clothes.length ; i++) {
        	System.out.println(">" + clothes[i][0] );
        	if ( hm.containsKey(clothes[i][1]) ) {
        		int tmp = 0;
        		tmp = hm.get(clothes[i][1]);
        		hm.put(clothes[i][1], tmp+1);
        	} else {
        		hm.put(clothes[i][1], 1);
        	}
        }
        System.out.println(hm);
        // 
        Set<String> test = hm.keySet();
        Iterator it = test.iterator();
        
        int[] tmp = new int[test.size()];
        int cnt =0;
        while (it.hasNext()) {
        	//System.out.println( it.next() );
        	tmp[cnt++] = hm.get( it.next() );
        }
        // + (µ¡¼À) , * (°ö¼À)
        int multi = 1;
        for (int i=0 ; i < tmp.length ; i++) {
        	answer += tmp[i];
        	multi *= tmp[i];
        }
        
        if (tmp.length > 1) {
        	answer +=multi;
        }
        return answer;
    }
    
}
