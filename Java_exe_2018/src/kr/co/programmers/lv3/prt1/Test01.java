package kr.co.programmers.lv3.prt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		map.put("b", 300);
		map.put("a", 200);
		map.put("c", 100);

		
		System.out.println(map);
		for (String nKey : map.keySet())
		{
			System.out.println(map.get(nKey));
		}
		
		System.out.println("---------------");
		
		//Map
		List<String> list = new ArrayList();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {

				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);

			} 
		} );
		
		Iterator it = list.iterator();
		while(it.hasNext()) {

			String temp = (String) it.next();
			System.out.println(temp + " = " + map.get(temp));

		}
	}

}
