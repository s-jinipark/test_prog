package imsi.ipc.day06;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		String[][] tkt = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		//String[][] tkt = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
				
		String[] an = t.solution(tkt);
		
		System.out.println(an);
	}
	
    public String[] solution(String[][] tickets) {
        //String[] answer = {};
        
        //for (int i=0; i<tickets.length; i++) {
        //	System.out.println(tickets[i][0] + "/" + tickets[i][1]); 	
        //}
        //System.out.println("-----");
        //Arrays.sort(tickets); //java.lang.String; cannot be cast to java.lang.Comparable
        Arrays.sort(tickets , new Comparator<String[]>() {
        	public int compare( String[] o1, String[] o2 ) {
        		//return o1[0].compareTo( o2[0] );
        		if ( o1[0].compareTo( o2[0] ) > 0) {
        			return 1;
        		} else if ( o1[0].compareTo( o2[0] ) < 0 ) {
        			return -1;
        		} else {//동일한 경우
        			//return 0;
        			return o1[1].compareTo( o2[1] );
        		}
        	}
        });
        
        for (int i=0; i<tickets.length; i++) {
        	System.out.println(tickets[i][0] + "/" + tickets[i][1]); 	
        }
        
        int len = tickets.length; // 갯수
        String[] answer = new String[len+1]; // rtn 은 +1
        // ICN 우선
        String src = "ICN";
        answer[0] = "ICN";
        int cnt = 1;
        while (cnt <= len) {
        	//System.out.println(">");
        	int tmp = nextTarget(src, tickets);
        	System.out.println(tmp + " > " + tickets[tmp][1]);
        	answer[cnt] = tickets[tmp][1];
        	tickets[tmp][0] = "   ";
        	src = tickets[tmp][1];
        	cnt++;
        }
        
        return answer;
    }
	
    public int nextTarget(String src , String[][] tickets) {
    	int rtn = 0;
    	
    	for (int i=0; i<tickets.length ; i++) {
    		if (src.equals(tickets[i][0])) { // src 일치 하는 것
    			rtn = i;
    			break;
    		}
    	}
    	
    	return rtn;
    }
}
