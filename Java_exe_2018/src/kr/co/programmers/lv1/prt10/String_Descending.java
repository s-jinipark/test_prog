package kr.co.programmers.lv1.prt10;

public class String_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Descending sd = new String_Descending();
		String s1 = "Zbcdefg";
		String rtn1 = "";
		rtn1 = sd.solution( s1  );
		System.out.println("[1] > " + rtn1);
	}

	public String solution(String s) {
	    String answer = "";
	    char tmp_c ;
	    char[] test = s.toCharArray();
	    
	    //for (int i=0; i<test.length; i++) {
	    //	System.out.println(">"+test[i]);
	    //}
	    
 
	    for (int i=0; i<test.length; i++) {

	    	for (int j=i; j<test.length-1; j++) {
	    		System.out.println((int)test[i]+ " / " +(int)test[j]);
	    		if ((int)test[i]>=(int)test[j]) {
	    			tmp_c = test[j];
	    			test[j] = test[i];
	    			test[i] = tmp_c;
	    		}
	    	}
	    }

	    //for (int i=0; i<test.length; i++) {
	    //	System.out.println(">>"+test[i]);
	    //}
	    
	    for (int k=test.length-1; k>=0; k--) {
	    	answer += test[k];
	    }
	    return answer;
	}
}
