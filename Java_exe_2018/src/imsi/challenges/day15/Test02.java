package imsi.challenges.day15;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
//		String[][] tickets = {
//			{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}
//		};
		
		String[][] tickets = {
			{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, 
			{"ATL", "ICN"}, {"ATL","SFO"}
			};	
				
		String[] an = t.solution(tickets);
		
		System.out.println(an);
    	for (int i=0 ; i<an.length ; i++) {
    		System.out.println("=>"  + an[i]);
    	}
	}
	
    public String[] solution(String[][] tickets) {
    	String[] answer = null;
    	int len = tickets.length;
    	

    	List<String[]> ticket_list = new ArrayList<String[]>();
    	List<String> rtn_list = new ArrayList<String>();
    	
    	for (int i=0 ; i<tickets.length ; i++) {
    		//System.out.println(">" + tickets[i][0] + " / " + tickets[i][1] );
    		// 일단은 List 에 넣어야 할 듯
    		ticket_list.add( tickets[i] );
    	}
    	
    	// 다음 경로를 가져온다
    	String src = "ICN"; // 처음엔 무조건 인천
    	rtn_list.add(src); // ICN
    	while (ticket_list.size() > 0) {
    		//System.out.println( netTargetIdx(next , ticket_list) );
    		int tmp_idx = netTargetIdx(src , ticket_list);
    		//System.out.println( tmp_idx );
        	rtn_list.add(ticket_list.get(tmp_idx)[1]);
        	src = ticket_list.get(tmp_idx)[1]; // 그 다음번의 스타트
        	ticket_list.remove(tmp_idx);
    	}
    	
    	// answer 에 적재
    	answer = new String[rtn_list.size()];
    	for (int i=0 ; i<rtn_list.size() ; i++) {
    		answer[i] = rtn_list.get(i);
    	}
    	
        return answer;
    }

    public int netTargetIdx(String src, List<String[]> ticket_list) {
    	int rtn = 0;
    	String tmp_next = "ZZZ";
    	for (int i=0 ; i<ticket_list.size() ; i++) {
			if (src.equals( ticket_list.get(i)[0] ) ) { // 출발지 같은 것 
				//System.out.println( "->" + ticket_list.get(i)[0] );
				// target 중 가장 앞선 것  ( 동일하면 0 , 앞서면 + 값 나옴  )
				//System.out.println( "..>" + tmp_next.compareTo( ticket_list.get(i)[1] ));
				if ( tmp_next.compareTo( ticket_list.get(i)[1] ) > 0 ) {
					tmp_next = ticket_list.get(i)[1];
					//System.out.println( "->>" + tmp_next );
					rtn = i;
				}
			}
    	}	
    	return rtn;
    }
} 
