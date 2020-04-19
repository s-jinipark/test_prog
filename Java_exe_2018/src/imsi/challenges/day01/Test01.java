package imsi.challenges.day01;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//String st = "1927";
		//int in	= 2;	// n 개 제거

		String st = "1231234";
		int in	= 3;	
		
		String an = t.solution(st, in);
		
		System.out.println(an);
	}
	
	public String solution(String number, int k) {
		String answer = "";
	
		// 배열에 적재 - 소팅 - 하위 n 개 제외 - 큰 수 찾기
		char[] ch = new char[number.length()];
		
		for (int i = 0; i< number.length() ; i++) {
			ch[i] = number.charAt(i);
		}
		
		Arrays.sort(ch);
		
		StringBuffer sb = new StringBuffer();
		
		for(int j = number.length()-1 ; j>number.length()-1-k; j--) {
			//System.out.println(ch[j]);
			sb.append(ch[j]);
		}
		answer = sb.toString();
		return answer;
    }
	
	// 문제에서는 input 숫자의 순서 유지한 상태에서... => 잘못됨
	// k 가 제외할 갯수인데, k 개만 선택 => X
}
