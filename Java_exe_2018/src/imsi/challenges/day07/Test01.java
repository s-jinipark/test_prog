package imsi.challenges.day07;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
				
		
		//String rule = "zothf";
		//String A = "otz";
		//String B = "hh";
		String rule = "ab";
		String A = "ba";
		String B = "a";
		
		String an = t.solution(rule, A, B);
		
		System.out.println(an);

	}
	
	public String solution(String rule,  String A, String B) {
		String answer = "";

		// 진법 변환
		int jin = rule.length();
		char[] ch_rule = rule.toCharArray();
		
		String tmp_A = chg_num(ch_rule, A);
		String tmp_B = chg_num(ch_rule, B);
		
		System.out.println(tmp_A + " / " +  tmp_B);
		// 10진수 변환 후 계산
		int i_A = Integer.valueOf(tmp_A, jin);
		int i_B = Integer.valueOf(tmp_B, jin);
		
		System.out.println(i_A + " / " +  i_B);
		
		// 계산
		int i_result = i_A -  i_B;
		
		String tmp_ans = "";
		
		// n진수 로 변환
		while (i_result >= jin) {
			tmp_ans = (i_result%jin) + tmp_ans;
			i_result = i_result/jin;
		}
		//***
		// while (i_result > jin) { 일 경우
		// -> 나누어 떨어질 때 처리를 못함
		
		// 마지막에
		tmp_ans  = i_result + tmp_ans;
		System.out.println(tmp_ans );
		answer = chg_jin(ch_rule, tmp_ans);
		System.out.println(answer );
 		return answer;
    }

	
	public String chg_num(char[] ch_rule, String in) {
		
		String rtn = "";
		
		for (int i=0; i< in.length() ; i++) {
			for (int j=0; j< ch_rule.length ; j++) {
				if (in.charAt(i) == ch_rule[j]) {
					rtn += j;
				}
			}
		}
		return rtn;
	}
	
	public String chg_jin(char[] ch_rule, String in) {
		
		String rtn = "";
		
		for (int i=0; i< in.length() ; i++) {

			rtn += ch_rule[Integer.parseInt( in.charAt(i)+"") ];

		}
		return rtn;
	}
	
}
