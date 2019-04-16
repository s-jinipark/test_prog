package kr.co.programmers.lv2.prt4;

public class Num_124Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_124Country n124c = new Num_124Country();
		
		//int  n1 = 8;
		//String rtn1 = n124c.solution( n1 );
		//System.out.println("[1] > " + rtn1);
		for (int i= 1 ; i< 111 ; i++) {
			String rtn1 = n124c.solution( i );
			System.out.println("["+i+"] > " + rtn1);
		}
			
		
	}

	public String solution(int n) {
		String answer = "";
		
		// n진수
		int jin = 3;
	    int tmp1 = n;
	    int tmp2 = 0;
	    
	    while (tmp1 > 0) {
		    //tmp1 = tmp1 / jin;
		    tmp2 = tmp1 % jin;
		    tmp1 = tmp1 / jin;
		    //System.out.println(">" + tmp1 +  " / " + tmp2);
		    // **
		    if (tmp2 == 0) tmp1 -= 1;
		    
		    answer = tmp2 + answer;
	    }
	    // 맨 앞
	    //answer = tmp1 + answer;
	    
	    //answer = answer.replaceAll("00", "4");
	    answer = answer.replaceAll("0", "4");
	    return answer;
    }
    
}
