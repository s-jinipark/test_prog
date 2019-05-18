package kr.co.programmers.lv1.prt12;

public class Add_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Digits ad = new Add_Digits();
		int n1 = 123;
		int rtn1 = 0;
		rtn1 = ad.solution( n1  );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 987;
		int rtn2 = 0;
		rtn2 = ad.solution( n2  );
		System.out.println("[2] > " + rtn2);
		
	}

	public int solution(int n) {
	    int answer = 0;

	    String test = n +"";
	    int sum = 0;
	    
	    for (int i = 0 ; i<test.length(); i++) {
	    	//System.out.println( test.charAt(i));
	    	sum += new Integer(test.charAt(i) + "");
	    }
	    
	    answer = sum;
	    return answer;
	}
	
}
