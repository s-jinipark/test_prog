package kr.co.programmers.lv1.prt11;

public class Strange_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strange_Character sc = new Strange_Character();
		String s1 = "try hello world";
		String rtn1 = "";
		rtn1 = sc.solution( s1  );
		System.out.println("[1] > " + rtn1);
	}

	public String solution(String s) {
	    String answer = "";
	    String[] test = s.split(" ", -1);
	    
	    //System.out.println(test.length);
	    
	    for (int i =0; i<test.length; i++) {
	    	String tmp = "";
	    	for (int j=0; j<test[i].length(); j++) {
	    		
	    		if (j%2 == 0) { //
	    			//System.out.println(">" + test[i].charAt(j));
	    			tmp += (test[i].charAt(j)+"").toUpperCase();
	    		} else { //
	    			//System.out.println(">>" + test[i].charAt(j));
	    			tmp += (test[i].charAt(j)+"").toLowerCase();
	    		}
	    	}
	    	test[i] = tmp;
	    }
	    
	    StringBuffer sb = new StringBuffer();
	    for (int i =0; i<test.length; i++) {
	    	//System.out.println(">" + test[i]);
	    	//answer += test[i];
	    	sb.append(test[i]);
	    	if (i!=test.length-1) {
	    		//answer += " ";
	    		sb.append(" ");
	    	}
	    }
	    answer = sb.toString();
	    return answer;
	}
}
