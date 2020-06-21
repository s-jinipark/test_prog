package kr.co.programmers.lv3.prt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Best_album {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best_album ba = new Best_album();
		
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = {500, 600, 150, 800, 2500};
		int[] rtn1 = ba.solution( genres, plays );
		System.out.println("[1] > " + rtn1);

	}


    public int[] solution(String[] genres, int[] plays) {
        //int[] answer = {};
        List<Integer> rtn = new ArrayList<>();
        
        // 해시 , 해시+ArrayList
        Map<String, Integer> map = new HashMap<>();
        Map<String, ArrayList<Album>> listMap = new HashMap<>();
        
        // 적재
        for (int i=0; i<genres.length ; i++) {
        	
        	if (map.containsKey(genres[i])) {
        		int tmp = map.get(genres[i]);
        		map.put(genres[i], tmp+plays[i]);
        		// listMap 에 추가
        		ArrayList<Album> tmp_l = listMap.get(genres[i]);
        		tmp_l.add(new Album(i, plays[i], genres[i]));
        		listMap.put(genres[i], tmp_l);
        	} else { // 신규일 경우
        		map.put(genres[i], plays[i]);
        		ArrayList<Album> tmp_l = new ArrayList<Album>();
        		tmp_l.add(new Album(i, plays[i], genres[i]));
        		listMap.put(genres[i], tmp_l);
        	}
        }
        
        System.out.println(">" + map);
        System.out.println(">" + listMap);

        // 소팅 : HashMap
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
			//System.out.println(temp + " = " + map.get(temp));
			// play 많은 순임
			ArrayList<Album> tmp_l = listMap.get(temp);
			Collections.sort(tmp_l, new Comparator<Album>() {
				@Override
				public int compare(Album o1, Album o2) {
					return o2.plays - o1.plays;
				}
			});
			int limit = tmp_l.size();
			if (limit > 2) {
				limit = 2;
			}
			for (int i= 0 ; i<limit ; i++) {
				System.out.println("->" + tmp_l.get(i).idx);
				rtn.add(tmp_l.get(i).idx);
			}
		}
		int[] answer = new int[rtn.size()];
		for (int i= 0 ; i<answer.length ; i++) {
			answer[i] = rtn.get(i);
		}
        return answer;
    }
        
}

class Album {
	int idx;
	int plays;
	String gen;
	
	Album(	int idx, int plays, String gen) {
		this.idx = idx;
		this.plays = plays;
		this.gen = gen;
	}
}