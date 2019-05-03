package kr.co.programmers.lv2.prt28;

public class Correct_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Correct_Parenthesis cp = new Correct_Parenthesis();
		
		String s1 = "()()";
		boolean rtn1 = cp.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "(())()";
		boolean rtn2 = cp.solution( s2  );
		System.out.println("[2] > " + rtn2);

		String s3 = ")()(";
		boolean rtn3 = cp.solution( s3  );
		System.out.println("[3] > " + rtn3);

		String s4 = "(()(";
		boolean rtn4 = cp.solution( s4  );
		System.out.println("[4] > " + rtn4);
		
	}

	public boolean solution(String s) {
		boolean answer = true;
		
		int chk = 0;
		
		for (int i=0; i< s.length() ; i++) {
			
			char tmp_c = s.charAt(i);
			
			if ( tmp_c == '(') {
				chk++;
				
			} else if ( tmp_c == ')') {
				chk--;
			}
			
			if (chk <0) {
				answer = false;
				break;
			}
		}
		
		if (chk > 0) {	// ¸¶Áö¸· chk
			answer = false;
		}
		return answer;

    } 
	// 
}
