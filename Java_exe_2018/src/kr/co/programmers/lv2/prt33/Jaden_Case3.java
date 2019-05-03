package kr.co.programmers.lv2.prt33;

public class Jaden_Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jaden_Case3 jc = new Jaden_Case3();
		
		String s1 = "3people unFollowed me";
		
		String rtn1 = jc.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "for the last week";
		
		String rtn2 = jc.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public String solution(String s) {
		String answer = "";

		char tmp_prv = ' ';
		//System.out.println(">" + (int)tmp_prv );
		// 일단 소문자로 (97 ~ 122) , 공백(32)
		// 대문자 65 ~ 90 (32 차이)
		s = s.toLowerCase();
		String temp = "";
		
		for (int i =0; i< s.length(); i++ ) {
			char tmp_c = s.charAt(i);
			int tmp_i = (int)tmp_c;
			if  ( (tmp_i > 92 && tmp_i < 122) && (tmp_prv == 32) ) {
				//temp += (char)(tmp_i-32);
				temp += Character.toUpperCase(tmp_c);
			} else {
				temp += tmp_c;
			}
			tmp_prv = tmp_c;
		}
		
		answer = temp;
		return answer;

    } 

}
