package kr.co.programmers.lv1.prt14;

public class Integer_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer_Descending id = new Integer_Descending();
		long n1 = 118372;

		long rtn1 = id.solution( n1  );
		System.out.println("[1] > " + rtn1);
		
	}

	public long solution(long n) {

		long answer = 0;
		
	    String test = n +"";
	    
	    char[] temp = test.toCharArray();
	    
	    for (int i = 0 ; i<temp.length-1; i++) {
	    	for (int j =i; j< temp.length; j++) {
	    		char swap = ' ';
	    		if ( (int)temp[i] < (int)temp[j]  ) {
	    			swap = temp[i];
	    			temp[i] = temp[j];
	    			temp[j] = swap;
	    		}
	    	}
	    	//System.out.println(test.charAt(i) + "");
	    }
	    String convert = "";
	    for (int i = 0 ; i<temp.length; i++) {

	    	//System.out.println(temp[i]);
	    	convert +=temp[i];
	    }
	    
	    answer = new Long(convert);
	    
	    return answer;
	}
	
}
