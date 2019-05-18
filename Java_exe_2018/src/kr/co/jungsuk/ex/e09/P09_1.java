package kr.co.jungsuk.ex.e09;

public class P09_1 {
	// [9-9] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	/*
		메서드명 : delChar
		기 능 : 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
		반환타입 : String
		매개변수 : String src - 변환할 문자열
			String delCh - 제거할 문자들로 구성된 문자열
	*/

	/*
	(1) delChar메서드를 작성하시오.
	*/
	public static String delChar(String src, String delCh) {
		String rtn_val = "";
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i< src.length() ; i++) {
			//System.out.println(">" + src.charAt(i) );
			char tmp_c = src.charAt(i);
			boolean ok = true;
			for (int j = 0 ; j<delCh.length(); j++) {
				if (tmp_c == delCh.charAt(j)) {
					ok = false;
					break;
				}
			}
			if (ok) sb.append(tmp_c);
		}
		
		rtn_val = sb.toString();
		
		return rtn_val;
	}
		
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}
}