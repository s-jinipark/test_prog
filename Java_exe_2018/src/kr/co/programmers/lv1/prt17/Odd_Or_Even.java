package kr.co.programmers.lv1.prt17;

public class Odd_Or_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_Or_Even ooe = new Odd_Or_Even();
		
		int n1 = 3;
		String rtn1 = ooe.solution( n1  );
		System.out.println("[1] > " + rtn1);
		int n2 = 4;
		String rtn2 = ooe.solution( n2  );
		System.out.println("[2] > " + rtn2);
	}

	public String solution(int num) {

		String answer = "";
		
		if (num%2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
	    return answer;
	}
	
}
