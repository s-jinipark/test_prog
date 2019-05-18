package kr.co.programmers.lv1.prt6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort_Strings_As_You_Like2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_Strings_As_You_Like2 ssayl = new Sort_Strings_As_You_Like2();
		
		String[] strings1 = {"sun", "bed", "car"};
		int n1 = 1;
		String[] rtn1 = ssayl.solution(strings1, n1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0 ; i<rtn1.length; i++) {
			System.out.println(" > " + rtn1[i]);
		}
		
		String[] strings2 = {"abce", "abcd", "cdx"};
		int n2 = 2;
		String[] rtn2 = ssayl.solution(strings2, n2 );
		System.out.println("[2] > " + rtn2);
		for (int i=0 ; i<rtn2.length; i++) {
			System.out.println(" > " + rtn2[i]);
		}

		String[] strings3 = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		int n3 = 2;
		String[] rtn3 = ssayl.solution(strings3, n3 );
		System.out.println("[3] > " + rtn3);
		for (int i=0 ; i<rtn3.length; i++) {
			System.out.println(" > " + rtn3[i]);
		}
		
	}

	public String[] solution(String[] strings, int n) {
		
		//String[] answer = {};
		
		List<String> list = new LinkedList<>();
		
		// 정수 n 기준 1글자 뽑기
		// 뽑은 글자와 strings 결합
		for (int i =0; i<strings.length; i++) {
			System.out.println(strings[i].charAt(n) + strings[i]); //?
			list.add(strings[i].charAt(n) + strings[i]);
		}

		// 정수 n 기준 정렬
		Collections.sort(list);
		
		String[]  answer = new String[list.size()];
		
		// strings[i].charAt(n)를 자르고 완전한 단어로 출력
		for (int i=0; i< list.size(); i++) {
			answer[i] = list.get(i).substring(1, list.get(i).length());
		}
	    return answer;
	}
}
