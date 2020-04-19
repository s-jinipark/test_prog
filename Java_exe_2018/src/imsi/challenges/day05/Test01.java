package imsi.challenges.day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//String in = "()()";
		//String in = "(())()";
		String in = ")()(";
		//String in = "(()))(()";		
		
		boolean an = t.solution(in);
		
		System.out.println(an);

	}
	
	public boolean solution(String s) {
		boolean answer = true;
		int chk =0;
		
		for(int i=0 ; i< s.length(); i++) {
			char tmp_chr = s.charAt(i);

			if (tmp_chr == '(') {
				chk++;
			} else if (tmp_chr == ')') {
				if (i==0) {
					return false;
				} else {
					chk--;
				}
			}
			// 중간에 - 가 나오면 탈락
			if (chk <0) return false;
		}
		
		if (chk != 0) answer = false;
		
 		return answer;
    }

	
}
