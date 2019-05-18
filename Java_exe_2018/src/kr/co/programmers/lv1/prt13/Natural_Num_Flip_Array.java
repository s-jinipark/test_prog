package kr.co.programmers.lv1.prt13;

public class Natural_Num_Flip_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Natural_Num_Flip_Array nnfa = new Natural_Num_Flip_Array();
		int n1 = 12345;

		int[] rtn1 = nnfa.solution( n1  );
		System.out.println("[1] > " + rtn1);
		
	}

	public int[] solution(long n) {


	    String test = n +"";
	    String temp = "";
	    int[] answer = new int[test.length()];
	    //int sum = 0;
	    
	    for (int i = 0 ; i<test.length(); i++) {
	    	//System.out.println( test.charAt(i));
	    	temp = new Integer(test.charAt(i) + "") + temp;
	    }
	    
	    System.out.println(temp);
	    for (int i = 0 ; i<temp.length(); i++) {
	    	//System.out.println( test.charAt(i));
	    	answer[i] = new Integer(temp.charAt(i) + "");
	    }
	    return answer;
	}
	
}
